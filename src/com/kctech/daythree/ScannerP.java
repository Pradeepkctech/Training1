package com.kctech.daythree;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ScannerP {

	public static void main(String[] args) {
	int a;
	float b;
	String s;
	
	Scanner in = new Scanner(System.in);
	try{
		a=in.nextInt();
	b=in.nextFloat();
	
		s=in.next();
	
	in.close();
	System.out.println("Enterd number is "+a);
	System.out.println("Entered float value is "+b);
	System.out.println("Enterd String is"+s);}
	
	catch(InputMismatchException ie) {
		System.out.println("Please enter onlya a number for first 2 variables value");
	
	main(args);
	}
	}

}
