package com.tem.OOPs;

import org.junit.Test;

import org.junit.Assert;

public class JavaCovidRecoveredCasesObjects {

	JavaCovidRecoveredCases covid1 = new JavaCovidRecoveredCases();
	
	@Test
	public void firstObjectForCovidRecoveredCases() {
		
		covid1.setCountry("India");
		//JavaCovidRecoveredCases.setRecovered(1);
		
		covid1.printCountry();
		covid1.printRecovered();
		covid1.printRecovered();
		covid1.printRecovered();
		covid1.printRecovered();
		
	}
	
	JavaCovidRecoveredCases covid2=new JavaCovidRecoveredCases("USA");
	
	@Test
	public void secondObjectForCovidRecoverCases()
	{
		covid2.printRecovered();
		covid2.printCountry();
		covid2.printRecovered();
		covid2.printRecovered();
		
		try {
			int expected = 3;
			int actual = JavaCovidRecoveredCases.getRecovered();
			System.out.println("Expected : " + expected + " Actual : " + actual);
			
			Assert.assertEquals(expected, actual);
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
	}
}
