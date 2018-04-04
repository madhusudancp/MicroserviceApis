package com.maddy.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriangleTypeManager {

	/*
    *  ENUM to store triangle types
    */
	private enum TriangleType {
	    EQUILATERAL, NOTTRIANGLE, ISOSCELES, SCALENE
	}
	
	/*
     *  Logic to determine Triangle type
     *  
     */
	public static String getTriangleType(List<Integer> sidesList) {
		
		String result=TriangleType.NOTTRIANGLE.toString();
		
		Integer side1= sidesList.get(0);
		Integer side2= sidesList.get(1);
		Integer side3= sidesList.get(2);//this will be equal/max length side of Triangle always
		
		   //Check if Triangle can be formed
	        if(checkIfTriangleCanBeFormed(side1,side2,side3))
	        {//yes Triangle can be formed
		            if(checkIfEquilateral(side1,side2,side3))
		               {
		                result= TriangleType.EQUILATERAL.toString();
		               }
		            if(checkIfIsosceles(side1,side2,side3))
		               {
		                result= TriangleType.ISOSCELES.toString();
		               }
		            if(checkIfScalene(side1,side2,side3))
		               {
		                result= TriangleType.SCALENE.toString();
		               }
	           }
	        return result;
	}
	
	/*
    *  Sorting sides of triangle by ascending order 
    *  List size will be 3 Always
    *
    */
   public static List<Integer> sortSidesOftriangleAsc(Integer side1,Integer side2,Integer side3){
	   List<Integer> sidesList = new ArrayList<>();
		sidesList.add(side1);
		sidesList.add(side2);
		sidesList.add(side3);
		Collections.sort(sidesList);
		return sidesList;
   }

   /*The sum of two smaller sides must be greater than the longest side to be a triangle*/
    static Boolean checkIfTriangleCanBeFormed(Integer side1,Integer side2,Integer side3){
    	boolean result = false;
      if((side1 + side2 > side3)) {
    	  result = true;
      }
      return result;
   }
   
   /*To check to see if it an Equilateral triangle (3 equal sides )*/	
    static Boolean checkIfEquilateral(Integer side1,Integer side2,Integer side3) {
    	boolean result = false;
    if((side1==side2) && (side2==side3))
       {
    	result = true;
      }
    return result;
   }
   
   /*To check to see if it is an Isosceles triangle (2 of the same size and 1 different)*/	
    static Boolean checkIfIsosceles(Integer side1,Integer side2,Integer side3) {
	boolean result = false;   
    if ((side1 == side2) && (side2 != side3) || (side2 == side3) && (side3!= side1))
       {
    	result = true;
      }
    return result;
   }
   
   /*To check to see if it is a Scalene triangle (3 different sizes)*/	
    static Boolean checkIfScalene(Integer side1,Integer side2,Integer side3) {
    	boolean result =false;
    	if((side1 != side2) && (side2 != side3))
       {
    		result = true;
      }
    	return result;
   } 
  
   
   
}
