package de.lbelli.aufgabekatalog;

import java.util.*;

public class Collection {
	public static <T> String collectionToString(List<T> v) {
	
		String str = "";
		for(int i= v.size() -1; i>=0; i-- )
			str+= (i+1) + " ";
			
		return str;
	}
	
	public static void main(String[] args) {
		List<String> c = new ArrayList<>();
		
		for(int i=0; i< 5; i++) {
			c.add(i+"w ");
		}
		
		System.out.println(collectionToString(c));
		
		//System.out.println(c);
	}
}
