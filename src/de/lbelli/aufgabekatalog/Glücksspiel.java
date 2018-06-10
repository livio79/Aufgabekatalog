package de.lbelli.aufgabekatalog;
// 4.5. Aufgabe: Glücksspiel s. 22

import java.util.*;

public class Glücksspiel {
	
	public void guess() {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("n 1");
		int guess1 = s.nextInt(); 
	
		System.out.println("n 2");
		int guess2 = s.nextInt();
		
		int number = r.nextInt(100) + 1;
		System.out.println(number);
		
		if(Math.abs(number - guess1) > Math.abs(number - guess2))
				System.out.println("player 2");
		
		else if(Math.abs(number - guess1) < Math.abs(number - guess2))
			System.out.println("player 1");
		
		else
			System.out.println("Unentschieden");
		
		
	}
	public boolean sameLast(int a, int b) {
		if((a%10) == b%10) return true;
		return false;
	}
	
	
	public void tabelle(int col, int row) {
		if(col < 1 || col > 13 || row < 1 || row > 13)
			System.out.println("NO");
		
		else {
			for(int i = 1; i <= row; i++) {
				for(int j = 1; j <= col; j++) {
					System.out.printf("%3d", j * i );
				}
				System.out.println();
			}
		}
	}
	
	
	public void passwortgenerator(String words) {
		String [] wordArray = words.split(" ");
		String password = "";
		
		for (int i = 0; i < wordArray.length; i++) {
			password += wordArray[i].charAt(0);
		}
		System.out.println(password + password.length());
	}
	
	
	
	public void sandwich(String word) {
		int firstBread = word.indexOf("bread");
		int secondBread = word.lastIndexOf("bread"); 
		
		if(firstBread == secondBread ||firstBread == -1)
			System.out.println("Nichts");
		else {
			System.out.println( word.substring(firstBread + 5, secondBread));
		}
	}
	
	public void sandhur(int n, char c) {
		int invert = 1;
		 
		
	
			
			for(int j = 0; j <= n/2; j+= invert) {
				for(int i = 0; i < j;  i++) {
					System.out.print(" ");
				}
				
				for(int k = 0; k < n - (j *2); k++) {
					System.out.print(c);
				}
				
				System.out.println(); 
			 }
			
			
			for(int j = n/2; j>= 0; j--) {
			
				for(int i = 0; i < j;  i++) {
					System.out.print(" ");
				}
				
				for(int k = 0; k < n - (j *2); k++) {
					System.out.print(c);
				}
				
				System.out.println(); 
			 } 
			
	}
	

	public static void main(String[] args) {
		 
		Glücksspiel g = new Glücksspiel();
		  
		g.sandhur(13, '*');
	}

}



















