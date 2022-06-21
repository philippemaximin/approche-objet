package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> myVar = new HashSet<Double>();
		myVar.add(1.5);
		myVar.add(8.25);
		myVar.add(-7.32);
		myVar.add(13.3);
		myVar.add(-12.45);
		myVar.add(48.5);
		myVar.add(0.01);
		

		System.out.println(myVar);
		
		double tmpMax = 0.0;
		double tmpMin = 0.0;

		
		for (Double d : myVar) {
			if (tmpMax < d) {
				tmpMax = d;
			}
			
			if (tmpMin > d) {
				tmpMin = d;
			}
		}
		
		System.out.println("la plus grand nombre est : " + tmpMax);
		
		myVar.remove(tmpMin); //suppression de la plus petite valeur
		
		System.out.println(myVar);	
	}

}
