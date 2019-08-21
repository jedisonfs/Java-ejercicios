import javax.swing.JOptionPane;

public class Reloj1 {
	Reloj1 llamar = new Reloj1 ();
	private int min = 0, hrs = 0, seg = 0;
	private double gradoshr = 0, gradosmin = 0, gradosseg = 0, result = 0;
	

	public void ingresoDatos() {
		do {
			hrs = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la hora "));
			if (hrs < 1 || hrs > 12) {
				JOptionPane.showMessageDialog(null, "La hora ingresada no es valida ");
			}
		} while (hrs < 1 || hrs > 12);

		do {
			min = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite los minutos"));
			if (min < 0 || min > 60) {
				JOptionPane.showMessageDialog(null, "Los minutos ingresados no son validos ");
			}
		} while (min < 0 || min > 60);
		do {
			seg = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite los segundos"));
			if (seg< 0 || seg> 60) {
				JOptionPane.showMessageDialog(null, "Los segundos ingresados no son validos ");
			}
		} while (seg< 0 || seg> 60);
	}

	public void conversionHora() {
		gradoshr = hrs * 30 + (min * 0.5);
		gradosmin = min * 6;
		result = gradoshr - gradosmin;
		JOptionPane.showMessageDialog(null, "Su hora en grados es: " +result);

	}

	public void conversionSegundos() {
		gradoshr = hrs * 30 + (seg * 0.1);
		gradosseg = 0.1 * seg;
		result = gradoshr - gradosseg;
		JOptionPane.showMessageDialog(null, "Su hora en grados es: " +result);

	}
	public void conversionMinutos() {
		gradosmin= min*0.5+(seg*0.1);
		gradosseg=0.1*seg;
		result=gradosmin- gradosseg;
		
		JOptionPane.showMessageDialog(null, "Su hora en grados es: " +result);
	}
	public void menu() {
		int llega = 0;

		llamar.ingresoDatos();
			int opciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la opcion que desea ver\n\n"
					+ " 1. Horas minutos\n 2. Horas segundos\n 3. Minutos segundos\n 4 . Ingresar nueva hora \n 5 . Salir"));

			switch (opciones) {
			case 1:
				llamar.conversionHora();
				break;
			case 2:
				llamar.conversionMinutos();
				break;
			case 3:
				llamar.conversionSegundos();
				break;
			case 4:
				llamar.menu();break;
			case 5:
				System.exit(0);break;
			}
	}

}
