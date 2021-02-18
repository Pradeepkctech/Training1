package com.kctech.daythree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
public class Collections {

	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<Object>();
		l.add(10);
		l.add(15);
		l.add(1, 25);
		l.add(25);
		
		System.out.println("ArrayList:"+" "+l);
		System.out.println(l.isEmpty());
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.addAll(l);
		System.out.println("elements of set="+" "+l);
		System.out.println("the size of set:"+ts.size());
		
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	hm.put("Carrot",100);
	hm.put("Tometto", 150);
	hm.put("Oninon", 120);
	System.out.println("before chngs the value"+hm);
	Set<?> s =hm.entrySet();
	
 Iterator<?> i =s.iterator();
 while(i.hasNext()) {
	 
	 @SuppressWarnings("unchecked")
	Map.Entry<String,Integer> em = (Map.Entry<String, Integer>)i.next();
	 if(em.getKey().equals("Tometto"))
		 em.setValue(110);
	 System.out.println(em.getKey()+":"+em.getValue());
		 
 }

	}

}
