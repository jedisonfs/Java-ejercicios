package interfaztramilenio;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.Image;
import java.awt.Color;
import java.awt.color.*;
import java.awt.image.*;
import java.awt.event.*;

public class InterfazOpciones extends JFrame implements ActionListener {
	
	private JButton boton1,boton2,boton3;

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
		boton1.setBounds(80,130,150,30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton ("Ver saldo");
		boton2.setBounds(80,300,150,30);
        add(boton2);		
        boton2.addActionListener(this);
        
        boton3 = new JButton("Personalizar tarjeta");
        boton3.setBounds(3800,300,170,30);
        add(boton3);
        boton3.addActionListener(this);
	}
	public void actionPerformed (ActionEvent e) {
		if(e.getSource()==boton1) {
			
		}
	}
	
	public void recargaTarjeta() {
		
	}
	
	public static void main (String[] args) {
		
		InterfazOpciones ver =  new InterfazOpciones ();
		
		ver.setVisible(true);
	}
}
