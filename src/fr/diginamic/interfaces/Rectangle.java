package fr.diginamic.interfaces;

public class Rectangle implements ObjetGeometrique {
	private double longueur;
	private double largeur;
	
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return (this.longueur + this.largeur) * 2;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return this.longueur * this.largeur;
	}

}
