package com.tem.foundations;

//import static org.junit.Assert.fail;

//import org.junit.Assert;
import org.junit.Test;


/*
 * This is the to observe method of Object class
 */

public class Java06LoopsAndArrays {
	/*
	 * 
	 */
	@Test 
	public void name() {
		
		String[] str = {"tester1, tester2, tester3"};
		System.out.println(str.length);
		System.out.println(str[0]);
		System.out.println("");
		
		Object[] obj = {"tester1, tester2, tester3"};
		System.out.println(obj.length);
		System.out.println(obj[0]);
		System.out.println("");
		
		Object[][] objMulti = {
				{">A", "2.0", "Successful"},
				{">A", "1.0", "Not Successful"},
				{">A", "5.0", "Not Successful"},
				{"<A","2.0","Not Successful"},
				};
		
		System.out.println(objMulti.length);
		System.out.println(objMulti[0][1]);
		System.out.println(objMulti[1][1]);
		System.out.println("");
		
		String[] books= {"Tom Gates","The Hungry Caterpillar","Peter Pan","The Secret Garden"};
		/*
		 * Printing the String elements with for-each loop
		 * Syntax:  for(data-type item:Array)
		 */
		
		for(String book:books)
		{
			System.out.println(book);
		}
			
	}
	
	@Test
	public void emailIdAvailability() {
	
		String[] existingEmaiIds = {"Automation.Tester","Senior.Tester","TestManager"};
		int existingEmailIdsCount = existingEmaiIds.length;
		int count=0;
		//System.out.println(existingEmailIdsCount);
		String newEmailId = "Fresher.Tester";
		//boolean emailIdExists = false;
		
		for(String emailId:existingEmaiIds)
		{
			if(emailId.equalsIgnoreCase(newEmailId))
			{
				System.out.println("Email Id Exists");
				break;
			}
			else
			{
				count++;
			}
			
		}
		if(count==existingEmailIdsCount)
		{
			System.out.println("Email Id Is Available");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		 
		try {
			for(String emailId:existingEmaiIds)
			{
				if(emailId.equalsIgnoreCase(newEmailId))
				{
					System.out.println("Email Id Already Exists");
					emailIdExists = true;
					break;
				}
				else {
					emailIdExists = false;
					continue;
					//System.out.println(newEmailId + "Email Id Is Available");
				}
			
			}
			
			//System.out.println(emailIdExists);
			//Assert.assertFalse("Email Id Available", emailIdExists);
			Assert.assertFalse("emailId is available", emailIdExists);
			System.out.println(newEmailId + " emailId is available " );
			
		} catch (Exception e) {
			System.out.println("Error in the code");
		}
		catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
		*/
	}
	

}
