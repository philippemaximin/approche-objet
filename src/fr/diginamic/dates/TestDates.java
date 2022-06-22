package fr.diginamic.dates;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Créez une instance de la classe java.util.Date à la date du jour en utilisant un de ses constructeurs
		Date d1 = new Date(122, 5, 22, 16, 35, 30);
		
		System.out.println(d1);
		
		//Affichez l’instance ainsi créée au format suivant : jour/mois/année (sans la partie heure)
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(d1));
		
		
		//Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30 secondes
		Date d2 = new Date(116, 4, 19, 23, 59, 30);
		
		System.out.println(d2);
		
		// Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
		formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:s");
		System.out.println(formateur.format(d2));
		
		//Créez une instance de Date contenant la date/heure système et affichez-la au même format que ci-dessus.
		Date d3 = new Date(System.currentTimeMillis());
		System.out.println(formateur.format(d3));	
	}	

}
