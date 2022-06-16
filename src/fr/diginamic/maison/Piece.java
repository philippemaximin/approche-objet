package fr.diginamic.maison;

public abstract class Piece {
	protected double superficie;
	protected int etage;
	
	
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}
	
}
