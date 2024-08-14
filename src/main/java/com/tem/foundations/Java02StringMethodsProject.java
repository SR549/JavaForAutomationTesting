package com.tem.foundations;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;

/**
 * 
 * @author 9186
 *
 */


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Java02StringMethodsProject {
	
	/**
	 * Bank Transaction Message
	 * Bank Transaction status
	 * Business Name
	 * Amount
	 */
	
	//The below variables are Instance variables. Instance variables are declared in the class directly. 
	//They are usually given private access modifier
	private String actualBankTransactionMessage ="transaction IN0000000546 was successfully completed";
	private String actualBankTransactionStatus ="";
	//private String actualBankBusinessName ="ABC Ltd";
	//private String bankAmount ="$10000";
	
	@Before
	public void beforeTest() {
		System.out.println("Test Name " + name.getMethodName());
	}
	
	@After
	public void afterTest() {
		System.out.println("Test Run Completed " + name.getMethodName());
		System.out.println("");
	}
	
	@Rule
	public TestName name = new TestName();
	
	/**
	 * String methods for case conversions toLowerCase() and toUpperCase()
	 * They return string value after conversion
	 */
	@Test
	public void test01CaseLetters() {
		
		System.out.println(actualBankTransactionMessage.toLowerCase());
		System.out.println(actualBankTransactionMessage.toUpperCase());
		
	}
	
	
	/**
	 * String method to compare two strings - compareTo
	 * It returns 0 if the two strings are equal
	 */
	@Test
	public void test02CompareStrings() {
		 
		String expectedBankTransactionMessage ="Transaction IN0000000546 was successfully completed" ;
		
		if(expectedBankTransactionMessage.compareTo(actualBankTransactionMessage) == 0)
		{
		System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		System.out.println(actualBankTransactionMessage.compareToIgnoreCase("Transaction IN0000000546 was successfully completed"));
	}
	
	@Test
	public void test() {
		
		try {
			Assert.assertTrue(actualBankTransactionMessage.endsWith("completed")); 
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
		
		
	
		
	}
	
	
	@Test
	public void testStringEmpty() {
		
		try {
			boolean empty = actualBankTransactionStatus.isEmpty();
			Assert.assertTrue(empty);
			System.out.println(actualBankTransactionStatus);
		} catch (AssertionError e) {
			System.out.println("Test has failed");
			Assert.fail();
		}
		
	}	
	
	
	
	
}
