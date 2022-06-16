package fr.diginamic.salaire;

public class Salarie extends Intervenant{
	private double salaireMensuel;
	
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this.salaireMensuel;
	}
}
