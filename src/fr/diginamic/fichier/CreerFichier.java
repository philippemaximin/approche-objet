package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path pathFile= Paths.get("./recensement.csv");

		
		int i = 0;
		String s= "";
		
		if ( Files.isReadable(pathFile) ) {
			List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);


			for(String line: lines) {
				if (i < 100) {
					s = line + "\n";
					
					if (i == 0) {
						Files.write(
		                    Paths.get("./monFichier.txt"),
		                    s.getBytes(StandardCharsets.UTF_8));
					}
					else {
						Files.write(
		                    Paths.get("./monFichier.txt"),
		                    s.getBytes(StandardCharsets.UTF_8),
		                    StandardOpenOption.APPEND);
					}
				}
				
				i++;
			}
			
		}
	}

}
