package Projet;
import java.awt.Color;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Main {
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

	}
}