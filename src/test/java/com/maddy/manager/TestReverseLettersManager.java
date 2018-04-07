package com.maddy.manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
		    String revStrNe= "olleH dlrow OO";
		    assertEquals(revStr,ReverseLettersManager.getLettersReversedString(str));
		    assertNotEquals(revStrNe,ReverseLettersManager.getLettersReversedString(str));
		    //Single word
		    assertEquals("AB",ReverseLettersManager.getLettersReversedString("BA"));
		    assertNotEquals("BA",ReverseLettersManager.getLettersReversedString("BA"));
		    //Given test data
		    String str1 = "how are you";
		    String revStr1= "woh era uoy";
		    String revStr1Ne= "woh era uoy OO";
		    assertEquals(revStr1,ReverseLettersManager.getLettersReversedString(str1));
		    assertNotEquals(revStr1Ne,ReverseLettersManager.getLettersReversedString(str1));
		    
	}
	
	@Test
	public void testGetLettersReversedStringLibrary() {
		   
		   //Multiple word
		    String str = "Hello world";
		    String revStr= "olleH dlrow";
		    String revStrNe= "olleH dlrow OO";
		    assertEquals(revStr,ReverseLettersManager.getLettersReversedStringUsingBuilder(str));
		    assertNotEquals(revStrNe,ReverseLettersManager.getLettersReversedStringUsingBuilder(str));
		    //Single word
		    assertEquals("AB",ReverseLettersManager.getLettersReversedStringUsingBuilder("BA"));
		    assertNotEquals("BA",ReverseLettersManager.getLettersReversedStringUsingBuilder("BA"));
			   
		    assertEquals("AB",ReverseLettersManager.getLettersReversedStringUsingBuilder("BA"));
		    
		    //Given test data
		    String str1 = "how are you";
		    String revStr1= "woh era uoy";
		    String revStr1Ne= "woh era uoy OO";
		    assertEquals(revStr1,ReverseLettersManager.getLettersReversedStringUsingBuilder(str1));
		    assertNotEquals(revStr1Ne,ReverseLettersManager.getLettersReversedStringUsingBuilder(str1));
		    
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
