package Projet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Graphique extends JFrame{
	
	String mp, log;
	JTextField txuser = new JTextField(15);
	JTextField txuser2 = new JTextField(15);  
	JPanel pan1= new JPanel();
	JPanel pan2 = new JPanel();
	JLabel login = new JLabel("LOGIN");
	JLabel password = new JLabel("Password");
	JButton connecte = new JButton ("Connection");
	
	public Graphique (){

		
		
		setSize(250,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		pan1.add(login);
		pan1.add(txuser);
		pan1.add(password);
		pan1.add(txuser2);
		pan1.add(connecte);
		

		
		this.setContentPane(pan1);
		pan1.setVisible(true);
		this.setVisible(true); 
		
		


	}
	class Connecte implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			log = txuser.getText();
			mp = txuser2.getText();
			
		}
		
		
	}
	public void mouseClicked(MouseEvent arg0) {
	

	}


	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}