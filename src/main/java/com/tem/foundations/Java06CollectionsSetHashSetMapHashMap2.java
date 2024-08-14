package com.tem.foundations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Java06CollectionsSetHashSetMapHashMap2 {
	
	@Test
	public void testCollections() {
		
		Map<String, Double> temperatureStats = new HashMap<String, Double>();
		
		temperatureStats.put("Hyderabad", 36.7);
		temperatureStats.put("Bangalore", 32.2);
		temperatureStats.put("Chennai", 38.7);
		temperatureStats.put("Coimbathur", 35.7);
		
		//collecting all the Keys of the HashMap separately
		
		Set<String> temperatureStatsKeys = new HashSet<String>();
		
		temperatureStatsKeys = temperatureStats.keySet();
		System.out.println("Keys : " + temperatureStatsKeys);
		
		
		//collecting Values of HashMap separately 
		System.out.println("Values : " + temperatureStats.values());
		System.out.println();
		
		
		//For each "Key" its corresponding "Value" in the HashMap
		try {
			int count=0;
			for(String temperatureStatsKey: temperatureStatsKeys)
			{
				System.out.println("Key:"+temperatureStatsKey+ "  Value:" + temperatureStats.get(temperatureStatsKey));
				if((temperatureStats.get(temperatureStatsKey))!=0.00)
					count++;
			}
			
			System.out.println("Count " + count);
			System.out.println("Keys Size " + temperatureStatsKeys.size());
			System.out.println();
			
			Assert.assertTrue(count==temperatureStatsKeys.size());
			System.out.println("Test Passed");
			
		} catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
		
		
	}

}
