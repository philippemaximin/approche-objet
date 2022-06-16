package fr.diginamic.interfaces;

/** 
 * Liste les méthodes obligatoires que doit posséder un objet géométrique
 * 
 *  @authorDIGINAMIC
 */
public interface ObjetGeometrique {
	/** 
	 * Retourne le périmètre d’une forme géométrique
	 * @returndouble
	 */
	double perimetre();
	
	/** 
	 * Retourne la surface
	 * @return double
	 */
	double surface();
}
