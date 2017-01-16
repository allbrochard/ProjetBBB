package Projet;

public class Main {

	public static void main(String[] args) {

		Connexion con = new Connexion();
		con.getInstance();

		//Graphique JFrame = new Graphique();
		//FenetreEtudiantFormateur JFrame = new FenetreEtudiantFormateur();	
		//FenetreAdmin JFrame = new FenetreAdmin();
		FenetreResponsable respon = new FenetreResponsable();
	}
}
