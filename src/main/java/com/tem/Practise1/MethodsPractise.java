package com.tem.Practise1;

import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;

/**
 * 
 * This Project is to pratise methods using String Operations
 * 
 * @author 91868
 * 
 */
public class MethodsPractise {

	// This method is called before running any test case
	@Before
	public void beforeTest() {
		System.out.println("Test Case : " + name.getMethodName());
	}

	// This method is called after a test case is run
	@After
	public void afterTest() {
		System.out.println("Test case completed : " + name.getMethodName());
		System.out.println();
	}

	// TestName class helps beforeTest() and afterTest() methods in getting the name
	// of the testcases.
	@Rule
	public TestName name = new TestName();

	/*
	 * This method call converts the Strings to lower case letters
	 * 
	 * @Param : outPut - The String which has to be converted to lower case letters
	 * returns lowerCaseOutPut - The string that is converted to lower case
	 * 
	 */
	public String lowerCaseMethod(String outPut) {
		String lowerCaseOutPut = outPut.toLowerCase();
		return lowerCaseOutPut;
	}

	public Boolean ignoreCaseMethod(String resultFromAPI, String actualResultRequirementsDocument) {

		Boolean b = resultFromAPI.equalsIgnoreCase(actualResultRequirementsDocument);
		return b;
	}

	/**
	 * The test method to make all the method calls
	 */

	@Test
	public void methodsPractise() {

		String actualOutput = "Practise makes man perfect";

		// Calling the lowerCaseMethod(String outPut) method
		String lowerCaseOutPut = lowerCaseMethod(actualOutput);
		System.out.println("Lower Case OutPut is : " + lowerCaseOutPut);

		// IgnoreCase Method
		try {
			String resultFromAPI = "I love You Amma";
			String actualResultRequirementsDocument = "i love you amma";

			Boolean b = ignoreCaseMethod(resultFromAPI, actualResultRequirementsDocument);
			Assert.assertTrue(b);
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			System.out.println("Test Passed");
			Assert.fail();
		}

	}

}
