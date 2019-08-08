package arrays;

import javax.swing.JOptionPane;

public class Consultavec {
	private String[] nom = new String[5];
	private String[] ced = new String[5];
//Ingreso de datos
	public void ingresoDatos() {
		String id = "";
		boolean verf = false;

		for (int i = 0; i < nom.length; i++) {
			nom[i] = JOptionPane.showInputDialog(null, "Digite nombre [" + (i + 1) + "]");
			ced[i] = JOptionPane.showInputDialog(null, "Ingrese numero de cedula [" + (i + 1) + "]");
		}
	}
// Consulta
	public void Consulta() {
		String num = "";
		for (int i = 0; i < 5; i++) {
			do {
				num = JOptionPane.showInputDialog(null, "Ingrese numero ha buscar ");
				if (num.equals(ced[i])) {
					JOptionPane.showMessageDialog(null,
							"Usted esta registrado\n\nNombre: " + nom[i] + "\nIdentificación: " + ced[i]);
				} else {
					JOptionPane.showMessageDialog(null, "No esta registrado");
				}
			} while (num.equals(ced[i]));
		}
	}
}
