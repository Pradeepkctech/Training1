package com.kctech.daythree;



class Workers{
	private int regno;  
	private String name;  
	//constructor of Employee class  
	public Workers(int regno, String name)   
	{  
	this.name = name;  
	this.regno = regno;  
	}  
	public int getRegno()   
	{  
	return regno;  
	}  
	 
	{  
	this.regno = regno;  
	}  
	public String getName()   
	{  
	return name;  
	}  
	public void setName(String name)   
	{  
	this.name = name;  
	}  
	
   @Override
	public boolean equals(Object obj)   
	{  
	if (obj == null)   
	return false;  
	if (obj == this)  
	return true;  
	return this.getRegno() == ((Workers) obj). getRegno();  
	}
	}  


public class HashComp {

	public static void main(String[] args) {
		//creating two instances of the Employee class  
	Workers w1 = new Workers(1011, "Pradeep");  
	Workers w2 = new Workers(1011, "Pradeep");  
		//invoking hashCode() method  
		int a=w1.hashCode();  
		int b=w2.hashCode();  
		System.out.println("hashcode of emp1 = " + a);  
		System.out.println("hashcode of emp2 = " + b);  
		System.out.println("Comparing objects emp1 and emp2 = " + w1.equals(w2));  
		
	}
}

	
