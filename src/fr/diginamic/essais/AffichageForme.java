package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	static public void afficher(Forme form) {
		System.out.println("Perimetre : " + form.calculerPerimetre());
		System.out.println("Surface : " + form.calculerSurface());
		System.out.println("\n");
	}
}
