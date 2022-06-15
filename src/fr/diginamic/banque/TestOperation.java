package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] op = {
				new Debit("21-02-2022", 100), 
				new Debit("19-05-2022", 20), 
				new Debit("28-05-2022", 76), 
				new Debit("22-06-2022", 750), 
				
				new Credit("28-12-2021", 1240), 
				new Credit("28-01-2022", 1240), 
				new Credit("28-02-2022", 1240), 
				new Credit("15-04-2022", 680)};
		
		int montantGlobal = 0;
		
		for (int i=0; i<op.length; i++) {
			System.out.println(op[i].getType() + " : " + op[i]);
			
			if (op[i].getType() == "CREDIT") {
				montantGlobal += op[i].getMontantOperation();
			} else {
				montantGlobal -= op[i].getMontantOperation();
			}
		}
		
		System.out.println("montant global : " + montantGlobal);
	}

}
