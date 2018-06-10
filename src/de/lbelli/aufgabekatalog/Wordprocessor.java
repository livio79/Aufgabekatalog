package de.lbelli.aufgabekatalog;

// 4.4. Aufgabe: Ein kleiner Wordprocessor seite 21

public class Wordprocessor { 
		
		 public void transformWords(String abc) {
			 String frase = "";
			 int start = 0;
			 int end = 0;
			 
			 for (int i = start; i < abc.length(); i++) {
				  
				end = abc.indexOf(" ", end + 1);
				
				if(end == -1) {
					end = abc.length(); 
				}
				String word = abc.substring(start, end);
				
				frase += upperLowerCase(word) + " ";
				
				
				if(end != abc.length())
						start = end + 1;
				else i = abc.length() -1;
			 }
			 
			 System.out.println(frase);
	    
		}
		 
		 public String upperLowerCase(String word) {
			 
			 if(word.charAt(0) == '_') word =  word.substring(1).toUpperCase();
			 if(word.charAt(word.length() -1) == '_') word = word.substring(0, word.length() -1).toLowerCase();
			 
			 return word;
		 }
		 
		 
		 public String rotate(String words, int rotation) {
			 if(rotation < 0 || rotation > words.length())
				 return "Nicht möglich";
			 
			return words = words.substring(rotation) + words.substring(0, rotation);
			 
		 }
		 
		 public void secondsCalculator(long sec) {
			     int jahr = 31_536_000;
			     int tage = 86400;
			     int stunde = 3600;
			     int minuten = 60;
			     
			     long totJahre = sec / jahr;
			     long rest = sec % jahr;
			     int totTage = (int) rest / tage;
			     rest %=(int) tage;
			     int totStunde =(int) rest / stunde;
			     rest %= stunde;
			     int totMinuten =(int) rest / minuten;
			     rest %= minuten;
			     
			     System.out.print(totJahre + " " + totTage + " " + totStunde + " " + totMinuten + " " + rest );
			     
			 
		 }
		 
		 public void berechnung(double x) { 
			 double a = Math.sqrt(3.5 + x);
			 double b = a * 5;
			 double c = b / 3;
			 double d = x + 10;
			 
			 double e = x - 4.1;
			 double f = d * e;
			 double g = c - f;
			 System.out.println(g);
			 
			 double g2 =  ((Math.sqrt(3.5 + x) * 5 ) / 3) - ( (x + 10.0) *  (x - 4.1));
			 System.out.println(g2);
		 }
			 
		 public boolean schaltJahr (int jahr) {
			return  (2016 - jahr) % 4 == 0;
		 }
		 
		 public static void main(String[] args) {
			 Wordprocessor wp = new Wordprocessor();
			   
			 
		}
	}
	
	
	
 