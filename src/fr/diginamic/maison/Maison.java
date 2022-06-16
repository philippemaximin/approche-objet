package fr.diginamic.maison;

public class Maison {
	private Piece[] home = new Piece[1];
	private boolean firstPass = false;
	
	
	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.superficie > 0 && piece.etage >= 0) {
			if ( !firstPass) {
				this.home[0] = piece;
				firstPass = true;
			} else {
				Piece[] tmp = new Piece[this.home.length + 1];
				
				for (int i=0; i<this.home.length; i++) {
	
					tmp[i] = this.home[i];
				}
				
				tmp[this.home.length] = piece;
				
				this.home = tmp;
				tmp = null;
			}
		}
	}
	
	
	public double getSuperficieTotale() {
		double superficie = 0;
		
		for (int i=0; i<this.home.length; i++) {
			superficie += this.home[i].superficie;
		}
		
		return superficie;
	}
	
	public double getSuperficieParEtage(int etage) {
		double superficie = 0;
		
		for (int i=0; i<this.home.length; i++) {
			if (this.home[i].etage == etage) {
				superficie += this.home[i].superficie;
			}
		}
		
		return superficie;
	}
	
	
}
