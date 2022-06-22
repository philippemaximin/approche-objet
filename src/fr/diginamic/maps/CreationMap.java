package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> person = new HashMap<String, String>();
		
		person.put("Paul", "1750 €");
		person.put("Hicham", "1825 €");
		person.put("Yu", "2250 €");
		person.put("Ingrid", "2015 €");
		person.put("Chantal", "2418 €");
	
		System.out.println("taille de la map : " + person.size());
	}

}
