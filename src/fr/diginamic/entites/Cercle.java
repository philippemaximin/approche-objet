package fr.diginamic.entites;

public class Cercle {
	private double rayon;

	public Cercle(Double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double perimetreCercle() {
		return this.rayon * 2 * 3.14;
	}
	
	public double surfaceCercle() {
		return this.rayon * this.rayon * 3.14;
	}
}
