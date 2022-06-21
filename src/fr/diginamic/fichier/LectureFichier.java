package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path pathFile= Paths.get("./recensement.csv");
		
		if ( Files.isReadable(pathFile) ) {
			List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);
			System.out.println(lines);
		}

		
		System.out.println("\n");
		
		//Exercice LireFichierAvecInstanciation
		ArrayList<Ville> tabVille = new ArrayList<Ville>();
		boolean premiereLigneLu = false;
	
		if ( Files.isReadable(pathFile) ) {
			List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);
			
			for (String ligne: lines ) {
				String[] tokens = ligne.split(";");
				
				/** 
				 	0 - Code région; 
					1 - Nom de la région; 
					2 - Code département;
					3 - Code arrondissement;
					4 - Code canton;
					5 - Code commune;
					6 - Nom de la commune;
					7 - Population municipale;
					8 - Population comptée à part;
					9 - Population totale;
				*/
				
				if (premiereLigneLu) {
					tabVille.add( new Ville(tokens[6], tokens[2], tokens[1], Integer.valueOf(tokens[9].replaceAll(" ", ""))) );
				}
				
				premiereLigneLu = true;
			}
		}
		
		
	}

}
