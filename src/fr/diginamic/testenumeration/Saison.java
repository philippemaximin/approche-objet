package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("printemps", 1),
	ETE("été", 2),
	AUTOMNE("automne", 3),
	HIVERS("hivers", 4);
	
	private String libelle;
	private int numero;
	
	
	private Saison(String libelle, int numero) {
		this.libelle = libelle;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(numero).append(" ").append(libelle).toString();
	}
	

	public String getLibelle() {
		return libelle;
	}


	public int getNumero() {
		return numero;
	}
	
	public static Saison getSaisonLibelle(String libelle) {
		for (Saison sai: Saison.values()) {
			if (sai.getLibelle().equals(libelle)) {
				return sai;
			}
		}
		
		return null;
	}
	
	
	
}
