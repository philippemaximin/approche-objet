package fr.diginamic.banque;

import java.text.CompactNumberFormat;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte[] cpt = {new Compte("0019101", 100), new CompteTaux("0002233", 999.57, 5)};
		
		for (int i=0; i<2; i ++) {
			System.out.println(cpt[i]);
		}
	}
}
