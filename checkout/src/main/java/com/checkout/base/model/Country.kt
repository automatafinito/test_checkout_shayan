package com.checkout.base.model

public enum class Country(
    public val iso3166Alpha2: String,
    public val dialingCode: String
) {
    AFGHANISTAN("AF", "93"),
    ALAND_ISLANDS("AX", "358"),
    ALBANIA("AL", "355"),
    ALGERIA("DZ", "213"),
    AMERICAN_SAMOA("AS", "1684"),
    ANDORRA("AD", "376"),
    ANGOLA("AO", "244"),
    ANGUILLA("AI", "1264"),
    ANTARCTICA("AQ", "672"),
    ANTIGUA_AND_BARBUDA("AG", "1268"),
    ARGENTINA("AR", "54"),
    ARMENIA("AM", "374"),
    ARUBA("AW", "297"),
    ASCENSION_ISLAND("AC", "247"),
    AUSTRALIA("AU", "61"),
    AUSTRIA("AT", "43"),
    AZERBAIJAN("AZ", "994"),
    BAHAMAS("BS", "1242"),
    BAHRAIN("BH", "973"),
    BANGLADESH("BD", "880"),
    BARBADOS("BB", "1246"),
    BELARUS("BY", "375"),
    BELGIUM("BE", "32"),
    BELIZE("BZ", "501"),
    BENIN("BJ", "229"),
    BERMUDA("BM", "1441"),
    BHUTAN("BT", "975"),
    BOLIVIA("BO", "591"),
    BONAIRE("BQ", "5997"),
    BOSNIA_AND_HERZEGOVINA("BA", "387"),
    BOTSWANA("BW", "267"),
    BOUVET_ISLAND("BV", ""),
    BRAZIL("BR", "55"),
    BRITISH_INDIAN_OCEAN_TERRITORY("IO", "246"),
    BRUNEI_DARUSSALAM("BN", "673"),
    BULGARIA("BG", "359"),
    BURKINA_FASO("BF", "226"),
    BURUNDI("BI", "257"),
    CAMBODIA("KH", "855"),
    CAMEROON("CM", "237"),
    CANADA("CA", "1"),
    CAPE_VERDE("CV", "238"),
    CAYMAN_ISLANDS("KY", "1345"),
    CENTRAL_AFRICAN_REPUBLIC("CF", "236"),
    CHAD("TD", "235"),
    CHILE("CL", "56"),
    CHINA("CN", "86"),
    CHRISTMAS_ISLAND("CX", "61"),
    COCOS_ISLANDS("CC", "61"),
    COLOMBIA("CO", "57"),
    COMOROS("KM", "269"),
    CONGO_BRAZZAVILLE("CG", "242"),
    COOK_ISLANDS("CK", "682"),
    COSTA_RICA("CR", "506"),
    CROATIA("HR", "385"),
    CUBA("CU", "53"),
    CURACAO("CW", "5999"),
    CYPRUS("CY", "357"),
    CZECH_REPUBLIC("CZ", "420"),
    CONGO_KINSHASA("CD", "243"),
    DENMARK("DK", "45"),
    DJIBOUTI("DJ", "253"),
    DOMINICA("DM", "1767"),
    DOMINICAN_REPUBLIC("DO", "1849"),
    ECUADOR("EC", "593"),
    EGYPT("EG", "20"),
    EL_SALVADOR("SV", "503"),
    EQUATORIAL_GUINEA("GQ", "240"),
    ERITREA("ER", "291"),
    ESTONIA("EE", "372"),
    SWAZILAND("SZ", "268"),
    ETHIOPIA("ET", "251"),
    FALKLAND_ISLANDS("FK", "500"),
    FAROE_ISLANDS("FO", "298"),
    FIJI("FJ", "679"),
    FINLAND("FI", "358"),
    FRANCE("FR", "33"),
    FRENCH_GUIANA("GF", "594"),
    FRENCH_POLYNESIA("PF", "689"),
    FRENCH_SOUTHERN_ANTARCTIC_LANDS("TF", "590"),
    GABON("GA", "241"),
    GAMBIA("GM", "220"),
    GEORGIA("GE", "995"),
    GERMANY("DE", "49"),
    GHANA("GH", "233"),
    GIBRALTAR("GI", "350"),
    GREECE("GR", "30"),
    GREENLAND("GL", "299"),
    GRENADA("GD", "1473"),
    GUADELOUPE("GP", "590"),
    GUAM("GU", "1671"),
    GUATEMALA("GT", "502"),
    GUERNSEY("GG", "44"),
    GUINEA("GN", "224"),
    GUINEA_BISSAU("GW", "245"),
    GUYANA("GY", "592"),
    HAITI("HT", "509"),
    HEARD_ISLANDS_MCDONALD_ISLANDS("HM", ""),
    HONDURAS("HN", "504"),
    HONG_KONG("HK", "852"),
    HUNGARY("HU", "36"),
    ICELAND("IS", "354"),
    INDIA("IN", "91"),
    INDONESIA("ID", "62"),
    IRAN("IR", "98"),
    IRAQ("IQ", "964"),
    IRELAND("IE", "353"),
    ISLE_OF_MAN("IM", "44"),
    ISRAEL("IL", "972"),
    ITALY("IT", "39"),
    COTE_D_IVOIRE("CI", "225"),
    JAMAICA("JM", "1876"),
    JAPAN("JP", "81"),
    JERSEY("JE", "44"),
    JORDAN("JO", "962"),
    KAZAKHSTAN("KZ", "77"),
    KENYA("KE", "254"),
    KIRIBATI("KI", "686"),
    KOREA_NORTH("KP", "850"),
    KOREA_SOUTH("KR", "82"),
    KUWAIT("KW", "965"),
    KYRGYZSTAN("KG", "996"),
    LAO_PDR("LA", "856"),
    LATVIA("LV", "371"),
    LEBANON("LB", "961"),
    LESOTHO("LS", "266"),
    LIBERIA("LR", "231"),
    LIBYA("LY", "218"),
    LIECHTENSTEIN("LI", "423"),
    LITHUANIA("LT", "370"),
    LUXEMBOURG("LU", "352"),
    MACAO("MO", "853"),
    MADAGASCAR("MG", "261"),
    MALAWI("MW", "265"),
    MALAYSIA("MY", "60"),
    MALDIVES("MV", "960"),
    MALI("ML", "223"),
    MALTA("MT", "356"),
    MARSHALL_ISLANDS("MH", "692"),
    MARTINIQUE("MQ", "596"),
    MAURITANIA("MR", "222"),
    MAURITIUS("MU", "230"),
    MAYOTTE("YT", "262"),
    MEXICO("MX", "52"),
    MICRONESIA("FM", "691"),
    MOLDOVA("MD", "373"),
    MONACO("MC", "377"),
    MONGOLIA("MN", "976"),
    MONTENEGRO("ME", "382"),
    MONTSERRAT("MS", "1664"),
    MOROCCO("MA", "212"),
    MOZAMBIQUE("MZ", "258"),
    MYANMAR("MM", "95"),
    NAMIBIA("NA", "264"),
    NAURU("NR", "674"),
    NEPAL("NP", "977"),
    NETHERLANDS("NL", "31"),
    NETHERLANDS_ANTILLES("AN", "599"),
    NEW_CALEDONIA("NC", "687"),
    NEW_ZEALAND("NZ", "64"),
    NICARAGUA("NI", "505"),
    NIGER("NE", "227"),
    NIGERIA("NG", "234"),
    NIUE("NU", "683"),
    NORFOLK_ISLAND("NF", "672"),
    MACEDONIA("MK", "389"),
    NORTHERN_MARIANA_ISLANDS("MP", "1670"),
    NORWAY("NO", "47"),
    OMAN("OM", "968"),
    PAKISTAN("PK", "92"),
    PALAU("PW", "680"),
    PANAMA("PA", "507"),
    PAPUA_NEW_GUINEA("PG", "675"),
    PARAGUAY("PY", "595"),
    PERU("PE", "51"),
    PHILIPPINES("PH", "63"),
    PITCAIRN("PN", "872"),
    POLAND("PL", "48"),
    PORTUGAL("PT", "351"),
    PUERTO_RICO("PR", "1939"),
    QATAR("QA", "974"),
    REUNION("RE", "262"),
    RO("RO", "40"),
    ROMANIA("RU", "7"),
    RWANDA("RW", "250"),
    SAINT_BARTHELEMY("BL", "590"),
    SAINT_HELENA("SH", "290"),
    SAINT_KITTS_AND_NEVIS("KN", "1869"),
    SAINT_LUCIA("LC", "1758"),
    SAINT_MARTIN("MF", "590"),
    SAINT_PIERRE_AND_MIQUELON("PM", "508"),
    SAINT_VINCENT_AND_GRENADINES("VC", "1784"),
    SAMOA("WS", "685"),
    SAN_MARINO("SM", "378"),
    SAO_TOME_AND_PRINCIPE("ST", "239"),
    SAUDI_ARABIA("SA", "966"),
    SENEGAL("SN", "221"),
    SERBIA("RS", "381"),
    SEYCHELLES("SC", "248"),
    SIERRA_LEONE("SL", "232"),
    SINGAPORE("SG", "65"),
    SINT_MAARTEN("SX", "1721"),
    SLOVAKIA("SK", "421"),
    SLOVENIA("SI", "386"),
    SOLOMON_ISLANDS("SB", "677"),
    SOMALIA("SO", "252"),
    SOUTH_AFRICA("ZA", "27"),
    SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS("GS", "500"),
    SOUTH_SUDAN("SS", "211"),
    SPAIN("ES", "34"),
    SRI_LANKA("LK", "94"),
    SUDAN("SD", "249"),
    SURINAME("SR", "597"),
    SVALBARD_AND_JAN_MAYEN_ISLANDS("SJ", "47"),
    SWEDEN("SE", "46"),
    SWITZERLAND("CH", "41"),
    SYRIA("SY", "963"),
    TAIWAN("TW", "886"),
    TAJIKISTAN("TJ", "992"),
    TANZANIA("TZ", "255"),
    THAILAND("TH", "66"),
    TIMOR_LESTE("TL", "670"),
    TOGO("TG", "228"),
    TOKELAU("TK", "690"),
    TONGA("TO", "676"),
    TRINIDAD_AND_TOBAGO("TT", "1868"),
    TRISTAN_DA_CUNHA("TA", "2908"),
    TUNISIA("TN", "216"),
    TURKEY("TR", "90"),
    TURKMENISTAN("TM", "993"),
    TURKS_AND_CAICOS_ISLANDS("TC", "1649"),
    TUVALU("TV", "688"),
    UGANDA("UG", "256"),
    UKRAINE("UA", "380"),
    UNITED_ARAB_EMIRATES("AE", "971"),
    UNITED_KINGDOM("GB", "44"),
    UNITED_STATES_OF_AMERICA("US", "1"),
    US_MINOR_OUTLYING_ISLANDS("UM", "246"),
    URUGUAY("UY", "598"),
    UZBEKISTAN("UZ", "998"),
    VANUATU("VU", "678"),
    VATICAN_CITY("VA", "379"),
    VENEZUELA("VE", "58"),
    VIETNAM("VN", "84"),
    BRITISH_VIRGIN_ISLANDS("VG", "1284"),
    VIRGIN_ISLANDS("VI", "1340"),
    WALLIS_AND_FUTUNA_ISLANDS("WF", "681"),
    WESTERN_SAHARA("EH", "2125288"),
    YEMEN("YE", "967"),
    ZAMBIA("ZM", "260"),
    ZIMBABWE("ZW", "263");

    public companion object {

        @JvmStatic
        public fun from(iso3166Alpha2: String?): Country? {

            val country: Country? = values().firstOrNull {
                it.iso3166Alpha2.equals(iso3166Alpha2, true)
            }

            return country
        }

        internal fun getCountry(dialingCode: String?, iso3166Alpha2: String?): Country? {
            val country: Country? = values().firstOrNull { country ->
                country.dialingCode.equals(dialingCode, true) &&
                        country.iso3166Alpha2.equals(iso3166Alpha2, true)
            }

            return country
        }
    }
}
