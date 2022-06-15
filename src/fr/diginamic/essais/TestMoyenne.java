package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculMoyenne calc = new CalculMoyenne();
		
		calc.ajout(10);
		calc.ajout(15);
		calc.ajout(20);
		calc.ajout(12);
		
		System.out.println(calc.calcul());

	}

}
