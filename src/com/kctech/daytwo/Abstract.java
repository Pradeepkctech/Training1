package com.kctech.daytwo;
abstract class Draw{
	void draw() 
	{
	}
	abstract void drawn(int b,int h);
}
class Rectangle extends Draw{
	void draw() {
		System.out.println("The triangle was drawn");
	}
	void drawn(int b, int h){
		System.out.println("The triangle was drawn with  specified paprameters");
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.draw();
		r.drawn(40, 60);

	}

}
