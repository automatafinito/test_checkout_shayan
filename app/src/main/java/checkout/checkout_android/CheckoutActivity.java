package checkout.checkout_android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

import java.text.NumberFormat;
import java.util.Locale;

public class CheckoutActivity extends Activity {
	private Button cvvToknizationButton;
	private Button buyButton1;
	private Button buyButton2;
	private Button buyButton3;
	private ImageView appLogoImageView;
	private Button giropayButton;

	@SuppressLint("CutPasteId")
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_checkout);
		appLogoImageView = findViewById(R.id.appLogoImageView);
		// Dynamically change the logo at runtime
		appLogoImageView.setImageResource(R.drawable.logo_image);
		buyButton1 = findViewById(R.id.button_buy1);
		buyButton2 = findViewById(R.id.button_buy2);
		buyButton3 = findViewById(R.id.button_buy3);
		giropayButton = findViewById(R.id.button_giropay); // New button initialization

		initItemUI("T-Shirt 1", 1999, R.drawable.tshirt1_image, buyButton1);
		initItemUI("T-Shirt 2", 2499, R.drawable.tshirt2_image, buyButton2);
		initItemUI("T-Shirt 3", 2999, R.drawable.tshirt3_image, buyButton3);

		buyButton1.setOnClickListener(v -> onBuyButtonClicked("T-Shirt 1"));
		buyButton2.setOnClickListener(v -> onBuyButtonClicked("T-Shirt 2"));
		buyButton3.setOnClickListener(v -> onBuyButtonClicked("T-Shirt 3"));
		giropayButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				onGiropayButtonClicked();
			}
		});
	}

	private void initItemUI(String name, long price, @DrawableRes int imageResource, Button buyButton) {
		TextView itemName = findViewById(R.id.text_item_name);

		ImageView itemImage;
		int imageViewId;

		if (buyButton.getId() == R.id.button_buy1) {
			imageViewId = R.id.tshirt1ImageView;
		} else if (buyButton.getId() == R.id.button_buy2) {
			imageViewId = R.id.tshirt2ImageView;
		} else if (buyButton.getId() == R.id.button_buy3) {
			imageViewId = R.id.tshirt3ImageView;
		} else {
			// Handle the case where the button ID is unknown
			return;
		}

		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
		buyButton.setText(getString(R.string.button_buy) + numberFormat.format((double) price / 100));
	}

	private void onBuyButtonClicked(String itemName) {
		// Implement your buy logic here, you can use the itemName parameter to identify which item was clicked
		Intent intent = new Intent(this, DemoActivity.class);
		intent.putExtra("item_name", itemName);
		startActivity(intent);
	}

	private void onGiropayButtonClicked() {
		// Execute the GiropayPaymentTask
		GiropayPaymentTask giropayPaymentTask = new GiropayPaymentTask(this);
		giropayPaymentTask.execute();
	}
}