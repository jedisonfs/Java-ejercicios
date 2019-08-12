package areolinia;

import javax.swing.JOptionPane;

public class Menuprincipal {

	public static void main(String[] args) {
		String opcion;
		Metodos aerolinia = new Metodos();
		Datounico consulta = new Datounico();
		Promedio prom = new Promedio();
		Consulta cons = new Consulta();

		opcion = JOptionPane.showInputDialog(null,
				"Digite a la opcion que desea ingresar\n\n a. Aerolinia\n b. Vectores \n c. Salir");
		switch (opcion.toUpperCase().charAt(0)) {
		case 'A':
			aerolinia.aereo();
			break;

		case 'B':
			opcion = JOptionPane.showInputDialog(null, " a. Promedio\n b. Dato unico\n c. Consulta");
			switch (opcion.toUpperCase().charAt(0)) {
			case 'A':
				prom.prom();
			case 'B':
				consulta.cedula();
				break;
			case 'C':
				cons.ingresoDatos();
				cons.Consulta();
				break;
			}
		case 'C':
			break;
		}
	}
}
