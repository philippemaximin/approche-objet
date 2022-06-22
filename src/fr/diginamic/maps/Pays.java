package fr.diginamic.maps;

public class Pays {
	private String nom;
	private String nbHabitant; 
	private String continent;
	
	public Pays(String nom, String nbHabitant, String continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public String getNbHabitant() {
		return nbHabitant;
	}

	public String getContinent() {
		return continent;
	}
	
	
	
}
