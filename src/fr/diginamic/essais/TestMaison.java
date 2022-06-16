package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison myHome = new Maison();
		
		myHome.ajouterPiece( new Salon(30, 0) );
		myHome.ajouterPiece( new WC(5, 0) );
		myHome.ajouterPiece( new Cuisine(15, 0) );
		myHome.ajouterPiece( new Chambre(15, 1) );
		myHome.ajouterPiece( new SalleDeBain(10, 1) );
		
		myHome.ajouterPiece( null ); //declenche une exception
		myHome.ajouterPiece( new Chambre(-25, -1) ); //doit ne pas pouvoir etre produit
		
		System.out.println( myHome.getSuperficieTotale() );
		System.out.println( myHome.getSuperficieParEtage(1) );
	}

}
