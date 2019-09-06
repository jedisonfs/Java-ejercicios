import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class GraficaCons extends JFrame implements ActionListener {
	private JButton boton1, boton2;
	private JLabel titulo1, titulo2;
	public JTextField text1;
	private JTextArea area1;
	public static String texto = "", rel = "";

	public String buscar2;
	private int i = 0;
	private Double prom;
	public String datos[][] = {

			{ "51662369", "Sandra Milena Castellanos Mar�n", "Medicina", "VI", "3,5", "4,0", "3,3", "3,5" },
			{ "80223220", "Luis Andr�s Montoya Montoya", "Ingenier�a de Telecomunicaciones", "IV", "3,0", "3,3", "4,2",
					"4,5" },
			{ "79444555", "Francisco Mart�nez Marin", "	Ingenier�a de Alimentos", "	III", "	3.4", "	4.5", "	4.4",
					"	3.0\n" },
			{ "79001003", "Luis Francisco Casta�eda Roa", "Ingenier�a de Sistemas", "	VIII",
					"	3.3	3.4	4.5	4.4\n" },
			{ "79003003", "Pedro Jos� Pineda Pineda	Odontolog�a	", "VI", "	4.0	", "4.1", "	3.9", "	4.5\n" },
			{ "52900901", "Ruth Paola Mahecha Mahecha	", "Odontolog�a", "	VII	", "3.6", "	3.6	", "3.8", "3.9\n" },
			{ "26900345", "Lucia Valderrama Pineda", "	Fisioterapia", "	VIII", "	4.4", "	4.5", "	4.1	",
					"3.1\n" },
			{ "35676900", "  Mariela Lucia Olgu�n Ram�rez", "Medicina", "V", "3.0", "3.1", "	4.6", "	3.7\n" },
			{ "27101234", "Lucila Pe�aranda Pe�aranda", "	Enfermer�a", "	II", "	2.5", "	4.6", "	3.4", "	4.6\n" },
			{ "80231678", "	Milena Palacios Palacios	", "Ingenier�a Mec�nica", "	III	", "3.6", "	3.4	", "3.5",
					"	4.5\n" },
			{ "1030617979", "	Luis Alberto Castellanos Frias", "	Odontolog�a", "	VI	", "4,0", "	4.1	", "3.9",
					"	4.5\n" },
			{ "1019066342", "	Nercy Aleidis Rengifo Rengifo", "	Fisioterapia", "	VII", "	3.6	", "3.6", "	3.8	",
					"3.9\n" },
			{ "1014249436", "	Fabi�n Ra�l Moreno Carvajal	", "Medicina	", "VIII", "	4.4", "	4.5", "	4.1",
					"	31\n" },
			{ "1022380843", "	Jonathan Mauricio Baez Baez", "	Enfermer�a", "	V", "	3.0", "	3.1", "	4.6",
					"	3.7\n" },
			{ "1012353083", "	Germ�n Dario Rodr�guez Baez", "	Ingenier�a Mec�nica", "	II", "	2.5", "	4.6", "	3.4",
					"	4.6\n" },
			{ "1030630231", "	Diego Fernando Giraldo Romero", "	Ingenier�a de Petr�leo", "III", "	3.6", "3.4",
					"3.5", "	4.5\n" },
			{ "1020765332", "	Luz Herminda Fonseca Daza	", "Psicolog�a", "	VI", "	4.0	", "4.1	", "3.9",
					"	4.5\n" },
			{ "1022357137", "	Rhonald Dahian Jim�nez Garc�a", "Ingenier�a Civil", "	VI", "	3.5", "	4.0", "	3.3	",
					"3.5\n" },
			{ "52263227", "	Edgar Andr�s Bejarano P�rez", "	Ingenier�a Civil", "	IV", "	3.0", "	3.3", "	4.2",
					"	4.5\n" },
			{ "1013579638", "	Diego Fernando Bautista G�mez", "	Ingenier�a Civil", "	III", "	3.4", "	4.5",
					"	4.4", "	3.0\n" },
			{ "1030617979", "	Luis Alberto Jaime Hern�ndez", "	Ingenier�a  de Sistemas", "	II", "	4.0", "	4.1",
					"	3.9	", "4.5\n" },
			{ "1019066342", "	Zabala Pereira Nercy Aleidys", "	Ingenier�a Mec�nica", "	V", "	3.0", "	3.3",
					"	4.2", "	4.5\n" },
			{ "1014249436", "	Fabian Raul Duarte Serrano", "	Medicina", "IV	", "3.6", "	3.6", "	3.8", "	3.9\n" },
			{ "1022380843", "	Jhonatan Mauricio Rodr�guez  C.", "	Ingenier�a de Petr�leos", "	I	", "3.4	", "4.5",
					"	4.4	", "3.0\n" },
			{ "1012353083", "	German Dario Gonz�lez  Ria�o	", "Ingenier�a de Petr�leos	", "III", "	3.4", "	4.5	",
					"4.4", "	3.0\n" },
			{ "96040605441", "	Michael Duvan Beltran Salcedo", "	Medicina", "	IV	", "3.0", "	3.3", "	4.2",
					"	4.5\n" },
			{ "1013641467", "	Romero Pi�a Dylan David	", "Fisioterapia", "	II	", "3.6	", "3.6", "	3.8",
					"	3.9\n" },
			{ "1030632107", "	Ruben Dario Fuquene C.", "	Ingenier�a Mec�nica", "	V	", "3.0", "	3.3", "	4.2	",
					"4.5\n" },
			{ "53072770", "	Maryory Cuesta Rodr�guez	", "Ingenier�a de Telecomunicaciones", "	IV", "	3.0",
					"	3.3", "	4.2", "	4.5\n" },
			{ "1014245401", "	Cristian Camilo Ortiz Ortiz	", "Ingenier�a de Telecomunicaciones", "	VI", "	2.0",
					"	3.1", "	4.8	", "1.5\n" },
			{ "95070115361", "	Yuly Katherine Sierra	", "Ingenier�a Mec�nica	", "V", "2.7	", "3.9	", "4.7	",
					"4.5\n" },
			{ "1020796896", "	Daniel Andres Zapata Bello", "Ingenier�a Mec�nica", "IV", "3.0", "	3.3", "	4.2",
					"	4.5\n" },
			{ "1003819124", "	Jos� Eitner Montiel  Aldana", "Medicina", "	IV", "3.0", "	3.3	", "4.2", "4.5\n" },
			{ "1031131906", "	Luis Guillermo Andrade Cifuentes", "Medicina", "VIII", "	3.9	", "3.8", "	2.6	",
					"4.5\n" },
			{ "1019018284", "	Jairo Joel Noguera melo", "	Medicina", "VIII", "3.7", "	3.7	", "4,7	", "4.0\n" },
			{ "1014218719", "	Bryan Andr�s Orteg�n", "	Medicina", "IV", "	3.0", "	3.3", "	4.2", "	4.5\n" },
			{ "1030611565", "M�nica Andrea Plaza Bernal	", "Medicina", "IV", "	3.6,", "	3.8,", "	4.8,",
					"	4.0" } };

	public GraficaCons() {

		setTitle("Consulta de Notas ");
		setBounds(0, 0, 600, 100);
		setResizable(false);
		setLocationRelativeTo(null);

		panelInicial();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void panelInicial() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setLayout(null);
		this.getContentPane().add(panel);

		setLayout(null);
		titulo1 = new JLabel("Ingrese el Documento a buscar");
		titulo1.setHorizontalAlignment(SwingConstants.CENTER);
		titulo1.setBounds(10, 20, 190, 30);
		titulo1.setForeground(Color.white);
		titulo1.setOpaque(true);
		titulo1.setBackground(Color.BLACK);
		panel.add(titulo1);
		add(titulo1);

		text1 = new JTextField();
		text1.setBounds(200, 27, 150, 20);
		add(text1);

		boton1 = new JButton("Buscar");
		boton1.setBounds(360, 27, 90, 20);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("Salir");
		boton2.setBounds(460, 27, 90, 20);
		add(boton2);
		boton2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
				Principal ver = new Principal ();
				consulta(buscar2 =text1.getText());
				ver.setVisible(true);
				ver.area2.setText(rel);


			}
			if (e.getSource() == boton2) {
				System.exit(0);
			
		}
	}

	// Consulta
	public String consulta(String buscar) {
		boolean ver = false;

		do {
			if (datos[i][0].equals(buscar)) {
				ver = true;
			} else {
				i++;
			}

		} while (i <= 36 && ver == false);

		if (ver == true) {
			prom = (Double.parseDouble(datos[i][4]) + Double.parseDouble(datos[i][5]) + Double.parseDouble(datos[i][6])
					+ Double.parseDouble(datos[i][7])) / 4;

			rel = ("N, Documento: " + datos[i][0] + "\nNombre: " + datos[i][1] + "\nPrograma de formacion: "
					+ datos[i][2] + "\nSemestre: " + datos[i][3] + "\nNota 1: " + datos[i][4] + "\nNota 2: "
					+ datos[i][5] + "\nNota 3: " + datos[i][6] + "\nNota 4: " + datos[i][7] + "\nPromedio: " + prom
					+ "\n" + transformar(Double.toString(prom).charAt(0)) + " Punto "
					+ transformar(Double.toString(prom).charAt(0)));
		} /*
			 * else { rel="Dato no registrado "; //JOptionPane.showMessageDialog(null,
			 * "El dato no esta registrado"); }
			 */
		return rel;
	}

	// Transformar
	public String transformar(char llega) {
		String dec = "";
		switch (llega) {
		case '0':
			dec = "Cero";
			break;
		case '1':
			dec = "Uno";
			break;
		case '2':
			dec = "Dos";
			break;
		case '3':
			dec = "Tres";
			break;
		case '4':
			dec = "Cuatro";
			break;
		case '5':
			dec = "Cinco";
			break;
		case '6':
			dec = "Seis";
			break;
		case '7':
			dec = "Siete";
			break;
		case '8':
			dec = "Ocho";
			break;
		case '9':
			dec = "Nueve";
			break;

		}
		return dec;
	}

	public static void main(String[] args) {

		GraficaCons interfaz1 = new GraficaCons();
		// ver.setVisible(true);
		// je.consulta(je.text1);
		interfaz1.setVisible(true);
	}
}