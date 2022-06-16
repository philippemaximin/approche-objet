package fr.diginamic.formes;

public class Rectangle extends Forme {
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return this.longueur * this.largeur;
	}
	
	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return (this.longueur + this.largeur) * 2;
	}
	
	
}
