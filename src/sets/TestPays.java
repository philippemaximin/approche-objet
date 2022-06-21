package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Pays> myVar = new HashSet<Pays>();
		
		myVar.add(new Pays("USA", 331_449_281, 55_805.204));
		myVar.add(new Pays("France", 68_014_000, 42_878));
		myVar.add(new Pays("Allemagne", 83_222_442, 45_466.116));
		myVar.add(new Pays("UK", 67_886_004,  49_761.126 ));
		myVar.add(new Pays("Italie", 60_359_546, 30_657.296));
		myVar.add(new Pays("Japon", 125_050_000, 39_047.860));
		myVar.add(new Pays("Chine", 1_411_780_000, 10_511));
		myVar.add(new Pays("Russie", 146_170_015, 9_972.495));
		myVar.add(new Pays("Inde", 1_326_093_247, 1_876.525));
	
		//le pays avec le PIB/habitant le plus important
		double tmpPib = 0.0;
		String nomPays = "";
		
		for (Pays p : myVar) {
			if (tmpPib < p.getPibHabitant()) {
				tmpPib = p.getPibHabitant();
				nomPays = p.getNom();
			}
		}
		
		System.out.println("le pays avec le PIB/habitant le plus important : " + nomPays);

		
		//Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
		for (Pays p : myVar) {
			if (tmpPib > p.getPibHabitant()) {
				tmpPib = p.getPibHabitant();
				nomPays = p.getNom();
			}
		}
		
		for (Pays p : myVar) {
			if (p.getNom() == nomPays) {
				p.setNom(nomPays.toUpperCase());
			}
		}
		
		System.out.println(myVar);
		
		
		//Supprimez le pays dont le PIB total est le plus petit
		Iterator<Pays> iter= myVar.iterator();
		
		while(iter.hasNext()) {
			Pays p= iter.next();
			
			if(p.getNom().equals( nomPays.toUpperCase() )) {
				iter.remove();
			}
		}
		
		System.out.println(myVar);
		
	}
}
