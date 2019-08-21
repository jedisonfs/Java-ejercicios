import javax.swing.JOptionPane;

public class Correrprograma {
	public static void main(String[] args) {
		Reloj1 ver = new Reloj1();

		int opciones = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite la opcion que desea ver\n\n" + " 1. Horas minutos\n 2. Horas segundos\n 3. Minutos segundos"));

		switch (opciones) {
		case 1:
			ver.ingresoDatos();
			ver.conversionHora();
			break;
		case 2:
			ver.ingresoDatos();
			ver.conversionMinutos();
			break;
		case 3:
			ver.ingresoDatos();
			ver.conversionSegundos();
			break;
		}
	}
}
