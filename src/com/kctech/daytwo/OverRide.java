package com.kctech.daytwo;

class Car
{
	void run() {
		System.out.println("The car is running");
	}
	void run(int s) {
		System.out.println("The car tuned for given speed");
	}
	
}
class Bike extends Car{
	void run() {
		System.out.println("The bike is running");
	}
	void run(int s) {
	System.out.println("The bike is tuned for given speed");
	}
}

public class OverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bike b= new Bike();
			b.run();
			b.run(100);
	}

}
