package com.kctech.daytwo;

class Modifiers{
	void display() {
	System.out.println("this is default methos");
	}
	public void dispalyone() {
		System.out.println("this is public method");
	}
	@SuppressWarnings("unused")
	private void displaytwo() {
		System.out.println("this is private method");
	}
	protected void displaythree() {
		System.out.println("this is protected method");
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
		
Modifiers m= new Modifiers();
m.display();// this is default method so can be accessed in side the package
m.dispalyone();//this is public method so can be accessed anywhere
//m.displaytwo(); this is private method of Modifiers so can't accessed in the Access modifiers(main) class
m.displaythree();	//this is protected method so it visible with in the package or its subclass
}
}