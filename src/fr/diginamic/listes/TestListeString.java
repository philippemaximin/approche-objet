package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> liste = new ArrayList<String>();
		int cptLetter = 0;
		String ville = "";
		
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");
	
		for ( String i : liste) {
			if ( cptLetter < i.length() ) {
				cptLetter = i.length();
				ville = i;
			}
		}
		
		System.out.println("Ville plus grand nombre de lettre : " + ville + "\n");
		
		
		//Afficher en Majuscule
		for ( String i : liste) {
			i = i.toUpperCase();
			System.out.println(i);
		}
		
		
		//Retirer les villes commencant par N
		Iterator<String> iter = liste.iterator();
		while (iter.hasNext()) {
			if ( iter.next().charAt(0) == 'N' ) {
				iter.remove();	
			}
        }
		
		
		System.out.println("\n ");
		
		for ( String i : liste) {
			System.out.println(i);
		}
	}

}
