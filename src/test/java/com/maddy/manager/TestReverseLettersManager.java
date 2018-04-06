package com.maddy.manager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
*Unit tests for ReverseLettersManager
*/
public class TestReverseLettersManager {

	
	
	@Test
	public void testGetLettersReversedString() {
		   
		   //Multiple word
		    String str = "Hello world";
		    String revStr= "olleH dlrow";
		    assertEquals(revStr,ReverseLettersManager.getLettersReversedString(str));
		    assertEquals(revStr,ReverseLettersManager.getLettersReversedStringUsingBuilder(str));
            //Single word
		    assertEquals("AB",ReverseLettersManager.getLettersReversedString("BA"));
		    assertEquals("AB",ReverseLettersManager.getLettersReversedStringUsingBuilder("BA"));
		    
		    //Given test data
		    String str1 = "how are you";
		    String revStr1= "woh era uoy";
		    assertEquals(revStr1,ReverseLettersManager.getLettersReversedString(str1));
		    assertEquals(revStr1,ReverseLettersManager.getLettersReversedStringUsingBuilder(str1));
		    
	}	
	//Sentence cannot be null/empty/whitespace
	 @Test(expected=IllegalArgumentException.class)
	 public void expectedIllegalArgumentExceptionForNull() {
		 ReverseLettersManager.getLettersReversedStringUsingBuilder(null);
	         }
	 
	 @Test(expected=IllegalArgumentException.class)
	 public void expectedIllegalArgumentExceptionForEmpty() {
		      ReverseLettersManager.getLettersReversedStringUsingBuilder("");
	         }
	 
	 @Test(expected=IllegalArgumentException.class)
	 public void expectedIllegalArgumentExceptionForWhiteSpace() {
		      ReverseLettersManager.getLettersReversedStringUsingBuilder("	");
	         }
	 		 	
	 @Test(expected=IllegalArgumentException.class)
	 public void expectedIllegalArgumentException() {
		 ReverseLettersManager.getLettersReversedString(null);
	         }
}
