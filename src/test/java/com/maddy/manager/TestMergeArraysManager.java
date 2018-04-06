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
	
	
	@Test(expected=IllegalArgumentException.class)
	 public void expectedIllegalArgumentException() {
		       MergeArraysManager.mergeArrays(null);
	         }
	
	@Test(expected=IllegalArgumentException.class)
	 public void expectedIllegalArgumentExceptionForEmptyArray() {
		Map<String,Integer[]> arrayMap = new HashMap<>();
		arrayMap.put("Array1", new Integer[] {});
		       MergeArraysManager.mergeArrays(arrayMap);
	         }
	
	//Array cannot have null/empty values or keys
	@Test(expected=IllegalArgumentException.class)
	 public void expectedIllegalArgumentExceptionForNullArray() {
		Map<String,Integer[]> arrayMap = new HashMap<>();
		arrayMap.put("Array1", null);
		       MergeArraysManager.mergeArrays(arrayMap);
	         }

	@Test(expected=IllegalArgumentException.class)
	 public void expectedIllegalArgumentExceptionForNullKey() {
		Map<String,Integer[]> arrayMap = new HashMap<>();
		arrayMap.put(null, new Integer[] {1});
		       MergeArraysManager.mergeArrays(arrayMap);
	         }
	

	@Test(expected=IllegalArgumentException.class)
	 public void expectedIllegalArgumentExceptionForEmptyKey() {
		Map<String,Integer[]> arrayMap = new HashMap<>();
		arrayMap.put(" ", new Integer[] {1});
		       MergeArraysManager.mergeArrays(arrayMap);
	         }

}

