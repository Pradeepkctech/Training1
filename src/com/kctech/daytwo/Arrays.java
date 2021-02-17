package com.kctech.daytwo;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50};
char b[]= {'a','b','c','d'};
String s[]= {"Hi","Hellow world!","Day two Training"};
int l = a.length;
System.out.println("int a[]:");
for(int i=0;i<=l-1;i++) {
	System.out.println(a[i]);
	
}
System.out.println("char[]c:");
for(char c:b)
{
	System.out.println(c);
}
System.out.println("String s[]:");
for(String ss:s) {
	System.out.println(ss);
}

	}

}
