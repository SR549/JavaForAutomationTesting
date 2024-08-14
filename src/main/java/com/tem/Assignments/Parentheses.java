package com.tem.Assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Assert;
import org.junit.Test;

/*
 * A Java Program to validate the open and closed parentheses are balanced or not.
 * 
 */
public class Parentheses {
	
	/*
	 * (High Level)Test Approach:
	 * RegExp for '('
	 * count
	 * RegExp for ')'
	 * count
	 * compare the count of both the parentheses
	 * 
	 * 
	 * Input : sometimes ((I (am) too much (confused (when) there are multiple parentheses in a sentence)
	 * Output : 
	 * Test Passed - If the input is balanced.
	 * Test Failed - If the input is not balanced.
	 * 
	 * 
	 */

	@Test
	public void parenthesesTest() {
		
		String str = "sometimes ((I (am) too much (confused (when) there are multiple parentheses in a sentence)";
		String RegExp1 ="(\\()";
		String RegExp2 ="(\\))";
		int countOpenParen =0;
		int countCloseParen=0;
		
		try {
			//Finding the count of open Parentheses
			Pattern pattern1=Pattern.compile(RegExp1);
			Matcher matcher1=pattern1.matcher(str);
			
			while(matcher1.find()) {
				countOpenParen++;
			}
				
			System.out.println(countOpenParen);
			System.out.println();
			
			//Finding the count of closed parentheses
			Pattern pattern2 = Pattern.compile(RegExp2);
			Matcher matcher2=pattern2.matcher(str);
			
			while(matcher2.find())
			{
				countCloseParen++;
			}
		System.out.println(countCloseParen);
			
			Assert.assertEquals(countOpenParen, countCloseParen);
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
		
		
		
		
		
	}
	
		
		

}
