package fr.diginamic.maps;

import java.util.HashMap;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> mapVilles = new HashMap<Integer, String>(); 
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		//Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		for (Integer key : mapVilles.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("-----------------------");
		
		//Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		for (String values : mapVilles.values()) {
			System.out.println(values);
		}
		
		System.out.println("-----------------------");
		
		//Afficher la taille de la map
		System.out.println(mapVilles.size());
		
	}

}
