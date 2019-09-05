package interfaztramilenio;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.Image;
import java.awt.Color;
import java.awt.color.*;
import java.awt.image.*;
import java.awt.event.*;

public class InterfazOpciones extends JFrame implements ActionListener {
	
	private JButton boton1,boton2;

	public InterfazOpciones (){
		
		setTitle("Opciones");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
		setBounds(0, 0, 600, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		
		aspectoOpciones();
	}

	public void aspectoOpciones () {
		
		JPanel panel1 = new JPanel ();
		panel1.setLayout(null);
		getContentPane().setBackground(Color.white);
		this.add(panel1);
		
		JPanel panel2= new JPanel();
		panel2.setBounds(0,0,600,400);
		this.add(panel2);
		
		
		setLayout(null);
		boton1 = new JButton ("Recargar tarjeta");
		boton1.setBounds(100,100,90,30);
		add(boton1);
		boton1.addActionListener(this);
		
	}
	public void actionPerformed (ActionEvent e) {
		if(e.getSource()==boton1) {
			
		}
	}
	
	public static void main (String[] args) {
		
		InterfazOpciones ver =  new InterfazOpciones ();
		
		ver.setVisible(true);
	}
}
