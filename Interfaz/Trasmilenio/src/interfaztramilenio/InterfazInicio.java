package interfaztramilenio;

import javax.swing.*;
import java.awt.Image;
import java.awt.Color;
import java.awt.color.*;
import java.awt.image.*;
import java.awt.event.*;

public class InterfazInicio extends JFrame implements ActionListener {
	
	private JLabel label1,label2;
	private JTextField text1;
	private JButton boton1;

	public InterfazInicio() {

		setTitle("Home");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
		setBounds(0, 0, 600, 400);
		setResizable(false);
		setLocationRelativeTo(null);

		aspectoInicio();
	}

	public void aspectoInicio() {
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		getContentPane().setBackground(Color.white);
		this.add(panel1);

		setLayout(null);
	    ImageIcon icon= new ImageIcon("/img/icon.png");
		label1 = new JLabel(icon);
		label1.setIcon(new ImageIcon("/img/logo.png"));
		label1.setBounds(200,150,150,30);
		panel1.add(label1);
		add(label1);
		
		label2=new JLabel("Ingrese No. Documento");
		label2.setBounds(192,150,150,25);
		add(label2);
		
		text1 = new JTextField();
		text1.setBounds(170,180,180,20);
		add(text1);
		
		boton1= new JButton("Aceptar");
		boton1.setBounds(190,220,145,40);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e) {
		InterfazOpciones ver2 = new InterfazOpciones();
		String texto;

		if(e.getSource()==boton1) {
			texto= text1.getText().trim();
			if(texto.equals("")) {
				JOptionPane.showMessageDialog(null, "Debe ingresar su numero de identificacion,\n antes de continuar");
			}else {
				ver2.setVisible(true);
			}
		}
	}

	public static void main(String[] args) {
		InterfazInicio ver = new InterfazInicio();
		

		ver.setVisible(true);
}


		
	}

