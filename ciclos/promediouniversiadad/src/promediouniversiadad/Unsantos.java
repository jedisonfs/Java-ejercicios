package promediouniversiadad;

import javax.swing.JOptionPane;

public class Unsantos {

	public static void main(String[] args) {

		String nom;
		String ape;
		String pf, palabra = "";
		int ide = 0, entero = 0;
		double prom;
		double not1, not2;

		nom = JOptionPane.showInputDialog(null, " UNIVERSIDAD SANTO TOMAS\n\nIngrese su Nombre ");

		ape = JOptionPane.showInputDialog(null, "Ingrese su Apellido");

		pf = JOptionPane.showInputDialog(null, "Ingrese su programa de formación ");

		ide = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su numero de identificación"));

		not1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la primer nota:"));

		if (not1 > 1 && not1 < 5) {

			not2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la segunda nota:"));

			prom = (not1 + not2) / 2;

			entero = (int) prom;
			switch (entero) {

			case 1:
				palabra = "Uno";
				break;
			case 2:
				palabra = "Dos";
				break;
			case 3:
				palabra = "Tres";
				break;
			case 4:
				palabra = "Cuatro";
				break;
			case 5:
				palabra = "Cinco";
				break;
			}

			JOptionPane.showMessageDialog(null, "Promedio: " + prom + " (" + palabra + ") ");
		} else {
			JOptionPane.showMessageDialog(null, "Nota invalida");
		}
	}
}
