package jeu;

import java.util.ArrayList;

public class Plateau {
	private final int NB_CASES = 63;
	private ArrayList<Case> cases = new ArrayList<>();
	
	public Plateau() {
		for (int i = 0; i <= NB_CASES; i++) {
			cases.add(new Case(i));
		}
	}
	
	private void iniatialisationCaseSpecifique() {
		// TODO initialisation des cases spécifiques
	}
	
	public Case donnerCase(int numCase) {
		if (numCase < 0) {
			numCase = 0;
		} else if (numCase >= NB_CASES) {
			numCase = NB_CASES;
		}
		return cases.get(numCase);
	}
	
	public Case caseDebutPartie() {
		return cases.get(0);
	}
	
	public int numCaseFinale() {
		return NB_CASES;
	}
}
