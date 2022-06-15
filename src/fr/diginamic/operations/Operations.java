package fr.diginamic.operations;

public class Operations {
	
	 public static double operationMathematiques( double a, double b, char operateur ) {
        double resultat = 0.0;
        
        switch (operateur) {
			case '+': 
				resultat = a + b;
				break;
			case '-': 
				resultat = a - b;
				break;
			case '*': 
				resultat = a * b;
				break;
			case '/': 
				resultat = a / b;
				break;		
        }
		
		return resultat;
    }
}
