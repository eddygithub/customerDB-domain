package com.prudent.domain.util;

import java.util.HashMap;
import java.util.Map;

public class StateUtil {
	public static final Map<String, String> stateCodeMap = new HashMap<String, String>();
	{
		stateCodeMap.put("Alabama", "AL");
		stateCodeMap.put("Alaska", "AK");
		stateCodeMap.put("Alberta", "AB");
		stateCodeMap.put("American Samoa", "AS");
		stateCodeMap.put("Arizona", "AZ");
		stateCodeMap.put("Arkansas", "AR");
		stateCodeMap.put("Armed Forces (AE)", "AE");
		stateCodeMap.put("Armed Forces Americas", "AA");
		stateCodeMap.put("Armed Forces Pacific", "AP");
		stateCodeMap.put("British Columbia", "BC");
		stateCodeMap.put("California", "CA");
		stateCodeMap.put("Colorado", "CO");
		stateCodeMap.put("Connecticut", "CT");
		stateCodeMap.put("Delaware", "DE");
		stateCodeMap.put("District Of Columbia", "DC");
		stateCodeMap.put("Florida", "FL");
		stateCodeMap.put("Georgia", "GA");
		stateCodeMap.put("Guam", "GU");
		stateCodeMap.put("Hawaii", "HI");
		stateCodeMap.put("Idaho", "ID");
		stateCodeMap.put("Illinois", "IL");
		stateCodeMap.put("Indiana", "IN");
		stateCodeMap.put("Iowa", "IA");
		stateCodeMap.put("Kansas", "KS");
		stateCodeMap.put("Kentucky", "KY");
		stateCodeMap.put("Louisiana", "LA");
		stateCodeMap.put("Maine", "ME");
		stateCodeMap.put("Manitoba", "MB");
		stateCodeMap.put("Maryland", "MD");
		stateCodeMap.put("Massachusetts", "MA");
		stateCodeMap.put("Michigan", "MI");
		stateCodeMap.put("Minnesota", "MN");
		stateCodeMap.put("Mississippi", "MS");
		stateCodeMap.put("Missouri", "MO");
		stateCodeMap.put("Montana", "MT");
		stateCodeMap.put("Nebraska", "NE");
		stateCodeMap.put("Nevada", "NV");
		stateCodeMap.put("New Brunswick", "NB");
		stateCodeMap.put("New Hampshire", "NH");
		stateCodeMap.put("New Jersey", "NJ");
		stateCodeMap.put("New Mexico", "NM");
		stateCodeMap.put("New York", "NY");
		stateCodeMap.put("Newfoundland", "NF");
		stateCodeMap.put("North Carolina", "NC");
		stateCodeMap.put("North Dakota", "ND");
		stateCodeMap.put("Northwest Territories", "NT");
		stateCodeMap.put("Nova Scotia", "NS");
		stateCodeMap.put("Nunavut", "NU");
		stateCodeMap.put("Ohio", "OH");
		stateCodeMap.put("Oklahoma", "OK");
		stateCodeMap.put("Ontario", "ON");
		stateCodeMap.put("Oregon", "OR");
		stateCodeMap.put("Pennsylvania", "PA");
		stateCodeMap.put("Prince Edward Island", "PE");
		stateCodeMap.put("Puerto Rico", "PR");
		stateCodeMap.put("Quebec", "PQ");
		stateCodeMap.put("Rhode Island", "RI");
		stateCodeMap.put("Saskatchewan", "SK");
		stateCodeMap.put("South Carolina", "SC");
		stateCodeMap.put("South Dakota", "SD");
		stateCodeMap.put("Tennessee", "TN");
		stateCodeMap.put("Texas", "TX");
		stateCodeMap.put("Utah", "UT");
		stateCodeMap.put("Vermont", "VT");
		stateCodeMap.put("Virgin Islands", "VI");
		stateCodeMap.put("Virginia", "VA");
		stateCodeMap.put("Washington", "WA");
		stateCodeMap.put("West Virginia", "WV");
		stateCodeMap.put("Wisconsin", "WI");
		stateCodeMap.put("Wyoming", "WY");
		stateCodeMap.put("Yukon Territory", "YT");
	}

	// This class should be a singleton
	private StateUtil() {
	}

	public static String getStateCode(String state) {
		return stateCodeMap.get(state);
	}
}
