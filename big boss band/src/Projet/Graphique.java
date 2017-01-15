package Projet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Graphique extends JFrame{

	public Graphique (){

		setSize(300,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel pan1= new JPanel();
		JButton login = new JButton("LOGIN");
		JTextField txuser = new JTextField(15);
	
		JButton password = new JButton("Password");
		JTextField txuser2 = new JTextField(15);
		
		JButton connecte = new JButton ("Connection");
		pan1.add(login);
		pan1.add(txuser);
		this.setContentPane(pan1);
		pan1.setVisible(true);
		System.out.println("salut");
	
		pan1.add(password);
		pan1.add(txuser2);
		this.setContentPane(pan1);
		pan1.setVisible(true);
		pan1.add(connecte);
		this.setVisible(true);
	}		
}