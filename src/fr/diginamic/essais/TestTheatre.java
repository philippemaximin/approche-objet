package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theatre opera = new Theatre("opera", 50);
		
		opera.inscrire(10, 10);
		opera.inscrire(8, 10);
		opera.inscrire(2, 10);
		
		opera.inscrire(10, 10);
		opera.inscrire(8, 10);
		opera.inscrire(2, 10);
		
		opera.inscrire(1, 10);
		opera.inscrire(9, 10);
		
		opera.inscrire(1, 10); 
		
		System.out.println(opera.getTotalClientInscrit());
		System.out.println(opera.getRecetteTotale());
	}

}
