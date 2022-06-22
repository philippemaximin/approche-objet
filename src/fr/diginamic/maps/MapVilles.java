package fr.diginamic.maps;

import java.util.HashMap;

import fr.diginamic.listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//créez une map permettant de stocker les instances de villes (valeur) en fonction de leur nom (clé).
		HashMap<String, Ville> city = new HashMap<String, Ville>();
		city.put("Nice", new Ville("Nice", 343000));
		city.put("Carcassonne", new Ville("Carcassonne", 47800));
		city.put("Narbonne", new Ville("Narbonne", 53400));
		city.put("Lyon", new Ville("Lyon", 484000));
		city.put("Foix", new Ville("Foix", 9700));
		city.put("Pau", new Ville("Pau", 77200));
		city.put("Marseille", new Ville("Marseille", 850700));
		city.put("Tarbes", new Ville("Tarbes", 40600));
		
		
		
		//Recherche et suppression ville la moins peuplé
		int tmpNbHb = 0;
		int index = 0;
		String tmpKey= "";
		
		for (String key : city.keySet()) {
			if (index == 0) {
				tmpNbHb = city.get(key).getNbHabitant();
			} 
			else {
				if ( tmpNbHb > city.get(key).getNbHabitant() ) {
					tmpNbHb = city.get(key).getNbHabitant();
					tmpKey = key;
				}
			}
			
			index ++;
		}
		
		System.out.println( "\nSuppression de la ville la moins peuplé : " + tmpKey );
		city.remove(tmpKey);
		
		//Affichez l’ensemble des villes restantes
		System.out.println(city);

	}

}
