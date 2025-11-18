package jeu;

public class Oie {
	private Case casePlateau;
	private Couleur couleur;
	private Journal journal;
	private Plateau plateau;
	private De de;
	
	public Oie(Couleur couleur, Plateau plateau, De de) {
		this.couleur = couleur;
		this.plateau = plateau;
		this.de = de;
		this.casePlateau = new Case(0);
		this.journal = new Journal();
	}
	
	public Couleur getCouleur() {
		return couleur;
	}

	public Plateau getPlateau() {
		return plateau;
	}
	
	public boolean action() {
		casePlateau = casePlateau.depart(this);
		this.journal.afficherMessage();
		
		int numCase = casePlateau.getNum();
		int caseFinale = plateau.numCaseFinale();
		if (numCase >= caseFinale) {
			ajouterMessage("L'oie " + couleur + " a gagné la partie !\n");
			this.journal.afficherMessage();
			return true;
		}
		
		return false;
	}
	
	public int lancerDe() {
		return de.lancer();
	}
	
	public void ajouterMessage(String message) {
		journal.ajouterMessage(message);
	}
}
