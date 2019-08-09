package areolinia;

import javax.swing.JOptionPane;

public class Areolinia {

	public static void main(String[] args) {
		Metodos menu = new Metodos ();

		int llega;
		do {
		menu.IngresoDatos();
		menu.menu();
		llega = JOptionPane.showConfirmDialog(null, "Desea Continuar ? ");

		}while(llega==0);
	}
}
