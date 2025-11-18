package jeu;

public class MainJeuOie {
	public static void main(String[] args) {
		JeuOie jeu = new JeuOie(3);
		jeu.ajouterOie(Couleur.JAUNE);
		jeu.ajouterOie(Couleur.VERTE);
		jeu.ajouterOie(Couleur.BLEU);
		jeu.jouer();
	}
}
