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

	public Graphique (){

	setSize(250,150);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
    JPanel pan1= new JPanel();
    JLabel login = new JLabel("LOGIN");
    JTextField txuser = new JTextField(15);

    JLabel password = new JLabel("Password"); 
    JTextField txuser2 = new JTextField(15);
    JButton bite = new JButton();    
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