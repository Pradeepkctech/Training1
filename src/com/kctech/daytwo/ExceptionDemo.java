package com.kctech.daytwo;
<<<<<<< HEAD
import java.util.InputMismatchException;
=======
>>>>>>> ba4236dfbf7b077f7d87efd83ac9ad08f10d559b
import java.util.Scanner;
import java.util.InputMismatchException;


class Function{
	
	int result ;
	

	void add(int a, int b) {
	
		result=a+b;
		System.out.println("addition of given nmbers:"+"   "+result);
		}
	void divide(int a,int b) {
		
		
		try{
			result=a/b;
			System.out.println("division of 2 numbers:"+"   "+result);
		}
		catch(ArithmeticException ae){
			System.out.println("the value of b is 0");
			}
		finally {
		      System.out.println("finally block is executed");	
		}
		
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		Function e = new Function();
		System.out.println("Enter numbers");
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		try{
			int a=sc.nextInt();
		int b =sc.nextInt();
		e.divide(a,b);
		e.add(a,b);
		}
	
	catch(InputMismatchException im) {
		System.out.println("Please enetr only a number");
		main(args);
		}
		finally {
		      System.out.println("finally block is executed");	
		}
		
		
		
<<<<<<< HEAD
		catch(InputMismatchException ae)
		{
			System.out.println("the second no should not be zero");
			
		}
		finally
		{
			System.out.println("Exception handling");
		}
	
=======
	}
>>>>>>> ba4236dfbf7b077f7d87efd83ac9ad08f10d559b
	}

