package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle1 = CercleFactory.newCercle(10);
		Cercle cercle2 = CercleFactory.newCercle(18);
		
		System.out.println(cercle1.perimetreCercle());
		System.out.println(cercle1.surfaceCercle());
		
		System.out.println("\n");
		
		System.out.println(cercle2.perimetreCercle());
		System.out.println(cercle2.surfaceCercle());
	}

}
