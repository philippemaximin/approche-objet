package fr.diginamic.interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		
		tab[0] = new Cercle(5);
		tab[1] = new Rectangle(10, 5);
		
		for (int i=0; i<tab.length; i++) {
			System.out.println(tab[i].perimetre());
			System.out.println(tab[i].surface());
		}
		
	}

}
