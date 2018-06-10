package de.lbelli.aufgabekatalog;

import java.util.*;

public class AutoTest {
	public static void main(String[] args) {
		Auto ford = new Auto("Ford", 12, 1.0, "Schwarz", true, "Diesel", 50.0);
		Auto fiat = new Auto("Fiat", 18, 4.0, "Schwarz", true, "Benzin", 50.0);
		Auto audi = new Auto("Audi", 14, 4.0, "Schwarz", true, "Elektirik", 50.0);
		Auto bmw  = new Auto("BMW",  15, 4.0, "Schwarz", true, "Diesel", 50.0);
		Auto bmw2 = new Auto("BMW2", 16, 1.5, "Schwarz", true, "Diesel", 50.0);
		Auto bmw3 = new Auto("BMW3", 17, 3.5, "Schwarz", true, "Diesel", 50.0);
		Auto bmw4 = new Auto("BMW4", 18, 0.5, "Schwarz", true, "Diesel", 50.0);
		
		Auto [] autos = {audi, bmw, fiat, ford, bmw2,bmw3,bmw4};

//		 Auto.sortAutoPreis(autos);
//		 
//		for(Auto a : autos)
//			System.out.println(a.getHersteller() + " " + a.getPreise());
		
		List<Auto> autoList = Arrays.asList(autos);
		
		for(Auto a : autoList)
			System.out.println(a.getHersteller() + " " + a.getPreise() + " " + a.getLauflaistung());
		
		System.out.println();
		
		Collections.sort(autoList);
		
		for(Auto a : autoList)
			System.out.println(a.getHersteller() + " " + a.getPreise() + " " + a.getLauflaistung());
		
	
		
	}
}
