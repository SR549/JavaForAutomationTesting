package com.tem.Practise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * This program is to practise HashMap 
 *
 * @author 91868
 *
 */
public class CollectionsPractiseHashMap {
/**
 * 1. HashMap implemts Map interface
 * 2. It holds Key Value pair
 * 3. We can retrieve the Keys with the help of Set(HashSet) collection
 * 4. Then we can get the value associated with that key
 * 
 * Syntax:
 * 		Map<keys-data-type,Values-data-type> variable = new HashMap<keys-data-type,Values-data-type>();
 * 
 */
	@Test
	public void testPractiseHashMap() {
		
		Map<String, String> books = new HashMap<String, String>();
		
		//Intializing HashMap with "put" method;
		books.put("01", "Tom Gates");
		books.put("02", "The Hungry Catterpillar");
		books.put("03", "Dr.Suess");
		books.put("04", "Pete The Cat");
		books.put("05", "The Bad Seed");
		books.put("06", "The Wizard of OZ");
		
		
		// Retrieving the HashMap Keys and Values.
		/** 
		 * We can get all the keys into a set with KeySet()
		 * Then we can use this Set to get the respective Values associated with the keys
		 * 
		 * i.e, If books is a HashMap with Ids as keys and bookNames as Values then we get
		 * 	Ids: with books.KeySet();
		 * Values : with books.get(that particular Key) - in the below example we used for-each loop for keySet to get the
		 * 			respective values.
		 * 
		 */
		
		Set<String> booksKeys = books.keySet();
		System.out.println(booksKeys);
		
		for(String booksKey:booksKeys)
		{
			System.out.println(books.get(booksKey));
		}
		
	}
	
	
}
