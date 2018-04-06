package com.maddy.manager;

import org.springframework.util.StringUtils;

public class ReverseLettersManager {
     
	private ReverseLettersManager() {
		
	}
	static final String REGX =" ";
	
	/*
     *  Logic to reverse letters of words in given string
     *  
     */
	public static String getLettersReversedString(String sourceString) {
		
		  if(StringUtils.isEmpty(sourceString)|| sourceString.trim().isEmpty()){
			  throw new IllegalArgumentException();
		  }
		
		 String[] strArray = sourceString.split(REGX);
	     StringBuilder reversedString = new StringBuilder();
	     for (int i = 0; i < strArray.length; i++)
	     {
	         for (int s = strArray[i].length()-1; s >= 0; s--)
	         {
	        	 reversedString.append(strArray[i].charAt(s));
	         }
	         reversedString.append(REGX);
	     }
	     return reversedString.toString().trim();
	
	}

	public static String getLettersReversedStringUsingBuilder(String sourceString) {
		
		if(StringUtils.isEmpty(sourceString) || sourceString.trim().isEmpty()){
			  throw new IllegalArgumentException();
		  }
		 //to hold reversed string
		 StringBuilder reversedString = new StringBuilder();
		 //split string by space and reverse using StringBuilder method
		 for(String subStr :sourceString.split(REGX)) {
			 reversedString.append(new StringBuilder(subStr).reverse()).append(REGX);
		 }
		 return reversedString.toString().trim();
	}
	
	
	
}
