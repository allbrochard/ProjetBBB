package projet;

import java.awt.BorderLayout;
<<<<<<< HEAD
import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

=======
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
>>>>>>> branch 'master' of https://github.com/allbrochard/ProjetBBB.git
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FenetreResponsable extends JFrame implements MouseListener{

	public FenetreResponsable(){
		
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(this);
		setResizable(false);
		setLocationRelativeTo(null);
	
		JPanel pan1= new JPanel();
		
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		bar.setLayout(new BorderLayout());
		JButton planning = new JButton("Planning");
		bar.add(planning, BorderLayout.WEST);
		JButton deco = new JButton("deconnexion");
		bar.add(deco, BorderLayout.EAST);
		
	
		JMenu Reservation = new JMenu("Reservation");
		bar.add(Reservation, BorderLayout.CENTER);
		JMenuItem CreerResa = new JMenuItem("Creer une Reservation");
		Reservation.add(CreerResa);
		JMenuItem ModifResa = new JMenuItem("Modifier une Reservation");
		Reservation.add(ModifResa);
		JMenuItem SuppResa = new JMenuItem("Supprimer une Reservation");
		Reservation.add(SuppResa);

		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
