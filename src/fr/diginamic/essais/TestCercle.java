package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle1 = new Cercle(10.0);
		Cercle cercle2 = new Cercle(18.0);
		
		System.out.println(cercle1.perimetreCercle());
		System.out.println(cercle1.surfaceCercle());
		
		System.out.println("\n");
		
		System.out.println(cercle2.perimetreCercle());
		System.out.println(cercle2.surfaceCercle());
	}

}
