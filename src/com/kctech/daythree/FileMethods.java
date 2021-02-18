package com.kctech.daythree;

import java.io.File;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args) throws IOException {
	
		File f1 = new File("/Users/raghu/JavaFile/testone.txt");
	long l=f1.length();
	String name=f1.getName();
	System.out.println("The file length is="+" "+l);
	
	System.out.println("File name is :"+" "+name);
	System.out.println("Path of the file is-->"+f1.getPath());
	System.out.println("The parrent directory is:"+f1.getParentFile());

}
}
