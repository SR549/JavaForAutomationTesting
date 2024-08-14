package com.tem.Practise1;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Practicing ArrayLits.
 * @author 91868
 *
 */
public class CollectionsPractiseArrayList {

	/**
	 * Unlike Arrays, ArrayLists are dynamic in size.
	 * 
	 * Syntax:
	 * 		ArrayList<data-type> variable = new ArrayList<data-type>();
	 * 
	 */
	
	@Test
	public void testArrayList() {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Custard Apple");
		
		System.out.println(fruits.get(1));
		
		for(String fruit:fruits)
		{
			System.out.println("fruit : "+fruit );
		}
		
	}
	
	
	
	
	
	
	
}
