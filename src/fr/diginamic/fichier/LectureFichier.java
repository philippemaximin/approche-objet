package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;



public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path pathFile= Paths.get("./recensement.csv");
		
		if ( Files.isReadable(pathFile) ) {
			List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);
			System.out.println(lines);
		}

		
		
	}

}
