package com.kctech.daytwo;
import java.util.Scanner;

public class StringAPI {

	public static void main(String[] args) {
		String s ;
		System.out.println("Enter your String");
		@SuppressWarnings("resource")
	   
		Scanner in = new Scanner(System.in);
		s=in.nextLine();
		System.out.println("the entered string is: "+ " "+s);
		String a=s.replace("Pradeep", "Hi");
		System.out.println("if the entered string is Pradeep then it is replaced by hi :"+ " "+a);
        System.out.println("the length of eneterd string is :"+ " "+ s.length());
	}

}
