package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cercle circle = new Cercle(10);
		Rectangle rect = new Rectangle(10, 5);
		Carre square = new Carre(10);
		
		AffichageForme.afficher(circle);
		AffichageForme.afficher(rect);
		AffichageForme.afficher(square);
	}

}
