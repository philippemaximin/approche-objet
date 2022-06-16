package fr.diginamic.entites;

public class Theatre {
	private String name;
	private int capaMax;
	private int totalClientInscrit;
	private double recetteTotale;
	
	
	public Theatre(String name, int capaMax) {
		super();
		this.name = name;
		this.capaMax = capaMax;
	}


	public void inscrire (int nbClient, double prixPlace) {
		if ( this.totalClientInscrit + nbClient <= this.capaMax ) {
			this.totalClientInscrit += nbClient;
			this.recetteTotale += prixPlace * nbClient;
		}
		else {
			System.out.println("capacité max atteint");
		}	
	}


	public int getTotalClientInscrit() {
		return totalClientInscrit;
	}


	public double getRecetteTotale() {
		return recetteTotale;
	}
	
	
	
	
}
