package entites;

import entites2.AdressePostale;

public class TestAdressePostale {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		AdressePostale a = new AdressePostale();
		a.codePostal = 34000;
		a.libelleRue = "Rue de Miramas";
		a.numeroDeRue = 65;
		a.ville = "Montpellier";
		
		AdressePostale b = new AdressePostale();
		b.codePostal = 69000;
		b.libelleRue = "Rue des Groseilles";
		b.numeroDeRue = 3;
		b.ville = "Lyon";
	}
}
