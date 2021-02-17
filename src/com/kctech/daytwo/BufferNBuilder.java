package com.kctech.daytwo;
class Temp{
	StringBuilder a = new StringBuilder("kctech");
    StringBuffer  b = new StringBuffer("Gold Coast");
   
    
	void append()
	{
		System.out.println("After appends:");
        a.append(" welcomes you ");
        b.append(" IT tech");
        System.out.println(a);
        System.out.println(b);
       }
 void insert()
 {
	 System.out.println("after insert");
	 a.insert(3, "hi");
	 b.insert(2, "java");
	    System.out.println(a);
	    System.out.println(b);
 }
}

public class BufferNBuilder {

	public static void main(String[] args) {
		Temp t = new Temp();
		t.append();
		t.insert();
       
        
    
	}

}
