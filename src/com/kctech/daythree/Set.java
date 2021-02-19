package com.kctech.daythree;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<Object>();
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		
		System.out.println(hs);
		
		
		TreeSet <Object>ts= new TreeSet<Object>();
		ts.addAll(hs);
		
		ts.add(15);
		ts.add(15);
		System.out.println(ts);
		

	}

}
