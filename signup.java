// Java code to illustrate difference 
// between print() and println() 

import java.io.*; 

class Demo_print { 
	public static void main(String[] args) 
	{ 
		System.out.println("Using print()"); 

		// using print() 
		// all are printed in the 
		// same line 
		System.out.print("GfG! "); 
		System.out.print("GfG! "); 
		System.out.print("GfG! "); 

		System.out.println(); 
		System.out.println(); 
		System.out.println("Using println()"); 

		// using println() 
		// all are printed in the 
		// different line 
		System.out.println("GfG! "); 
		System.out.println("GfG! "); 
		System.out.println("GfG! "); 
	} 
} 

