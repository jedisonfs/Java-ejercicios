import java.awt.event.*;
import javax.swing.*;

public class Graficacons extends JFrame implements ActionListener {
	private JButton boton1, boton2;
	private JLabel titulo1, titulo2;

	public Graficacons() {
		setLayout(null);
		titulo1 = new JLabel("ESTA ES UNA PRUEBA DE JLABAEL");
		titulo1.setBounds(10, 20, 300, 30);
		add(titulo1);
		titulo2 = new JLabel("No valida");
		titulo2.setBounds(10, 100, 100, 30);
		add(titulo2);
		boton1 = new JButton("Boton 3");
		boton1.setBounds(10, 100, 90, 30);
		add(boton1);
		boton1.addActionListener(this);
		boton2 = new JButton("Boton 2");
		boton2.setBounds(110, 100, 90, 30);
		add(boton2);
		boton2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			setTitle("Esta es una opcion errornea ");
		}
		if (e.getSource() == boton2) {
			setTitle("Esta opcion es correcta ");
		}
	}

	public static void main(String[] args) {

		Graficacons formularioUno = new Graficacons();
		formularioUno.setBounds(0, 0, 350, 200);
		formularioUno.setResizable(false);
		formularioUno.setVisible(true);
	}
}
