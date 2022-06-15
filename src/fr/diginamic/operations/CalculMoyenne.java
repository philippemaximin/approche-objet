package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	private double[] tab = new double[1];

	private boolean firstPass = false;
	
	
	
	public void ajout (double a) {	
		if ( !firstPass) {
			tab[0] = a;
			firstPass = true;
		} else {
			double[] tmp = new double[this.tab.length + 1];
			
			for (int i=0; i<this.tab.length; i++) {
				tmp[i] = this.tab[i];
			}
			
			tmp[this.tab.length] = a;
			
			this.tab = tmp;
			tmp = null;
		}
	}
	
	
	public double calcul() {
		double tmp = 0.0;
		
		for (int i=0; i<this.tab.length; i++) {
			tmp += this.tab[i];
		}
		
		return tmp/this.tab.length;
	}
}
