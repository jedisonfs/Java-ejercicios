import javax.swing.*;

import java.awt.Color;
import java.awt.color.*;
import java.awt.event.*;

public class Principal extends JFrame /*implements ActionListener*/ {
	
	public JTextArea area2;
	
    public Principal () {
		
		setTitle("Consulta de notas");
		setBounds(0,0,600,400);
		setResizable(false);
		setLocationRelativeTo(null);
		
		diseño();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void diseño () {

		Graficacons je = new Graficacons();

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
		je.consulta(je.rel);
	}
	
	public void actionPerformed ()
	
	public static void main(String[] args) {

		
		Graficacons al=new Graficacons();
		Principal ver = new Principal ();
		
	//	al.consulta(al.buscar2 =al.text1.getText());	
		ver.setVisible(true);
		ver.area2.setText(al.rel);
	}

}
