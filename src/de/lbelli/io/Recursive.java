package de.lbelli.io;

import java.io.*;
import java.nio.file.Files;

public class Recursive {
	public static void readDirectory (String fileName) {
		
		File file = new File(fileName);
		
		if(file.isDirectory()) {
			File [] listFiles = file.listFiles();
			
			for(File f : listFiles) {
				if(f.isFile())
					continue; 
				
					 System.out.println(f.getAbsolutePath());
					 readDirectory(f.getAbsolutePath());
				 	
			}
		}
	}
	 
	
	public static void main(String[] args) {
		String user = System.getProperty("user.home");
		Recursive.readDirectory(user);
	}
}
