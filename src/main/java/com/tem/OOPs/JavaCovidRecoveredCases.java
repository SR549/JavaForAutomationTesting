package com.tem.OOPs;

/**
 * This is the first class from where we started to explain the object oriented programming OOPs
 * 
 * @author Sreeja
 *
 */
public class JavaCovidRecoveredCases {

	/*
	 * Declare two private variables a String and an int.
	 * String variable is non-static where as int variable is static
	 * 
	 * 
	 * 		Static Variables									Non-static variables
	 * 	1. static variables are class variables				1. Non-static variables are instance variables.
	 * 	2. They have common memory location. Meaning 		2. Each object has its own memory locations for these variables
	 *    class level memory, independent of the objects
	 *    
	 *    
	 */
	
	private static int recovered; 
	private String country;         
	
	//Constructors - Initializes the objects
	// There are constructors with no arguments
	//There are constructors with parameters - parameterized constructors
	
	public JavaCovidRecoveredCases(){
		country = null;
	}
	
	public JavaCovidRecoveredCases(String country)
	{
		this.country = country;
	}
	
	
	/*
	 * Encapsulation : binding (everything) variables and the methods together.
	 * 					Its objective : 
	 * 						- To hide the data, to have the security, 
	 * 						and so that the other programs or other softwares cannot modify the data
	 * 						- The variables are declared as private as private access modifiers make them accessible only to that 
	 * 						   particular class. and if these variables are to be accessed then it can be done only through
	 * 						methods like setters and getters.
	 * 
	 * 
	 * in layman terms, simply 
	 *	1. declare private variables
	 *  2. declare setters and getters
	 *  3. you can access the data only through setters and getters 
	 *
	 */
	
	//Setters and Getters
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public static void setRecovered(int recovered) {
		JavaCovidRecoveredCases.recovered = recovered;
	}
	
	public static int getRecovered() {
		return recovered++;
	}
	
	//application related methods
	public void printCountry()
	{
		System.out.println("Country : " + getCountry());
	}
	
	public void printRecovered()
	{
		System.out.println("Recovered : " + getRecovered());
	}
	
	
	
}
