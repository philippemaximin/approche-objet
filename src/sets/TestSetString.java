package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> myVar = new HashSet<String>();
		
		myVar.add("USA");
		myVar.add("France");
		myVar.add("Allemagne");
		myVar.add("UK");
		myVar.add("Italie");
		myVar.add("Japon");
		myVar.add("Chine");
		myVar.add("Russie");
		myVar.add("Inde");
		
		int cptLettre = 0;
		String nomPays = "";
		
		for (String s : myVar) {
			if (cptLettre < s.length()) {
				cptLettre = s.length();
				nomPays = s;
			}
		}
		
		myVar.remove(nomPays); //suppression du Pays avec le plus de lettre 
		
		System.out.println(myVar);
	}
}
