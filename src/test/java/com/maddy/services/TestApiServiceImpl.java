package com.maddy.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.maddy.exceptions.ServiceException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApiServiceImpl {

	
	@Autowired
	ApiService apiService;
	
	@Test
	public void TestGetCharReversedWords() {
		String exp = "woH era uoy";
		String found = apiService.getCharReversedWords("How are you");
	     assertThat(found).isEqualTo(exp);
	 }
	
	 @Test(expected=ServiceException.class)
	 public void expectedServiceExceptionForNull() {
		 apiService.getCharReversedWords(null);
	         }
	
	
	@Test
	public void TestGetFibonacciNumber() {
		BigInteger exp = new BigInteger("55");
		BigInteger found = apiService.getFibonacciNumber(10);
	     assertThat(found).isEqualTo(exp);
	 }
	
	
	@Test
	public void TestGetTriangleType() {
		String exp = "SCALENE";
		String found = apiService.getTriangleType(3, 4, 5);
	     assertThat(found).isEqualTo(exp);
	 }
	
	 //Sides of triangles cannot be 0 or negative
		@Test(expected=ServiceException.class)
		 public void expectedServiceException() {
			apiService.getTriangleType(1,0,0);
		         }

	@Test
	public void TestGetCombinedArray() {
	Map<String,Integer[]> arrayMap = new HashMap<>();
	arrayMap.put("Array1", new Integer[] {1,3,2});
	arrayMap.put("Array2", new Integer[] {7,6,8});
	arrayMap.put("Array3", new Integer[] {9,4,5});
	Map<String,Integer[]> expected = apiService.getCombinedArray(arrayMap);
	expected.forEach((k,v)->{
		Integer[] exp = new Integer[] {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(exp,v);
		assertEquals("Array", k);;
	});
	}
	
	@Test(expected=ServiceException.class)
	 public void expectedServiceExceptionGetCombinedArray() {
		apiService.getCombinedArray(null);
	         }
	
	
}
