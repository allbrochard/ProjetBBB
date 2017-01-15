package Projet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {

		JFrame login = new JFrame(){

			public void Login(){

				setSize(300,150);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				JPanel pan1= new JPanel();
				JButton bouton = new JButton(" LOGIN ");
				JTextField txuser = new JTextField(15);

				pan1.add(bouton);
				pan1.add(txuser);
				this.setContentPane(pan1);
				this.setVisible(true);
				pan1.setVisible(true);
				System.out.println("salut");
			}
		};
	}
}