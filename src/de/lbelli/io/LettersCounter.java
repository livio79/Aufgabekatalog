package de.lbelli.io;

import java.io.*;
import java.util.*;

public class LettersCounter {
	public static void main(String[] args) {
		
	 
	Map<Character, Integer> mappa = new HashMap<>();

	for(int i = 0; i < 23; i++) {
		mappa.put((char)(i + 97), 0);
	}

    	 
	File file = new File("C:\\Users\\belli\\Desktop\\MEDIA\\prova.txt");
	
	try(BufferedReader in = new BufferedReader ( new FileReader (file))){
		
		int x; 
		
		while ((x = in.read()) != -1) {
		char key = (char) x;
		 
		
		if(Character.isLetter(key)  && Character.isLowerCase(key)) {
			Integer value =  mappa.get(key);
			mappa.put(key, ++value);
		}
		
		}
		
		 
	} catch (IOException e) {
		e.getStackTrace();
	}
	
	
		
     Set<Character> aa = mappa.keySet();
	
     for(char c : aa) {
    	 System.out.print(c + " : ");
    	 System.out.println((Integer)mappa.get(c));
     }
	
     
}
	
	
	
}