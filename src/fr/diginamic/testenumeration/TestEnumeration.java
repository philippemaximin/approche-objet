package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saison[] saison = Saison.values();
		
		for (Saison saisons:saison) {
			System.out.println(saisons);
		}
		
		
		String nom = "ETE";
		Saison ete = Saison.valueOf(nom);
		
		System.out.println(ete.getLibelle());
		
		String libelle = "hivers";
		Saison saisonLibelle = Saison.getSaisonLibelle(libelle);
		System.out.println(saisonLibelle);
	}

}
