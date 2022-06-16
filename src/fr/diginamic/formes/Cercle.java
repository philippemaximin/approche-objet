package fr.diginamic.formes;

public class Cercle extends Forme {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return this.rayon * this.rayon * 3.14;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return this.rayon * 2 * 3.14;
	}
}
