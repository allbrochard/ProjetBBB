package projet;

public class Main {

	public static void main(String[] args) {


		Admin adm = new Admin();
		Connexion con = new Connexion();
		con.getInstance();

		
		//Graphique JFrame = new Graphique();
		//FenetreEtudiantFormateur JFrame = new FenetreEtudiantFormateur();	
		//FenetreAdmin JFrame = new FenetreAdmin();
		//FenetreResponsable respon = new FenetreResponsable();

	

		adm.creeCompte();
		
	}
}