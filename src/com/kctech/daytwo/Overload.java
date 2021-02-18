package com.kctech.daytwo;
class Shape{
	void drawing() {
		System.out.println("Drawing");
	}
}
	class Circle extends Shape{
		
		void draw()
		{
			System.out.println("Drawn circle");
		}
		void draw(int d) {
			System.out.println("The circle was drawn with specified dia");
		}
	}

public class Overload {

	public static void main(String[] args) {
		Circle c= new  Circle();
		c.drawing();
		c.draw();// sub class method overridden the super class method
		c.draw(10);// same as above
		
		
	}

}
