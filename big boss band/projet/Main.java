package projet;

public class Main {

	public static void main(String[] args) {


<<<<<<< HEAD
		Admin adm = new Admin("admin", "admin", "Fett", "Tarti", 26);


		Connexion con = new Connexion();
		con.getInstance();


		//Graphique JFrame = new Graphique();
		//FenetreEtudiantFormateur JFrame = new FenetreEtudiantFormateur();	
		//FenetreAdmin JFrame = new FenetreAdmin();
		FenetreResponsable respon = new FenetreResponsable();
=======
		Admin adm = new Admin();


		Connexion con = new Connexion();
		con.getInstance();

		
		//Graphique JFrame = new Graphique();
		//FenetreEtudiantFormateur JFrame = new FenetreEtudiantFormateur();	
		//FenetreAdmin JFrame = new FenetreAdmin();
		//FenetreResponsable respon = new FenetreResponsable();
>>>>>>> branch 'master' of https://github.com/allbrochard/ProjetBBB.git

	

	adm.creeCompte();
		
	}
}
