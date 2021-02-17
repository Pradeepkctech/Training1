package com.kctech.daytwo;

public class Interfaceone implements printable, display{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Interfaceone i = new Interfaceone();
		i.displaying();
		i.print();
		

	}

	@Override
	public void displaying() {
		// TODO Auto-generated method stub
		System.out.println("I'm a display method");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("I'm a print method");
		
	}

}
