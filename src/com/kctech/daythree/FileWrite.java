package com.kctech.daythree;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		
		File obj=new File("/Users/raghu/JavaFile/testone.txt");
		boolean chk =obj.exists();
		System.out.println(chk);
		if(chk==false) {
			try{
				obj.createNewFile();
				FileWriter writer = new FileWriter("/Users/raghu/JavaFile/testone.txt");
				writer.write("File was \n created and firstline was writted");
				writer.flush();
				writer.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
