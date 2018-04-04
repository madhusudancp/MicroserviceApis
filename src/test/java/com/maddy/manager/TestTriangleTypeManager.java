package com.maddy.manager;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
*Unit tests for TriangleTypeManager
*/
public class TestTriangleTypeManager {
	
	
	@Test
	public void TestgetTriangleType() {
		
		List<Integer> expected = Arrays.asList(3,4,5);
		assertEquals("SCALENE",TriangleTypeManager.getTriangleType(expected));
		
		expected = Arrays.asList(5,5,5);
		assertEquals("EQUILATERAL",TriangleTypeManager.getTriangleType(expected));
		
		expected = Arrays.asList(2,2,3);
		assertEquals("ISOSCELES",TriangleTypeManager.getTriangleType(expected));
		
		expected = Arrays.asList(2,2,10);
		assertEquals("NOTTRIANGLE",TriangleTypeManager.getTriangleType(expected));
	}

	@Test
	public void TestSortSidesOftriangleAsc() {
	        List<Integer> expected = Arrays.asList(5,10,20);
	        //Test equal after sorting sides
	        assertThat(expected, is(TriangleTypeManager.sortSidesOftriangleAsc(10,20,5)));
	}
	

	@Test
	public void TestcheckIfTriangleCanBeFormed() {
		
		//values for forming triangle
		Integer side1= 5;
		Integer side2= 5;
		Integer side3= 5;
		assertTrue(TriangleTypeManager.checkIfTriangleCanBeFormed(side1,side2,side3));
		//values for not forming triangle
		 side1= 2;
		 side2= 1;
		 side3= 4;
		assertFalse(TriangleTypeManager.checkIfTriangleCanBeFormed(side1,side2,side3));
	}
	
	@Test
	public void TestCheckcheckIfEquilateral() {
		
		//values for forming Equilateral triangle
		Integer side1= 5;
		Integer side2= 5;
		Integer side3= 5;
		assertTrue(TriangleTypeManager.checkIfEquilateral(side1,side2,side3));
		//values for not forming Equilateral triangle
		 side1= 3;
		 side2= 4;
		 side3= 5;
		assertFalse(TriangleTypeManager.checkIfEquilateral(side1,side2,side3));
	}
	
	@Test
	public void TestCheckIfIsosceles() {
		
		//values for Isosceles triangle
		Integer side1= 2;
		Integer side2= 2;
		Integer side3= 3;
		assertTrue(TriangleTypeManager.checkIfIsosceles(side1,side2,side3));
		//values for not Isosceles triangle
		 side1= 3;
		 side2= 4;
		 side3= 5;
		assertFalse(TriangleTypeManager.checkIfIsosceles(side1,side2,side3));
	}
	
	
	@Test
	public void TestCheckIfScalene() {
		//values for Scelene triangle
		Integer side1= 3;
		Integer side2= 4;
		Integer side3= 5;
		assertTrue(TriangleTypeManager.checkIfScalene(side1,side2,side3));
		//values for not Scelene triangle
		 side1= 2;
		 side2= 2;
		 side3= 4;
		assertFalse(TriangleTypeManager.checkIfScalene(side1,side2,side3));
	}
	
}
