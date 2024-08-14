package com.tem.foundations;
import org.junit.Test;

/**
 * 
 * @author 91868
 *
 */
public class Java02TypeCasting {
		
	/**
	 * 1. Widening Type casting
	 * example, int to double
	 */

	@Test
	public void testTypeCastingMidening() {
		
		int a=10;
		double b=a;
		
		System.out.println(a);
		System.out.println(b);
		
	}	
	/**
	 * 2. Narrowing - Type Casting
	 * Example double to int
	 */
	
	@Test
	public void testTypeCastingNarrowing() {
		
		double d= 12.3789;
		 int i= (int) d;
		System.out.println("This is executing first");
		System.out.println(d);
		System.out.println(i);
		
	}

	
	
}
