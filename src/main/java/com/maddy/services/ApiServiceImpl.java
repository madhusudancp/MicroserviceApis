package com.maddy.services;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.maddy.manager.FibonacciManager;
import com.maddy.manager.MergeArraysManager;
import com.maddy.manager.ReverseLettersManager;
import com.maddy.manager.TriangleTypeManager;

@Service
public class ApiServiceImpl implements ApiService{

	@Override
	public BigInteger getFibonacciNumber(Integer n) {
		return FibonacciManager.getNthFibonacci(n);
	}

	@Override
	public String getCharReversedWords(String sentence) {
		return ReverseLettersManager.getLettersReversedStringUsingBuilder(sentence);
	}

	@Override
	public String getTriangleType(Integer a,Integer b,Integer c) {
		List<Integer> sidesList = TriangleTypeManager.sortSidesOftriangleAsc(a, b, c);
		return TriangleTypeManager.getTriangleType(sidesList);
	}

	@Override
	public Map<String,Integer[]> getCombinedArray(Map<String,Integer[]> arrayMap){
		String combinedArrayKey="Array";
		Map<String,Integer[]> combinedArray = new HashMap<>();
		combinedArray.put(combinedArrayKey,MergeArraysManager.mergeArrays(arrayMap));
		return combinedArray;
	}

}
