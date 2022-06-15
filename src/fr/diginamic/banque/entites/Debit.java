package fr.diginamic.banque.entites;

public class Debit extends Operation{

	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		// TODO Auto-generated constructor stub
	}
	
	public String getType() {
		return "DEBIT";
	}

	public String toString() {
		return super.toString();
	}
}
