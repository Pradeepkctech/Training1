package com.kctech.daytwo;
class Parent
{
	void display() {
	System.out.println("this is parerent class");
	}
}
class Child extends Parent{
	void displayOne() {
		System.out.println("This is child class");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c = new Child();
c.display();// here the object c which is created for child class poses the property of parent class
c.displayOne();
	}

}
