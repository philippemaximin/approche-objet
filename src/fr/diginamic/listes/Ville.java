package fr.diginamic.listes;

import java.util.Objects;

import fr.diginamic.testenumeration.Continent;

public class Ville {
	private String nom;
	private int nbHabitant;
	private Continent continent;
	
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	
	public Ville(String nom, int nbHabitant, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}
	
	public String toString() {
		return getNom() + " continent : " + this.continent.getLibelle();
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public boolean equals(Object obj) {
		
		if ( !(obj instanceof Ville) ) {
			return false;
		}
			
		Ville other = (Ville) obj;
		return nbHabitant == other.nbHabitant && Objects.equals(nom, other.nom);
	}
	
	
	
}
