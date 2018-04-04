package com.maddy.services;

import java.math.BigInteger;
import java.util.Map;

public interface ApiService {

	
	public BigInteger getFibonacciNumber(Integer n);
	
    public String getCharReversedWords(String sentence);
	
    public String getTriangleType(Integer a,Integer b,Integer c);
    
    public Map<String,Integer[]> getCombinedArray(Map<String,Integer[]> arrayMap);
}
