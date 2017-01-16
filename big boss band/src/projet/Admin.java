package projet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin extends Compte {
	

	public Admin() {
		
	}

	public boolean creeCompte(){
		Scanner sc = new Scanner(System.in);
		boolean res = false;
		String query = "INSERT INTO public.compte (nomcompte, prenomcompte, logcompte, pswdcompte, typecompte, agecompte) VALUES (?,?,?,?,?,?) RETURNING idcompte;";
		try {
			PreparedStatement prepare = Connexion.getInstance().prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			System.out.print("Rentrez le nom : ");
			prepare.setString(1, sc.nextLine());
			System.out.print("Rentrez le prenom : ");
			prepare.setString(2, sc.nextLine());
			System.out.print("Rentrez le login : ");
			prepare.setString(3, sc.nextLine());
			System.out.print("Rentrez le mot de passe : ");
			prepare.setString(4, sc.nextLine());
			System.out.print("Rentrez le type de compte : ");
			prepare.setString(5, sc.nextLine());
			System.out.print("Rentrez l'age : ");
			prepare.setInt(6, sc.nextInt());
			
			//On execute la requete
			prepare.execute();
				
			//Si la requete s'est bien passee, on recupere le id_user qui a ete genere
			ResultSet result = prepare.getResultSet();
			if(result.first())
			{
				id = result.getInt(1);
				res = true;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	
		
	}

	public void modifCompte(){

	}

	public void supprCompte(){
		
	}
}

