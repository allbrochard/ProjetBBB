package Projet;

public abstract class Compte {
	String login, mp,nom,prenom;
	int age;
	protected int id;

	public Compte(String login, String mp, String nom, String prenom, int age){
		this.login=login;
		this.mp=mp;
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}

	public void checkPlanGen(){

	}

}
