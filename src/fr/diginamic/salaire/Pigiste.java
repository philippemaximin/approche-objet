package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	private int jourTravaille;
	private double montantJournalier;
	
	public Pigiste(String nom, String prenom, int jourTravaille, double montantJournalier) {
		super(nom, prenom);
		this.jourTravaille = jourTravaille;
		this.montantJournalier = montantJournalier;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this.montantJournalier * this.jourTravaille;
	}

}
