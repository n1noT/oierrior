package jeu;

public class JeuOie {
	 
    private Oie[] oies;
    private int nbOie = 0; 
    private Plateau plateau = new Plateau();
    private De de = new De();

    public JeuOie(int nbOieMax) {   
        oies = new Oie[nbOieMax];
    }

    public void ajouterOie(Couleur couleur) { 
        if (nbOie < oies.length) {
            oies[nbOie] = new Oie(couleur, plateau, de);
            nbOie++;
        } else {
            System.out.println("Nombre maximum d'oies atteint.");
        }

    }

    public void jouer() {
    	boolean partieTerminee = false;
    	
    	while(!partieTerminee) {
			for (int i = 0; i < nbOie; i++) {
				Oie oieCourante = oies[i];
				partieTerminee = oieCourante.action();
				
				if (partieTerminee) {
					break;
				}
			}
		}
    }

}
