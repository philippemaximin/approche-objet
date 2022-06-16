package fr.diginamic.listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> liste = new ArrayList<Integer>();
		int tmpMax, tmpMin;
		
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);

		tmpMax = liste.get(0);
		tmpMin = liste.get(0);
		
		for (int i : liste) {
			if (tmpMax < i) {
				tmpMax = i;
			}
			
			if (tmpMin > i) {
				tmpMin = i;
			}
			
			System.out.println(i);
		}
		
		System.out.println("taille de la liste : " + liste.size());
		System.out.println("Valeur Max : " + tmpMax);
		System.out.println("Valeur Min : " + tmpMin);
		
		liste.remove(Integer.valueOf(tmpMin));		//Suppression plus petite valeur trouvée
		
		for (int i : liste) {
			System.out.println(i);
		}
		
		//Mettre en positif les negatif
		System.out.println("\n Positif ");
		for (int i : liste) {
			if (i <0 ) {
				i = i * -1;
			}
			
			System.out.println(i);
		}
		
	}

}
