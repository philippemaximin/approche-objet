package entites;

import entites2.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = new AdressePostale();
	}

	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public String getNomPrenom () {
		return this.nom.substring(0, 1).toUpperCase() + this.nom.substring(1) + ' ' + this.prenom;
	}
	
	public void setNewNom (String name) {
		this.nom = name;
	}
	
	public void setNewPrenom (String lastname) {
		this.prenom = lastname;
	}
	
	public void setNewAdress(int numeroDeRue, String libelleRue, String ville, int codePostal) {
		this.adresse.codePostal = codePostal;
		this.adresse.ville = ville;
		this.adresse.libelleRue = libelleRue;
		this.adresse.numeroDeRue = numeroDeRue;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}
	
	
	
}
