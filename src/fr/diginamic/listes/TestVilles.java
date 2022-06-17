package fr.diginamic.listes;

import java.util.ArrayList;

public class TestVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> liste = new ArrayList<Ville>();
		
		liste.add( new Ville("Nice", 343000) );
		liste.add( new Ville("Carcassonne", 47800) );
		liste.add( new Ville("Narbonne", 53400) );
		liste.add( new Ville("Lyon", 484000) );
		liste.add( new Ville("Foix", 9700) );
		liste.add( new Ville("Pau", 77200) );
		liste.add( new Ville("Marseille", 850700) );
		liste.add( new Ville("Tarbes", 40600) );

		int tmpNbHb = 0;
		int tmpIndex = 0;
		int index = 0;
		
		//Recherche la ville la plus peuplé
		for (Ville ville : liste) {
			if ( tmpNbHb < ville.getNbHabitant() ) {
				tmpNbHb = ville.getNbHabitant();
				tmpIndex = index;
			}
			index ++;
		}
		
		System.out.println( "Ville la plus peuplé : " + liste.get(tmpIndex) );
		
		
		//Recherche et suppression ville la moins peuplé
		tmpNbHb = 0;
		index = 0;
		
		for (Ville ville : liste) {
			if (index == 0) {
				tmpNbHb = ville.getNbHabitant();
			} 
			else {
				if ( tmpNbHb > ville.getNbHabitant() ) {
					tmpNbHb = ville.getNbHabitant();
					tmpIndex = index;
				}
			}
			
			index ++;
		}
		
		System.out.println( "\nSuppression de la ville la moins peuplé : " + liste.get(tmpIndex) );
		liste.remove(tmpIndex);
		
		System.out.println("\nAffichage des villes restantes :");
		
		for (Ville ville : liste) {
			System.out.println(ville.getNom());
		}
		
		//Mettre en Maj ville de plus de 100K
		for (Ville ville : liste) {
			if ( ville.getNbHabitant() > 100_000 ) {
				ville.setNom( ville.getNom().toUpperCase() );
			}
		}
		
		//Affichage liste finale
		System.out.println("\nAffichage des villes restantes avec Maj :");
		
		for (Ville ville : liste) {
			System.out.println(ville.getNom());
		}
		
	}
}
