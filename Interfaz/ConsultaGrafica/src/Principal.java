import javax.swing.*;

import java.awt.Color;
import java.awt.color.*;
import java.awt.event.*;

public class Principal extends JFrame /*implements ActionListener*/ {
	
	private JTextArea area2;
	
    public Principal () {
		
		setTitle("Consulta de notas");
		setBounds(0,0,600,400);
		setResizable(false);
		setLocationRelativeTo(null);
		
		diseño();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void diseño () {

		
		JPanel panel2 = new JPanel ();
		setLayout(null);
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		this.getContentPane().add(panel2);
		
		area2 = new JTextArea();
		area2.setBounds(0, 0, 500,500);
		area2.setForeground(Color.WHITE);
		area2.setBackground(Color.BLACK);
		add(area2);		
		
	}
	
	public static void main(String[] args) {

		Principal ver = new Principal ();
		Graficacons je = new Graficacons();

		ver.setVisible(true);
	}

}
