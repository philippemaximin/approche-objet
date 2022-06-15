package fr.diginamic.banque.entites;

public abstract class Operation {
	String dateOperation;
	double montantOperation;
	
	
	public Operation(String dateOperation, double montantOperation) {
		super();
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
	
	public abstract String getType();
	
	public double getMontantOperation() {
		return montantOperation;
	}

	public String toString() {
		return this.dateOperation + " " + this.montantOperation;
	}
}




