package checkout.checkout_android;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GiropayPaymentTask extends AsyncTask<Void, Void, String> {

    private static final String API_ENDPOINT = "https://api.sandbox.checkout.com/payment-links";
    private static final String API_KEY = "Bearer sk_sbox_o2nulev2arguvyf6w7sc5fkznas";

    private Context context;

    public GiropayPaymentTask(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(Void... voids) {
        Log.d("GiropayPaymentTask", "doInBackground started");
        try {
            // Create the JSON request body
            JSONObject requestBody = new JSONObject();
            requestBody.put("amount", 2000);
            requestBody.put("currency", "EUR");
            requestBody.put("reference", "ORD-123A");
            requestBody.put("billing", new JSONObject()
                    .put("address", new JSONObject()
                            .put("country", "DE")));
            requestBody.put("customer", new JSONObject()
                    .put("name", "John Smith")
                    .put("email", "john.smith@example.com"));
            requestBody.put("return_url", "https://example.com/payments/return");
            Log.d("requestBody", "requestBody " + requestBody);

            // Create the HTTP connection
            URL url = new URL(API_ENDPOINT);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", API_KEY);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            // Send the request
            Log.d("GiropayPaymentTask", "Sending request to API");
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(requestBody.toString().getBytes());
            outputStream.flush();
            outputStream.close();

            // Read the response
            Log.d("GiropayPaymentTask", "Reading response from API");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            Log.d("GiropayPaymentTask", "doInBackground finished");
            return response.toString();
        } catch (IOException | JSONException e) {
            Log.e("GiropayPaymentTask", "Error processing giropay payment", e);
        }

        return null;
    }

    @Override
    protected void onPostExecute(String response) {
        Log.d("GiropayPaymentTask", "API Response: " + response);

        if (response != null) {
            try {
                JSONObject jsonResponse = new JSONObject(response);
                if (jsonResponse.has("_links")) {
                    JSONObject linksObject = jsonResponse.getJSONObject("_links");
                    if (linksObject.has("redirect")) {
                        JSONObject redirectObject = linksObject.getJSONObject("redirect");
                        String redirectUrl = redirectObject.getString("href");
                        // Redirect the user to the provided URL
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(redirectUrl));
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                        return;
                    }
                }
                Log.e("GiropayPaymentTask", "Redirect URL not found in API response");
            } catch (JSONException e) {
                Log.e("GiropayPaymentTask", "Error parsing API response", e);
            }
        }
        // Handle the error case here
        Log.e("GiropayPaymentTask", "Failed to process giropay payment");
    }

}