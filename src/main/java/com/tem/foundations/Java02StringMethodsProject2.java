package com.tem.foundations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Assert;
import org.junit.Test;

public class Java02StringMethodsProject2 {

	/**
	 * Matches Method
	 */
	@Test
	public void test01Matches() {
		String actualOutput = "Sreeja Studied in WPS Hnk.";
		
		String regExp ="^[a-zA-Z .]+$";
		
		try {
			Assert.assertTrue(Pattern.matches(regExp, actualOutput));
			System.out.println("The expression is available");
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			//System.out.println("Test Failed");
			Assert.fail("Test Failed");
		}
		
	}
	

	
	/**
	 * Extracting a String
	 */
	@Test
	public void test02ExtractString() {
		
		String expectedTransactionOutput = "The Transaction TN100002345 TN100002346 TN100002347 completed successfully";
		String regExp = "(TN\\d+)";
		String str2;
		
			Pattern pattern = Pattern.compile(regExp);
			Matcher match = pattern.matcher(expectedTransactionOutput);
			
			if(match.find())
			{
				//str1=match.group();
				//System.out.println(str1);
			}
			
			if(match.find())
			{
				str2=match.group();
				System.out.println(str2);
			}
			
			if(match.find())
			{
				//str3=match.group();
				//System.out.println(str3);
			}
			
			
		
		}
		
	String actualBankStatement="Your bank account ICIC12345678 will be credited in 5 days";	
	@Test
	public void test03StringToInteger() {
		
		String group = null;
		int intData = 0;
		//  (\\d+)
		String regExp = "( \\d+)";
		Pattern pattern = Pattern.compile(regExp);
		Matcher match = pattern.matcher(actualBankStatement);
		
		while(match.find())
		{
			group = match.group();
			
			System.out.println("String Data : " + group);
			intData = Integer.parseInt(group.trim());
			System.out.println("Integer Data is :" + intData);	
		}
		
	}
	
	@Test
	public void test04IntToStringConversion() {
		
		int amount = 1000000;
		String Rupees = "Rs";
		String strAmount = String.valueOf(amount); //amount converted to String
		
		String rsAmount = Rupees.concat(strAmount);
		System.out.println("The amount : " + rsAmount);
		
	}
	
	}

