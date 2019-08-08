package vectores;

import javax.swing.JOptionPane;

public class Consulta {

	public static void main(String[] args) {
		int h = 0, con = 0;
		boolean ver = false;
		String num, asd = "";
		String[] ide = new String[5];
		String[] nom = new String[5];

		for (int x = 0; x < ide.length; x++) {
			do {
				ide[x] = JOptionPane.showInputDialog(null, "Ingrese su numero de identificacion " + (x + 1));

				if (x >= 1) {
					for (int k = (x - 1); k >= 0; k--) {
						if (ide[x].equals(ide[k])) {
							JOptionPane.showMessageDialog(null, "El dato ya se ingreso anteriormente");
							k = -1;
							ver = true;
						} else {
							ver = false;
						}

					}
				}

			} while (ver == true);
		}

		for (int n = 0; n < nom.length; n++) {
			nom[n] = JOptionPane.showInputDialog("Ingrese su nombre " + (n + 1));
		}

		do {

			num = JOptionPane.showInputDialog(null, "Ingrese el numero de identificacio a verificar");

			for (int i = 0; i < ide.length; i++) {

				if (num.equals(ide[i])) {
					asd = "Esta registrado:\nNumero de documento: " + ide[i] + "\nNombre: " + nom[i];
					i = ide.length;
				} else {
					asd = "No esta registrado ";
				}
			}

			JOptionPane.showMessageDialog(null, asd);

			con = JOptionPane.showConfirmDialog(null, "Continuar", "SALIR DE LA CONSULTA", JOptionPane.YES_NO_OPTION);
			if (con == 1) {
				System.exit(0);
			}
		} while (con == 0);
	}

}
