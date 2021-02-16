package com.kctech.day1;
class Triangleone{
	private double w;
	private double h;
	public double getw()
	{
		return w;
	}
	public void setw(double w)
	{
		this.w=w;
	}
	public double geth()
	{
		return h;
	}
	public void seth(double h)
	{
		this.h=h;
	}
}

public class EncapsulatedAreaOfTriangle {

	public static void main(String[] args) {
		Triangleone t= new Triangleone();
		t.setw(15);
		t.seth(20);
		double area=t.getw()*t.geth();
		System.out.println("the area of Triangleone is :"+" "+area);
	
		// TODO Auto-generated method stub

	}

}
