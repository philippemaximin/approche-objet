package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ville v1 = new Ville("Paris", 1_000_000);
		Ville v2 = new Ville("Paris", 1_000_000);
		
		//Vérifiez que la méthode equals retourne true pour 2 instances de villes qui ont les mêmes attributs.
		System.out.println(v1.equals(v2));
		
		//Vérifiez maintenant que la méthode retourne false si vous changez un des attributs.
		Ville v3 = new Ville("Paris", 1_000_000);
		Ville v4 = new Ville("Lyon", 1_000_000);
		
		System.out.println(v3.equals(v4));
		
		//Faites le test maintenant en utilisant l’opérateur == avec les mêmes attributs, puis avec des attributs différents. Que constatez-vous ?
		System.out.println(v1 == v2); //False; instances differentes
		
		//Comment faire pour que la comparaison de 2 villes avecl’opérateur == retourne true.
		v2 = v1;
		System.out.println(v1 == v2); //True
	}

}
