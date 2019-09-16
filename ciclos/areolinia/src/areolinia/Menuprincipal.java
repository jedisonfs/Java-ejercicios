package areolinia;

import javax.swing.JOptionPane;

public class Menuprincipal {

	public static void main(String[] args) {
		String opcion;
		Metodos aerolinia = new Metodos();
		Datounico consulta = new Datounico();
		Promedio prom = new Promedio();
		Consulta cons = new Consulta();
		Consulta sal = new Consulta();
        int rep;
		
		do {
		opcion = JOptionPane.showInputDialog(null,
				"Digite a la opcion que desea ingresar\n\n a. Aerolinia\n b. Vectores \n c. Salir");
		switch (opcion.toUpperCase().charAt(0)) {
		case 'A':
			aerolinia.aereo();
			//rep = JOptionPane.showConfirmDialog(null,"Desea continuar en el programa");
			break;

		case 'B':
			opcion = JOptionPane.showInputDialog(null, " a. Promedio\n b. Dato unico\n c. Consulta");
			switch (opcion.toUpperCase().charAt(0)) {
			case 'A':
				do {
				prom.prom();
				rep = JOptionPane.showConfirmDialog(null,"Desea continuar en el programa");
				}while(rep==1);
				break;
			case 'B':
				do {
				consulta.cedula();
				rep = JOptionPane.showConfirmDialog(null,"Desea continuar en el programa");
				}while(rep==1);
				break;
			case 'C':
				do {
				cons.ingresoDatos();
				cons.Consulta();
				rep = JOptionPane.showConfirmDialog(null,"Desea continuar en el programa");
				}while(rep==1);
				break;
			}
		case 'C':
			break;
		}
		rep=JOptionPane.showConfirmDialog(null,"Desea ir al menu principal programa");
	}while(rep==0);
	}
}
