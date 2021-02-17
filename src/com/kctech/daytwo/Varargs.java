package com.kctech.daytwo;

public class Varargs {
	
	
	static void display(String... s) {
		for(String a:s) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      display("hi","Day two of training");
	}

}
