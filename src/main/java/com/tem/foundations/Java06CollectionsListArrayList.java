package com.tem.foundations;

import java.util.ArrayList;

import org.junit.Test;


public class Java06CollectionsListArrayList {

	
	@Test
	public void arrayListCollectionsMethod()
	{
		ArrayList<String> roles = new ArrayList<String>();
		roles.add("Fresher");
		roles.add("Senior");
		roles.add("Analyst");
		roles.add("Lead");
		roles.add("Manager");
		
		for(String role:roles)
		{
			System.out.println(role);
		}
		
		System.out.println("");
		System.out.println("Printing one of the ArrayList item with get method : " + roles.get(2));
		int rolesLength = roles.size();
		System.out.println("Number of roles in Organization : "+ rolesLength);
		
		roles.remove(0);
		System.out.println("");
		System.out.println("After removing one role");
		
		for(String roleAgain:roles)
		{
			System.out.println(roleAgain);
		}
		
		//roles.remove(roles);
		
		ArrayList<Double> temperatures=new ArrayList<Double>();
		
		temperatures.add(32.4);
		temperatures.add(36.7);
		temperatures.add(40.0);
		temperatures.add(42.3);
		temperatures.add(42.3);
		temperatures.add(36.7);
		
		
	}
	

	

}
