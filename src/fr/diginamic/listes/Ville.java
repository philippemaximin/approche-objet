package fr.diginamic.listes;

public class Ville {
	private String nom;
	private int nbHabitant;
	
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	public String getNom() {
		return nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}
	
	public String toString() {
		return getNom();
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
