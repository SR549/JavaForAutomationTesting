package com.tem.foundations;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * 
 * @author 91868
 * 
 * This project is for processing the Inputs and Outcomes of a simple application.
 * 
 * * Application 		:  Business Banking 
   * Feature	 		:  Create a Business Bank Account (It has one drop down list, one text field to enter the interest rate, one submit button and the text field that displays message after creation of account)
   * Valid Inputs for successful Account creation : Rating > A , Interest Rate between 0.2 to 4.0
   * Expected Outcomes  :  Successful, Not Successful, Invalid Rate(<0)
   *
   */


public class Java06ProcessingInputsOutcomes {
	/**
	 * Operators:
	 * 1. Comparative Operators : ==, >=, <=, !=
	 * 2. Logical Operators : && (and), || (or), !(negation) 
	 */
	
	//Inputs
	String rating = "<A";
	String InterestRate = "2.0";
	
	//Outputs
	String statusSuccessful = "Successfull";
	String statusNotSuccessful = "Not Successfull";
	String statusInvalidRate = "Invalid Rate";
	
	@Before
	public void beforeTest() {
		System.out.println("Test run : " + name.getMethodName() + " Started" );
	}
	
	@After
	public void afterTest() {
		System.out.println("Test run : " + name.getMethodName() + " completed");
	}
	
	@Rule
	public TestName name = new TestName();  
	
	
	@Test
	public void testProcessingInputsOutcomes() {
		
		/**
		 * Test Approach
		 * basis > requirements, designs > manual test cases > test automation > traceability > defects   
		 */
		
		/**
		 * 
		 * Test Inputs - Rating >A , <A (drop down)
		 * 				 Interest Rate (text field) 
		 *               - positive test 0.2 to 4.0 [ECP = 2.0] // happy path
		 *  			 - negative test (valid Inputs) <0.2 , >4.0, 
		 *  			 - negative test (Invalid Inputs) <0
		 * 				 - edge cases  empty, special characters, null
		 * 
		 **/
		
		/**
		 * Test Outputs - Status Messages
		 * 					Successful - >A , 0.2 to 4.0 
		 * 					Not Successful - >A, <0.2 or >4.0
		 * 					Not Successful - <A
		 * 					Invalid Rate - <0 , empty, special characters, null
		 * 
		 */
		
		String bankAccountCreationStatus = null;
		
		bankAccountStatus :
		{
			//Invalid Rate  <0 , empty, special characters, null
		if(InterestRate==null
				|| InterestRate.isEmpty()
				|| !InterestRate.matches("^[0-9.]+$")
				|| (Double.parseDouble(InterestRate))<0) {
			bankAccountCreationStatus = statusInvalidRate;
		break bankAccountStatus;
		}
		
		     // Not Successful - <A
		if(rating.equalsIgnoreCase("<A")) {
			bankAccountCreationStatus = statusNotSuccessful;
			break bankAccountStatus;
		}
		
		
		if(rating.equalsIgnoreCase(">A"))
		{
			// Not Successful - >A, <0.2 or >4.0
		if(Double.parseDouble(InterestRate)<0.2 || Double.parseDouble(InterestRate)>4.0)
		{
			bankAccountCreationStatus = statusNotSuccessful;
			break bankAccountStatus;
		}
		 
		// Successful - >A , 0.2 to 4.0
		if (Double.parseDouble(InterestRate)>=0.2 || Double.parseDouble(InterestRate)<=4.0 ) 
		{
			bankAccountCreationStatus = statusSuccessful;
			break bankAccountStatus;
		}
		}
			
		}
		
	    System.out.println("The bank Account status is : " + bankAccountCreationStatus);

		
				
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
