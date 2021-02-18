package com.kctech.daythree;

import java.io.FileReader;

import java.io.IOException;

public class FileRead 
{
	
	public static void main(String[] args) {
		
	
	try
	{
	FileReader r = new FileReader("/Users/raghu/JavaFile/testone.txt");

	int output=r.read();
	while
		(output!=-1) {
		System.out.print((char)output);
		output=r.read();
		
	}
	r.close();
	}
	catch(IOException e)
	{
		
	}
}}

