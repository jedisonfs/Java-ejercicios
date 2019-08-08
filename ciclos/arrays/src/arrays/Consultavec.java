package arrays;

import javax.swing.JOptionPane;

public class Consultavec {
	private String[] nom = new String[5];
	private String[] ced = new String[5];

//Ingreso de datos
	public void ingresoDatos() {
		String id = "";
		boolean verf = false;

		for (int i = 0; i < ced.length; i++) {
			do {
				if (i >=1) {
					for (int j = (i - 1);  j>=0; j--) {
						nom[i]=JOptionPane.showInputDialog(null, "Ingrese nombre [" + i  + "]");
						ced[i] = JOptionPane.showInputDialog(null, "Ingrese numero de cedula [" + i  + "]");
						if (ced[i].equals(ced[j])) {
							JOptionPane.showMessageDialog(null, "El numero ingresado ya esta registrado");
							verf = true;	
						}else {
							verf=false;
						}
					}
				}
			} while (verf == true);
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
