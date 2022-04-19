package com.bookstore.utility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndiaConstants {

	public final static String INDIA = "IND";

	
	public final static Map<String, String> mapOfINDIAStates = new HashMap<String, String>() {
		{
			put("AP", "Andhra Pradesh");
			put("ARP", "Arunachal Pradesh");
			put("AS", "Assam");
			put("BI", "Bihar");
			put("CH", "Chhattisgarh");
			put("DEL", "Delhi");
			put("GOA", "Goa");
			put("GJ", "	Gujarat");
			put("HA", "Haryana");
			put("HP", "	Himachal Pradesh");
			put("JK", "Jammu and Kashmir");
			put("JH", "Jharkhand");
			put("KR", "Karnataka");
			put("KE", "Kerala");
			put("MP", "	Madhya Pradesh");
			put("MH", "Maharashtra");
			put("MN", "	Manipur");
			put("MG", "	Meghalaya");
			put("MZ", "	Mizoram");
			put("NG", "	Nagaland");
			put("OR", "	Orissa");
			put("PJ", "Punjab");
			put("RJ", "	Rajasthan");
			put("SK", "Sikkim");
			put("TN", "Tamil Nadu");
			put("TR", "Tripura");
			put("UP", "Uttar Pradesh");
			put("UT", "	Uttarakhand");
			put("WB", "West Bengal");
			put("TE", "	Telangana");
			
		
		}
	};
	public final static List<String> listOfINDIAStatesCode = new ArrayList<>(mapOfINDIAStates.keySet());
	public final static List<String> listOfINDIAStatesName = new ArrayList<>(mapOfINDIAStates.values());

}
