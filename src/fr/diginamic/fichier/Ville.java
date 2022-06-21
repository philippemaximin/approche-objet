package fr.diginamic.fichier;

public class Ville {
	private String nom;
	private String codeDepartement;
	private String NomRegion;
	private int populationTotale;
	
	
	public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
		super();
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		NomRegion = nomRegion;
		this.populationTotale = populationTotale;
	}


	public String getNom() {
		return nom;
	}


	public String getCodeDepartement() {
		return codeDepartement;
	}


	public String getNomRegion() {
		return NomRegion;
	}


	public int getPopulationTotale() {
		return populationTotale;
	}
	
	
	
}
