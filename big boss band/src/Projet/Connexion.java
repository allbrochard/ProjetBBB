package Projet;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class Connexion {
	
	private String url = "jdbc:postgresql://localhost:5432/projetBBB";

	//Nom du user

	private String user = "postgres";

	//Mot de passe de l'utilisateur

	private String passwd = "z45rik8521";

	//Objet Connection

	private static Connection connect;

	//Constructeur priv�.
	
	public Connexion(){

		try {

			connect = DriverManager.getConnection(url, user, passwd);

		} catch (SQLException e) {

			e.printStackTrace();

		}
		
	}
	public static Connection getInstance(){
		if(connect == null){
			new Connexion();
			System.out.println("INSTANCIATION DE LA CONNEXION SQL ! ");
		}
		else{
			System.out.println("CONNEXION SQL EXISTANTE ! ");
		}
		return connect;   
	}
	public void connexionTest(){
		try {

			//Nous appelons quatre fois la m�thode getInstance()

			PreparedStatement prepare = Connexion.getInstance().prepareStatement("SELECT * FROM classe WHERE cls_nom = ?");


			Statement state = Connexion.getInstance().createStatement();


			Connexion.getInstance().setAutoCommit(false);


			DatabaseMetaData meta = Connexion.getInstance().getMetaData();



		} catch (SQLException e) {

			e.printStackTrace();

		}

	}
}
