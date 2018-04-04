package com.maddy.manager;

import static org.junit.Assert.assertArrayEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
/*
*Unit tests for MergeArraysManager
*/
public class TestMergeArraysManager {

	
	@Test
	public void testMergeArrays() {
	  
		Map<String,Integer[]> arrayMap = new HashMap<>();
		arrayMap.put("Array1", new Integer[] {1,3,7,2});
		arrayMap.put("Array2", new Integer[] {5,8,6,9});
		arrayMap.put("Array3", new Integer[] {3,4,2,5});
		// test for 0,1,2
		Integer[] expected = new Integer[] {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(expected,MergeArraysManager.mergeArrays(arrayMap));
	}
	
	
	
	
}
