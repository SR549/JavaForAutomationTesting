package com.tem.Assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

/**
 * Java program to validate the open and closed parentheses are balanced
 * 
 * The text is: "Sometimes ((I (am) too much (confused (when))) there are
 * multiple parentheses in a sentence)"
 * 
 * Note: NOT to use char data type
 * 
 * @author 9186
 *
 */

public class ParenthesesNew {

	int count;

	/**
	 * Test Approach: Requirements --> Manual Testing --> Automation Testing
	 * 
	 * Inputs: Given String +Ve Test: Number of "(" is equals to number of ")"; -Ve
	 * Test: Number of "(" is Not equals to number of ")";
	 * 
	 * Outcomes: Test Passed : When "(" is equals to ")" Test Failed : When "(" is
	 * not equals to ")"
	 * 
	 */

	/**
	 * Matches the regular Expression ( "("  and ")" ) with the given input string
	 * @param RegEx
	 * @param text
	 * returns count(int)
	 */
	public int patternMatch(String RegEx, String text) {
		count=0;
		Pattern pattern = Pattern.compile(RegEx);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			count++;
		}
		return count;
	}

	@Test
	public void testParentheses() {
		String text = "Sometimes ((I (am) too much (confused (when))) there are multiple parentheses in a sentence)";
		String RegEx1 = "(\\()";
		String RegEx2 = "(\\))";

		int openParentheses = 0;
		int closedParentheses = 0;

		openParentheses = patternMatch(RegEx1, text);
		closedParentheses = patternMatch(RegEx2, text);
		/**
		System.out.println("Number of Open Parentheses : " + openParentheses); //To check the count of "("
		System.out.println("Number of Closed Parentheses : " + closedParentheses);//To check the count of ")"
		**/
		try {
			Assert.assertEquals(openParentheses, closedParentheses);
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}

	}

}
