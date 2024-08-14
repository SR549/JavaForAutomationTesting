package com.tem.foundations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Java06CollectionsSetHashSetMapHashMap1 {

	/*
	 * This class explains the following Collections
	 * 1. Set - HashSet
	 * 	2.Map - HasMap
	 * 
	 */
	
	
	/*
	 * Set - Interface
	 * HashSet - Class  { "HashSet" class implements the "Set" Interface
	 * 
	 * Set doesn't hold "duplicate" items.
	 * It is mainly used to hold keys (You can use in map, which you will learn next)
	 * 
	 */
	@Test
	public void setHashSet()
	{
		Set<String> countries = new HashSet<String>();
		
		countries.add("India");
		countries.add("Nepal");
		countries.add("China");
		countries.add("SriLanka");
		//countries.add("India");
		
		System.out.println(countries);
		
		if(countries.contains("USA"))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
		
	}
	
	
	/*
	 * Map - Interface
	 * HashMap - class {HashMap class implements Map Interface}
	 * 
	 * Map holds  Key-Value pair
	 * We can make use of "Set" collection to store Key values (as Set doesn't contain duplicate value)
	 * 
	 * In order to access keys in a map we use:
	 * keySet() -(which returns set of all keys)
	 * 
	 * In order to access values in a map:
	 * We make use of for loop to access each "key" of the map and use get() method to get each "value" mapped to that key
	 * 
	 */
	@Test
	public void mapHashMap() {
		
		Map<String, Number> countries = new HashMap<String, Number>();
		
		
		countries.put("India", 1);
		countries.put("USA", 2);
		
		try {
			// keySet method is used to get the "keys" of a map. This keySet method returns Set.
			Set<String> countriesKeys=new HashSet<String>(); 
			countriesKeys = countries.keySet();  // We need a Set(countriesKey) a to store all the keys of map(countries). 
			System.out.println("Keys : " +countriesKeys);
			
			System.out.println();
			System.out.println();
			// getting the "values" of map using get()
			for(String countriesKey:countriesKeys)
			{
				System.out.println("Key : " + countriesKey);
				Number value = countries.get(countriesKey);
				System.out.println("Value : " + value );
				
				Assert.assertTrue(value.intValue()!= 0);
			}
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
		
		
		
		
	}
	
}
