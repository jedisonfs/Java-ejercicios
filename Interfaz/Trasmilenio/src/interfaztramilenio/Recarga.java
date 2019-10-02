package interfaztramilenio;

import javax.swing.*;
import java.awt.Image;
import java.awt.Color;
import java.awt.color.*;
import java.awt.image.*;
import java.awt.event.*;

public class Recarga extends JFrame implements ActionListener{
	
	private JLabel text1;
	private JTextField field1;
	private JButton aceptar;
	
	public Recarga () {
		setTitle("RECARGA");
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
			
			text1 = new JLabel("Digite el valor ha recargar");
			text1.setBounds(160,100,150,25);
			add(text1);
			
			field1 = new JTextField();
			field1.setBounds(135,140,180,20);
			add(field1);
			
			aceptar = new JButton("Aceptar");
			aceptar.setBounds(155,185,145,40);
			add(aceptar);
			aceptar.addActionListener(this);
			
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Recarga ver3 = new Recarga();
		
		ver3.setVisible(true);
	}

}
