package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	static private String chaine = "Durand;Marcel;2 523.5";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		char premierCaractere = chaine.charAt(0); 
		System.out.println("Premier caractère: " + premierCaractere);
		
		//2
		System.out.println(chaine.length());
		
		//3
		System.out.println(chaine.indexOf(";"));
		
		//4	
		System.out.println(chaine.substring(0, chaine.indexOf(";")));
		
		//5
		System.out.println(chaine.substring(0, chaine.indexOf(";")).toUpperCase());
		
		//6
		System.out.println(chaine.substring(0, chaine.indexOf(";")).toLowerCase());
		
		//7
		String[] tab = chaine.split(";");
		
		for (int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
		
		//9
		Salarie personnel = new Salarie(tab[0], tab[1], Double.parseDouble(tab[2].replace(" ", "")));
		
	}
}
