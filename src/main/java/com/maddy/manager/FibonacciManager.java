package com.maddy.manager;

import java.math.BigInteger;

public class FibonacciManager {

   private FibonacciManager() {
		
	}
	
	/*
     *  Logic to find Nth Fibonacci number
     *  
     */
	
	public static BigInteger getNthFibonacci(int n)
	    {
            //BigInteger to hold large numerical value i.e say 9000 th fibonacci
		    
		    if(n<0) {
		    	throw new IllegalArgumentException();
		    }
		
		    BigInteger a = BigInteger.valueOf(0);
			BigInteger b = BigInteger.valueOf(1);
			BigInteger c ;
			
			if (n == 0)
	            return a;
	        
			for (int j=2 ; j<=n ; j++)
			{
				c = a.add(b);
				a = b;
				b = c;
			}
			return b;
	    }
}
