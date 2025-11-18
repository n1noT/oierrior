package jeu;

public class Case {
	private int numCase;
	
	public Case(int numCase) {
		this.numCase = numCase;
	}
	
	public String getNom() {
		return "Numéro " + numCase;
	}
	
	public int getNum() {
		return numCase;
	}
	
	public Case depart(Oie oie) {
		Couleur couleur = oie.getCouleur();
		String nomCase = this.getNom();
		oie.ajouterMessage("L'oie " + couleur + " est sur la case " + nomCase + "\n");
		
		int valeurDes = oie.lancerDe();
		oie.ajouterMessage("Elle obtient " + valeurDes + "\n");
		
		Case casePlateau = this.suivante(oie, valeurDes + numCase);
		return casePlateau;
	}
	
	public Case arrivee(Oie oie) {
		String nomCase = this.getNom();
		oie.ajouterMessage("Elle se déplace jusqu'à la case " + nomCase + "\n");
		return this;
	}
	
	protected Case suivante(Oie oie, int numCaseDestination) {
		Plateau plateau = oie.getPlateau();
		Case caseDestination = plateau.donnerCase(numCaseDestination);
		Case caseArrivee = caseDestination.arrivee(oie);
		
		return caseArrivee;
	}
}
