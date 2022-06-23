package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Paris", 0, Continent.EUROPE));
		villes.add(new Ville("NY", 0, Continent.AMERIQUE));
		villes.add(new Ville("Moscou", 0, Continent.ASIE));
		villes.add(new Ville("Ghana", 0, Continent.AFRIQUE));
		
		for (Ville ville:villes) {
			System.out.println(ville);
		}
	}

}
