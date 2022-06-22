package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long debut = System.currentTimeMillis();
		
		StringBuilder builder = new StringBuilder();
		
		for (int i=0; i<=100_000; i++) {
			builder.append(i);
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		
		System.out.println("--------------------");
		
		debut = System.currentTimeMillis();
		
		String s = "";
		
		for (int i=0; i<=100_000; i++) {
			s += i;
		}
		
		fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

	}

}
