package com.tem.foundations;

import org.junit.Test;

public class Java02DataTypes {
	
	/**
	 * Explaining two types of data types
	 */
	
	
	/**
	 * 1. Primitive Data Types
	 */
	
	@Test
	public void testDataTypesPrimitive() {
		
		int actualPrice=100;
		System.out.println("totalPrice : " + actualPrice ) ;
		
		float discount = 10f;
		System.out.println("discount : " + discount);
		
		double discountedPrice = actualPrice - (0.1 * actualPrice);
		System.out.println("Amount to be paid after discount is : " + discountedPrice);
		
		boolean loggedIn = false;
		System.out.println("logged In value : " + loggedIn);
				
	}
	
	/**
	 *  2. Non-Primitive data types
	 */
	@Test
	public void testDataTypesNonPrimitive() {
		
		String testURL = "www.google.com";
		System.out.println("TestURL is : "+testURL);
		
		if(testURL.contains("google"))
		{
			System.out.println("you came into the if loop");
		}
		
		Integer count=100;
		if(count.equals(100))
		{
		System.out.println("you enteres Integer if block");
		}
		
	}
	

}
