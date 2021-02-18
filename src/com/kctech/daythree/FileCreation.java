package com.kctech.daythree;
import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		File f = new File("/Users/raghu/JavaFile/test.txt");
		boolean check = f.exists();
		System.out.println(check);
		if(check==false) {
			try{
				f.createNewFile();
			}
			catch(IOException e) {
				e.printStackTrace();
				
			}
			
		}
		
		

	}

}
