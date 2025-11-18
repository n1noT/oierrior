package jeu;


public class Journal {
	private String message = "";
	
	public void ajouterMessage(String msg) {
		this.message += msg;
	}
	
	public void afficherMessage() {
		System.out.println(message);
		this.message = "";
	}
}
