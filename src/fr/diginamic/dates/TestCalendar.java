package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du
		//19 mai 2016 à 23h59 et 30 secondes et affichez-la au format suivant : ▪ jour/mois/année
		Calendar cal= Calendar.getInstance();
		
		cal.set(2016, 4, 19, 23, 59, 30);
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(cal.getTime()));
		
		//Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du jour
		Calendar calendar = Calendar.getInstance(); 
		
		//Affichez l’instance ainsi créée au format suivant : ▪ année/mois/jour heure:minute:seconde
		formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:s");
		System.out.println(formateur.format(calendar.getTime()));
		
		
		//Affichez la même instance avec le nom des jours et des mois en français, russe, chinois et allemand.
		formateur = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
		System.out.println(formateur.format(calendar.getTime()));
		
		formateur = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru", "RU"));
		System.out.println(formateur.format(calendar.getTime()));
		
		formateur = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINESE);
		System.out.println(formateur.format(calendar.getTime()));
		
		formateur = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("de", "DE"));
		System.out.println(formateur.format(calendar.getTime()));
		
		
		
	}
}
