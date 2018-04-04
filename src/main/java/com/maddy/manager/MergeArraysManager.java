package com.maddy.manager;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MergeArraysManager {

	private MergeArraysManager() {
		
	}
	/*
     *  Logic to remove duplicates ,Merge,sort  multiple arrays to sinle array 
     *  
     */
	public static Integer[] mergeArrays(Map<String,Integer[]> mapOfIntArray) {
		
		Set<Integer> resultSet = new HashSet<>();
		//Put elements in a Set for removal of duplicates and default order sorting
		mapOfIntArray.forEach((k,v)->
			resultSet.addAll(Arrays.asList(v)));
		return resultSet.toArray(new Integer[resultSet.size()]);
	}
}
