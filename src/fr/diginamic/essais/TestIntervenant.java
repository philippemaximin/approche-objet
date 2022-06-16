package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie salarieJournal = new Salarie("Dupuis", "Spirou", 3200);
		System.out.println( salarieJournal.getSalaire() );
		salarieJournal.afficherDonnees("CDI", salarieJournal.getSalaire());
		
		System.out.println("\n");
		
		Pigiste pigis = new Pigiste("Lagaffe", "Gaston", 5, 60);
		System.out.println( pigis.getSalaire() );
		pigis.afficherDonnees("Independant", pigis.getSalaire());
	}

}
