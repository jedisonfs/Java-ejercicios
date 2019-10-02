package interfaztramilenio;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.Image;
import java.awt.Color;
import java.awt.color.*;
import java.awt.image.*;
import java.awt.event.*;

public class InterfazOpciones extends JFrame implements ActionListener {

	private JButton botonrecarga, boton2, boton3;
	private JPanel panel1;
	private JTextField camrecarga;

	public InterfazOpciones() {

		setTitle("Opciones");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
		setSize(600, 400);
		setResizable(false);
		setLayout(null);

		setLocationRelativeTo(null);
		aspectoOpciones();
	}

	public void aspectoOpciones() {

		JPanel panel1 = new JPanel ();
		panel1.setLayout(null);
		getContentPane().setBackground(Color.white);
		this.add(panel1);
		
		setLayout(null);
		botonrecarga = new JButton ("Recargar tarjeta");
		botonrecarga.setBounds(80,130,150,30);
		add(botonrecarga);
		botonrecarga.addActionListener(this);
		
		boton2 = new JButton ("Ver saldo");
		boton2.setBounds(80,300,150,30);
        add(boton2);		
        boton2.addActionListener(this);
        
        boton3 = new JButton("Personalizar tarjeta");
        boton3.setBounds(380,300,170,30);
        add(boton3);
        boton3.addActionListener(this);
	}
	public void actionPerformed (ActionEvent e) {
		Recarga ver3 = new Recarga();
		
		if(e.getSource()==botonrecarga) {
			ver3.setVisible(true);
		}
	}
	
	public void recargaTarjeta() {
		
	}
	
	public static void main (String[] args) {
		
		InterfazOpciones ver =  new InterfazOpciones ();
		
		ver.setVisible(true);
	}
}