package com.tem.Practise1;

import org.junit.Test;

public class Miscellaneous {

	double d = 11.234;
	float f = (float)d;
	int i = (int)d;
	
@Test	
public void convertingDoubleToFloat() {
	System.out.println("Double Value : " +  d);
	System.out.println("Float Value : " +  f);
	System.out.println("Integer Value : " +  i);
}
}
