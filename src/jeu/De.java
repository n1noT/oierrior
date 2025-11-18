package jeu;

import java.util.Random;

public class De {
	private Random random = new Random();
	
	public int lancer() {
		return random.nextInt(6) + 1; // Retourne un nombre entre 1 et 6
	}
}
