package fr.diginamic.banque.entites;


public class CompteTaux extends Compte {
	private int tauxDeRemuneration;
	
	public CompteTaux(String numero, double solde, int tauxDeRemuneration) {
		super(numero, solde);
		// TODO Auto-generated constructor stub
		this.tauxDeRemuneration = tauxDeRemuneration;
	}
	
	public String toString() {
		return super.toString() + " " + this.tauxDeRemuneration;
	}
}
