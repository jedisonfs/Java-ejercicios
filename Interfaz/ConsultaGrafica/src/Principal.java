import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.color.*;

public class Principal extends JFrame implements ActionListener{
	
	public JTextArea area2;
	private JButton boton1;
	private JButton boton2;
	
    public Principal () {
		
		setTitle("Consulta de notas");
		setBounds(0,0,600,500);
		setResizable(false);
		setLocationRelativeTo(null);
		
		diseñoArea();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void diseñoArea () {

		Graficacons je = new Graficacons();

		JPanel panel2 = new JPanel ();
		setLayout(null);
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		this.getContentPane().add(panel2);
		
		area2 = new JTextArea();
		area2.setBounds(50, 20, 480,350);
		area2.setForeground(Color.WHITE);
		area2.setBackground(Color.BLACK);
		je.consulta(je.buscar2=je.rel);
		add(area2);	
		
		boton1= new JButton ("Nuevo # Documento");
		boton1.setBounds(90,380,150,40);
		add(boton1);
		//boton1.addActionListener(this);
	
		boton2=new JButton ("Salir");
		boton2.setBounds(300,380,150,40);
		add(boton2);
		//boton2.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e) {
		if(e.getSource() ==boton1) {
			System.exit(0);
		}
		if(e.getSource()==boton2) {
			main(true);
		}
	}
	
	public static void main(String[] args) {

		
		Graficacons al=new Graficacons();
		Principal ver = new Principal ();
		
	//	al.consulta(al.buscar2 =al.text1.getText());	
		ver.setVisible(true);
		ver.area2.setText(al.rel);
	}

}
