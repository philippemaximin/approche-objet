package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne a = new Personne();
		a.nom = "Lagaffe";
		a.prenom = "Gaston";
		a.adresse.codePostal = 34000;
		a.adresse.libelleRue = "Rue de Miramas";
		a.adresse.codePostal  = 65;
		a.adresse.ville = "Montpellier";
		
		Personne b = new Personne();
		b.nom = "Dupuis";
		b.prenom = "Spirou";
		b.adresse.codePostal = 69000;
		b.adresse.libelleRue = "Rue des Lunettes";
		b.adresse.codePostal  = 5;
		b.adresse.ville = "Lyon";
		
	}

}
