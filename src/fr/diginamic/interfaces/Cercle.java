package fr.diginamic.interfaces;

public class Cercle implements ObjetGeometrique {
	private double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return this.rayon * 2 * 3.14;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return this.rayon * this.rayon * 3.14;
	}

}
