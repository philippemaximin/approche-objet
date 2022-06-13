package entites2;

public class AdressePostale {
	public int numeroDeRue;
	public String libelleRue;
	public String ville;
	public int codePostal;
	
	public AdressePostale() {
		super();
	}
	
	public AdressePostale(int numeroDeRue, String libelleRue, String ville, int codePostal) {
		super();
		this.numeroDeRue = numeroDeRue;
		this.libelleRue = libelleRue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	
	public String toString() {
	   return this.numeroDeRue + " " + this.libelleRue + " " + this.codePostal + " " + this.ville;
	}
}
