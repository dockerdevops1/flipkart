// Java code to illustrate method 
// overloading in println() 

import java.io.*; 

class PrintLN { 
	public static void main(String[] args) 
	{ 

		// Declaring different datatypes 
		int num = 10; 
		int num = 30; 
		char ch = 'G'; 
		String str = "GeeksforGeeks"; 
		double d = 10.2; 
		float f = 13.5f; 
		boolean bool = true; 

		// Various overloads of println() method 
		System.out.println(); 
		System.out.println(num); 
		System.out.println(ch); 
		System.out.println(str); 
		System.out.println(d); 
		System.out.println(f); 
		System.out.println(bool); 
		System.out.println("Hello"); 
	} 
} 

