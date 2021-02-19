package com.kctech.daythree;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(3,15);
		System.out.println("ArrayList:");
		System.out.println(al);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addAll(al);
		ll.addFirst(25);
		System.out.println("LinkedList:");
		System.out.println(ll);
		

	}

}
