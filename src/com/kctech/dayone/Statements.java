package com.kctech.dayone;
import java.util.Scanner;
class hi{
//	int i;

	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	void ifP() {
		System.out.println("If ststement:");
		if( i/5==0) {
			System.out.println("the given number is even");
			
		}
		else {
			System.out.println("the given number is odd");
		}
	}
	
}
public class Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hi s = new hi();
		s.ifP();
		

	}

}
