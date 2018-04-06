package com.maddy.manager;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.util.StringUtils;

public class MergeArraysManager {

	private MergeArraysManager() {
		
	}
	/*
     *  Logic to remove duplicates ,Merge,sort  multiple arrays to sinle array 
     *  
     */
	public static Integer[] mergeArrays(Map<String,Integer[]> mapOfIntArray) {
		if(null==mapOfIntArray || mapOfIntArray.isEmpty()) {
			throw new IllegalArgumentException();
		}
		Set<Integer> resultSet = new HashSet<>();
		//Put elements in a Set for removal of duplicates and default order sorting
		mapOfIntArray.forEach((k,v)->{
			//Key is empty/null/whitespace
			if(StringUtils.isEmpty(k) || k.trim().isEmpty()){
				  throw new IllegalArgumentException();
			  }
			//value is null/empty
			if(null==v || 0==v.length) {
				throw new IllegalArgumentException();
			}
			resultSet.addAll(Arrays.asList(v));
		});
		return resultSet.toArray(new Integer[resultSet.size()]);
	}
}
