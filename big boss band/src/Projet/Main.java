package Projet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		JFrame login = new JFrame();

		
		
		login.setSize(300,150);
		login.setDefaultCloseOperation(0);
		JPanel pan1= new JPanel();
		JButton bouton = new JButton(" LOGIN ");
		JTextField txuser = new JTextField(15);

		pan1.add(bouton);
		pan1.add(txuser);
		login.setContentPane(pan1);
		login.setVisible(true);
		pan1.setVisible(true);
		
	
	}
	


}