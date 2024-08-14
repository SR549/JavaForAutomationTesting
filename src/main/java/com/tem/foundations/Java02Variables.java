package com.tem.foundations;

import org.junit.Test;
import org.junit.Assert;

/**
 * 
 * @author 91868
 *
 */

public class Java02Variables {
	
	/**
	 * Instance Variables
	 */
	
	String URL="www.helloworld.com";
	String testURL ="teststaging.barclays.com";
	long membershipNumber = 123456;
	int passcode = 506001;
	
	/**
	 * Static Variables
	 */
	
	static int numberOfLoginAttempts=0;
	
	private void loginAttempts() {
		
		/**
		 * Local Variable
		 */
		String expectedAccountLockedMessage = "Account Locked. Please contact Bank";
		numberOfLoginAttempts++;
		System.out.println("User Login Attempts"+ numberOfLoginAttempts );
		
		try {
			if(numberOfLoginAttempts == 3)
			{
				System.out.println(expectedAccountLockedMessage);
				Assert.assertEquals(expectedAccountLockedMessage, "Account Locked. Please contact Us");
				System.out.println("Test Passed");
			}
		} catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail("Message doesnot match");
			
		}
		
	}

  @Test
	public void testVariables() {
	  
	  System.out.println("Test URL :"+ testURL );
	  System.out.println("Membership Number :"+ membershipNumber );
	  System.out.println("Passcode :"+ passcode );
	  
	  membershipNumber = 000000001;
	  System.out.println("The new membership Number :"+ membershipNumber );
	  
	  loginAttempts();
	  loginAttempts();
	  loginAttempts();
	}



}
