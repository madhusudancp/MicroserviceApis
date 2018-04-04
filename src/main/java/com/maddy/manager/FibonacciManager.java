package com.maddy.manager;

import java.math.BigInteger;

public class FibonacciManager {

	/*
     *  Logic to find Nth Fibonacci number
     *  
     */
	public static BigInteger getNthFibonacci(int n)
	    {
            //BigInteger to hold large numerical value i.e say 9000 th fibonacci
		    
		    BigInteger a = BigInteger.valueOf(0);
			BigInteger b = BigInteger.valueOf(1);
			BigInteger c = BigInteger.valueOf(1);
			
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
