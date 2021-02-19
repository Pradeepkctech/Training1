package com.kctech.daytwo;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionDemo {

	public static void main(String[] args) {
		int a,b;
			System.out.println("enter the # to divide:");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
				
					a=in.nextInt();
	
					b=in.nextInt();
			
			
		
	
	try {		
			
			 float c= a/b;
			System.out.println("result is :"+" "+c);
		
		}
		
		catch(InputMismatchException ae)
		{
			System.out.println("the second no should not be zero");
			
		}
		finally
		{
			System.out.println("Exception handling");
		}
	
	}

}
