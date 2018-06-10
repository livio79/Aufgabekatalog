package de.lbelli.aufgabekatalog;

public class Auto implements Comparable{
	private String hersteller;
	private long lauflaistung;
	private double preise;
	private String farbe;
	private boolean unfallwagen;
	private String kraftstoff;
	private double PS;
	
	
	public Auto(String hersteller, long lauflaistung, double preise, String farbe, boolean unfallwagen,
			String kraftstoff, double pS) { 
		this.hersteller = hersteller;
		this.lauflaistung = lauflaistung;
		this.preise = preise;
		this.farbe = farbe;
		this.unfallwagen = unfallwagen;
		this.kraftstoff = kraftstoff;
		PS = pS;
	}
	
  
	public static void sortAutoPreis(Auto [] autos) {
 		for(int j = 1; j < autos.length; j++) {
			for(int i = 0; i < autos.length -j; i++) {
				double a = autos[i].preise;
				double b = autos[i+1].preise;
				 
				if(a > b) {
					Auto tmp = autos[i];
					autos[i] = autos[i+1];
					autos [i + 1] = tmp; 
					
				}
			}
		}
	}
	
	
	@Override
	public int compareTo(Object object) {
		Auto auto = (Auto) object;
		
		if(this.getPreise() < auto.getPreise())
			return -1;
		if(this.getPreise() > auto.getPreise())
			return 	1;
		
		if(this.getLauflaistung() < auto.getLauflaistung())
			return -1;
		if(this.getLauflaistung() > auto.getLauflaistung())
			return 1;
		return 0;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hersteller == null) ? 0 : hersteller.hashCode());
		result = prime * result + ((kraftstoff == null) ? 0 : kraftstoff.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (hersteller == null) {
			if (other.hersteller != null)
				return false;
		} else if (!hersteller.equals(other.hersteller))
			return false;
		if (kraftstoff == null) {
			if (other.kraftstoff != null)
				return false;
		} else if (!kraftstoff.equals(other.kraftstoff))
			return false;
		return true;
	}


	public String getHersteller() {
		return hersteller;
	}


	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}


	public long getLauflaistung() {
		return lauflaistung;
	}


	public void setLauflaistung(long lauflaistung) {
		this.lauflaistung = lauflaistung;
	}


	public double getPreise() {
		return preise;
	}


	public void setPreise(double preise) {
		this.preise = preise;
	}


	public String getFarbe() {
		return farbe;
	}


	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}


	public boolean isUnfallwagen() {
		return unfallwagen;
	}


	public void setUnfallwagen(boolean unfallwagen) {
		this.unfallwagen = unfallwagen;
	}


	public String getKraftstoff() {
		return kraftstoff;
	}


	public void setKraftstoff(String kraftstoff) {
		this.kraftstoff = kraftstoff;
	}


	public double getPS() {
		return PS;
	}


	public void setPS(double pS) {
		PS = pS;
	}


	@Override
	public String toString() {
		return "Auto [hersteller=" + hersteller + ", lauflaistung=" + lauflaistung + ", preise=" + preise + ", farbe="
				+ farbe + ", unfallwagen=" + unfallwagen + ", kraftstoff=" + kraftstoff + ", PS=" + PS + "]";
	}



	
	
}
