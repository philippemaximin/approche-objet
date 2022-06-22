package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Créez une ArrayList de Pays contenant les pays suivants :
		
		/** 
		 * 	France, 65 millions d’habitants, Europe
		 	Allemagne, 80 millions d’habitants, Europe
		 	Belgique,10millionsd’habitants,Europe
		 	Russie, 150 millions d’habitants, Asie
		 	Chine,1.4milliardsd’habitants,Asie
		 	Indonésie, 220 millions d’habitants, Océanie, 
		 	Australie, 20 millions d’habitants, Océanie
		 */
		 
		ArrayList<Pays> pays = new ArrayList<>();
		pays.add(new Pays("France", "65 millions", "Europe"));
		pays.add(new Pays("Allemagne", "80 millions", "Europe"));
		pays.add(new Pays("Belgique", "10 millions", "Europe"));
		pays.add(new Pays("Russie", "150 millions", "Asie"));
		pays.add(new Pays("Chine", "1.4milliards", "Asie"));
		pays.add(new Pays("Indonésie", "220 millions", "Océanie"));
		pays.add(new Pays("Australie", "20 millions", "Océanie"));
		
		
		//Utilisez une HashMap pour réaliser un comptage du nombre de pays par continent.
		HashMap<String, Integer> cpt = new HashMap<>();
		
		for (Pays country : pays) {
			System.out.println(country.getContinent());
			
			if ( cpt.containsKey(country.getContinent()) ) {
				cpt.put(country.getContinent(), cpt.get(country.getContinent()) + 1);
			}
			else {
				cpt.put(country.getContinent(), 1);
			}
		}
		
		System.out.println(cpt);
		
	}

}
