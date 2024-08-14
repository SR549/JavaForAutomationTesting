package com.tem.Practise1;

import org.junit.Test;

/**
 * 
 * @author 91868
 * 
 * This project is for processing the Inputs and Outcomes of a simple application.
 * 
 * * Application 					:  Business Banking 
   * Feature	 					:  Create a Business Bank Account (It has one drop down list, one text field to enter the interest rate, one submit button and the text field that displays message after creation of account)
   * Valid Inputs for successful
     Account creation 				:  Rating > A , Interest Rate between 0.2 to 4.0
   * Expected Outcomes  			:  Successful, Not Successful, Invalid Rate(<0)
   *
   */

public class BankAccountCreation {

	//Inputs
	String rating = "<A";
	String interestRate = "$";
	
	//Outputs
	String actualStatusSuccessful = "Successful";
	String actualStatusNotSuccessful = "Not Successful";
	String actualStatusInvalidRate = "Invalid Rate";
	
	/**
	 * Test Approach
	 * BRS --> Manual Test Cases --> Automation Test Cases
	 * 
	 * Test Inputs : Rating:
	 * 				 	Positive Test : >A
	 * 				 	Negative Test : <A
	 * 				 Interest Rate:
	 * 				 	Positive Test : >=0.2 and <4.0
	 * 				 	Negative Test (Valid inputs) : >0 and <0.2  or >4.0
	 * 				 	Negative Test (Invalid inputs) : <0
	 * 				 	Edge cases : null, empty, Special Characters 
	 * 
	 * Test Outputs : Bank Account Status :
	 * 					Successful = >A  , >=0.2 and <4.0
	 * 					Not Successful :  (>0 and <0.2) or >4.0
	 * 					Not Successful : <A
	 * 					Invalid Rate : <0, empty, null, special character	
	 * 
	 */
	
	String bankAccountStatus = null;
	
	@Test
	public void testBankAccountStatus() {
		bankAccountStatus:
		{
		if(interestRate.isEmpty()|| 
				interestRate == null ||
				!interestRate.matches("^[0-9.]+$")||
				Double.parseDouble(interestRate)<=0	)	
		{
			bankAccountStatus = actualStatusInvalidRate;
			break bankAccountStatus;
		}
		
		if(rating.equalsIgnoreCase("<A")
				||(Double.parseDouble(interestRate)>0 && Double.parseDouble(interestRate)<0.2)
				||Double.parseDouble(interestRate)>4.0)
		{
			bankAccountStatus=actualStatusNotSuccessful;
			break bankAccountStatus;
		}
		
	/*	if((Double.parseDouble(interestRate)>0 && Double.parseDouble(interestRate)<0.2)
				|| Double.parseDouble(interestRate)>4.0)
		{
			bankAccountStatus=actualStatusNotSuccessful;
			break bankAccountStatus;
		}
		
		*/
		
		// Successful - >A , 0.2 to 4.0
				if (Double.parseDouble(interestRate)>=0.2 || Double.parseDouble(interestRate)<=4.0 ) 
				{
					bankAccountStatus = actualStatusSuccessful;
					break bankAccountStatus;
				}
	
		}
	System.out.println("Bank Account Status " + bankAccountStatus);
	}
	
}
