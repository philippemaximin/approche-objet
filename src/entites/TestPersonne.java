package entites;

import entites2.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne a = new Personne("Lagaffe", "Gaston");
		a.nom = "Lagaffe";
		a.prenom = "Gaston";
		a.adresse.codePostal = 34000;
		a.adresse.libelleRue = "Rue de Miramas";
		a.adresse.codePostal  = 65;
		a.adresse.ville = "Montpellier";
		
		Personne b = new Personne("Dupuis", "Spirou");
		b.adresse.codePostal = 69000;
		b.adresse.libelleRue = "Rue des Lunettes";
		b.adresse.codePostal  = 5;
		b.adresse.ville = "Lyon";
		

		Personne c = new Personne("petit", "Cedric", new AdressePostale(1, "Rue des Lilas", "St Etienne", 42000));
		System.out.println(c.getNomPrenom());
		
		c.setNewNom("grand");
		System.out.println(c.getNomPrenom());
		
		c.setNewPrenom("Spirou");
		System.out.println(c.getNomPrenom());
		
		c.setNewAdress(65,  "Rue de Miramas", "Montpellier", 34000);
		
		System.out.println(c.getNom());
		System.out.println(c.getPrenom());
		System.out.println(c.getAdresse());
	}

}
