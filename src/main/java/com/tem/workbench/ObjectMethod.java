package com.tem.workbench;

import org.junit.Test;

/*
 * This is the to observe method of Object class
 */

public class ObjectMethod {
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
		
		
	}
	

}
