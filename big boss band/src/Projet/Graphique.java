package Projet;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Graphique extends JFrame{

	public Graphique (){
		
		JPanel pan1= new JPanel();
		JLabel login = new JLabel("LOGIN");
		JTextField txuser = new JTextField(15);
		JLabel password = new JLabel("Password"); 
		JTextField txuser2 = new JTextField(15);  
	
		JButton connecte = new JButton ("Connection");
		
		JPanel pan2 = new JPanel();
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		
		setSize(250,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);


		

		pan1.add(login);
		pan1.add(txuser);	
		pan1.add(password);
		pan1.add(txuser2);
		pan1.add(connecte);
		
		this.setContentPane(pan2);
		pan2.setVisible(true);
		this.setContentPane(pan1);
		pan1.setVisible(true);
		this.setVisible(true);

	}
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

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