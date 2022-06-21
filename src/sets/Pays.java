package sets;

public class Pays {
	private String nom;
	private int nbHabitant;
	private double pibHabitant;
	
	public Pays(String nom, int nbHabitant, double pibHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibHabitant = pibHabitant;
	}

	public String getNom() {
		return nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public double getPibHabitant() {
		return pibHabitant;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return this.nom;
	}
	

}
