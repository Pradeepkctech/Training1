package com.kctech.daythree;
import java.io.File;

public class FolderCreation {

	public static void main(String[] args) {
		
		File file = new File("/Users/raghu/hi");
		boolean newfile=file.exists();
		System.out.println(newfile);
		if(newfile==false) {
			
			file.mkdir();
			}
		

	}

}
