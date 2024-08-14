package com.tem.Practise1;

import org.junit.Test;

import org.junit.Assert;

/**
 * This project is to practise Collections in Java
 * @author 91868
 *
 */
public class CollectionsPractiseArray {
	
	@Test
	public void collectionsArrayMethod1() {
	
	/**
	 * Collections 1: Arrays
	 * 
	 * Arrays are the basic collections where they hold multiple variables of same data type.
	 * 
	 * Cons: Arrays have fixed size. If we want to increase or decrease the length of an array we need to change where the array is
	 * declared or initialized. 
	 *  Thus, the dynamic usage becomes limited when we want to increase or decrease the length in the middle of the program.
	 *
	 *  
	 *  We can access each element of the array through loops.
	 *  
	 */
	
	//Array of flowers
	String[] flowers = {"Rose","Lilly","Jasmine","Marigold"}; 
	
	/**
	 *   For-each loop
	 *   Syntax:   Data-Type variable:Array 	 
	 */
	for(String flower:flowers)
	{
		System.out.println(flower);
	}
	}
	
	
	/**
	 * This method is to understand break and continue ;
	 * 
	 * break : is to break from a loop
	 * 
	 * Scenario: We want to check for "The Young Caterpillar" book among the given list of books.
	 */
	@Test
	public void collectionsArrayMethod2() {
		
		String[] books = {"Tom Gates", "Pete the Cat","Black Beauty","The Young Caterpillar","The Bad Seed"};
		String bookToCheck = "The Young Caterpillar";
		
		boolean bookFoundStatus = false;
		
		try {
			for(String book:books)
			{
				if(book.equalsIgnoreCase(bookToCheck))
				{
					//System.out.println("Book Found");
					bookFoundStatus = true;
					break;
				}
				else
				{
					bookFoundStatus =false;
					continue;
				}
			}
			
			Assert.assertTrue("Book Found", bookFoundStatus);
			System.out.println("Test Passed");
			
		} catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
		
		
	}

}
