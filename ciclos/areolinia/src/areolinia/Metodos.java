package areolinia;

import javax.swing.JOptionPane;

public class Metodos {
	private String opciones = "", corr = "", dir = "", nom = "",ver="";
	private double kil = 0, tarfport = 0, des = 0, kilosmas = 0, neto = 0;
	private int pes = 0, edad, llega;

	public void IngresoDatos() {

		// Captura Datos Personales
			JOptionPane.showMessageDialog(null, "Bienvenido a la aereol�nea Avianca");
			
		ver=nom = JOptionPane.showInputDialog("Digite sus nombres y apellidos");
			dir = JOptionPane.showInputDialog("Digite su direccion");
			corr = JOptionPane.showInputDialog("Digite su correo");
			do {
				edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
				if (edad <= 0) {
					JOptionPane.showMessageDialog(null, "Edad no valida");
				}
			} while (edad <= 0);
			do {
				pes = Integer.parseInt(JOptionPane.showInputDialog("Digite el peso del equipaje"));
				if (pes <= 0) {
					JOptionPane.showMessageDialog(null, "Peso no valida");
				}
			} while (pes <= 0);
			String genero = JOptionPane.showInputDialog("Digite su genero");
			

	}

	public void menu() {
	//	do {
		
		opciones = JOptionPane.showInputDialog(
				"Elija una opci�n\n" + "A. BOGOTA - CALI - $ 190000\n " + "B. BOGOTA - MEDELLIN - $ 165000\n"
						+ "C. BOGOTA - MANIZALES - $ 135000\n" + "D. BOGOTA - BARRANQUILLA - $ 245000\n"
						+ "E. CALI - BOGOTA - $ 190000\n" + "F. MEDELLIN - BOGOTA - $ 165000\n"
						+ "G. MANIZALES - BOGOTA - $ 135000\n" + "H. BARRANQUILLA - BOGOTA - $ 2450000\n");
		// Opciones de precios segun las edaddes
		// opciones.toUpperCase().charAt(0);
		switch (opciones.toUpperCase().charAt(0)) {
		// BOGOTA CALI
		case 'A':
			if (edad < 60 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				des = 0.05 * 190000;
				tarfport = 190000 + des;
				neto = tarfport + kilosmas;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n" + "Ciudad de destino : CALI \n"
								+ "Valor de tiquete  : 190000\n " + "Valor de tarifa aeroportuaria : " + des
								+ "\n Valor de kilos de mas : " + kilosmas + "\n Valor total de neto : " + neto
								+ "\nkilos pasados:" + kil);
			} else if (edad > 60 && edad < 70 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				des = 0.05 * 190000;
				neto = tarfport + kilosmas;
				tarfport = 0;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n" + "Ciudad de destino : CALI \n"
								+ "Valor de tiquete  : 190000\n " + "Valor de tarifa aeroportuaria : " + des
								+ "\n Valor de kilos de mas : " + kilosmas + "\n Valor total de neto : " + neto
								+ "\nkilos pasados:" + kil);
			}
			if (edad > 70 && edad < 120) {
				kil = pes - 20;
				kilosmas = 0;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n" + "Ciudad de destino : CALI \n"
								+ "Valor de tiquete  : 190000\n " + "Valor de tarifa aeroportuaria : " + des
								+ "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total de neto : 190000   \nkilos pasados:" + kil);
			}
			break;
		// BOGOTA - MEDELLIN
		case 'B':
			if (edad < 60 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				des = 0.05 * 165000;
				tarfport = 165000 + des;
				neto = tarfport + kilosmas;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n"
								+ "Ciudad de destino: MEDELLIN \n" + "Valor de tiquete : 165000\n "
								+ "Valor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : " + neto + "\nkilos pasados:" + kil);

			} else if (edad > 60 && edad < 70 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				des = 0.05 * 165000;
				neto = tarfport + kilosmas;
				tarfport = 0;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n"
								+ "Ciudad de destino: MEDELLIN \n" + "Valor de tiquete : 165000\n "
								+ "Valor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : " + neto + "\nkilos pasados:" + kil);
			}
			if (edad > 70 && edad < 120) {
				kil = pes - 20;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n"
								+ "Ciudad de destino: MEDELLIN \n" + "Valor de tiquete : 165000\n "
								+ "Valor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : 165000 \nkilos pasados:" + kil);

			}
			break;
		// BOGOTA - MANIZALES
		case 'C':
			if (edad < 60 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				des = 0.05 * 135000;
				neto = tarfport + kilosmas;
				tarfport = 135000 + des;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n"
								+ " Ciudad de origen : MANIZALES \n" + "Valor de tiquete : $ 135000\n "
								+ "Valor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : " + neto + "\nkilos pasados:" + kil);
			} else if (edad > 60 && edad < 70 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				neto = tarfport + kilosmas;
				des = 0.05 * 135000;
				tarfport = 0;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n"
								+ " Ciudad de origen : MANIZALES \n" + "Valor de tiquete : $ 135000\n "
								+ "Valor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : " + neto + "\nkilos pasados:" + kil);
			}
			if (edad > 70 && edad < 120) {
				kil = pes - 20;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n"
								+ " Ciudad de origen : MANIZALES \n" + "Valor de tiquete : $ 135000\n "
								+ "Valor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : 135000 \nkilos pasados:" + kil);
			}
			break;
		// BOGOTA - BARRANQUILLA
		case 'D':
			if (edad < 60 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				des = 0.05 * 245000;
				neto = tarfport + kilosmas;
				tarfport = 245000 + des;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n"
								+ " Ciudad de origen : BARRANQUILLA \n" + "Valor de tiquete : $ 245000 "
								+ "\n Valor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\nValor total del neto : " + neto + "\nkilos pasados:" + kil);
			} else if (edad > 60 && edad < 70 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				des = 0.05 * 245000;
				neto = tarfport + kilosmas;
				tarfport = 0;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n"
								+ " Ciudad de origen : BARRANQUILLA \n" + "Valor de tiquete : $ 245000 "
								+ "\n Valor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\nValor total del neto : " + neto + "\nkilos pasados:" + kil);
			}
			if (edad > 70 && edad < 120) {
				kil = pes - 20;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BOGOTA \n"
								+ " Ciudad de origen : BARRANQUILLA \n" + "Valor de tiquete : $ 245000 "
								+ "\n Valor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\nValor total del neto :  245000  \nkilos pasados:" + kil);
			}
			break;
		// CALI - BOGOTA
		case 'E':
			if (edad < 60 && pes > 20) {

				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				neto = tarfport + kilosmas;
				des = 0.05 * 190000;
				tarfport = 190000 + des;

				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : CALI \n" + "Ciudad de destino : BOGOTA \n"
								+ "Valor de tiquete  : 190000 " + "\nValor de tarifa aeroportuaria : " + des
								+ "\n Valor de kilos de mas : " + kilosmas + "\n Valor total del neto : " + neto
								+ "\nkilos pasados:" + kil);

			} else if (edad > 60 && edad < 70 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				des = 0.05 * 190000;
				neto = tarfport + kilosmas;
				tarfport = 0;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : CALI \n" + "Ciudad de destino : BOGOTA \n"
								+ "Valor de tiquete  : 190000 " + "\nValor de tarifa aeroportuaria : " + des
								+ "\n Valor de kilos de mas : " + kilosmas + "\n Valor total del neto : " + neto
								+ "\nkilos pasados:" + kil);

			}
			if (edad > 70 && edad < 120) {
				kil = pes - 20;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : CALI \n" + "Ciudad de destino : BOGOTA \n"
								+ "Valor de tiquete  : 190000 " + "\nValor de tarifa aeroportuaria : " + des
								+ "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : 190000 \nkilos pasados:" + kil);
			}
			break;
		// MEDELLIN - BOGOTA
		case 'F':

			if (edad < 60 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				des = 0.05 * 165000;
				neto = tarfport + kilosmas;
				tarfport = 165000 + des;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : MEDELLIN \n"
								+ "Ciudad de destino: BOGOTA \n" + "Valor de tiquete : 165000 "
								+ "\nValor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : " + neto + "\nkilos pasados:" + kil);

			} else if (edad > 60 && edad < 70 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				neto = tarfport + kilosmas;
				des = 0.05 * 165000;
				tarfport = 0;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : MEDELLIN \n"
								+ "Ciudad de destino: BOGOTA \n" + "Valor de tiquete : 165000 "
								+ "\nValor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : " + neto + "\nkilos pasados:" + kil);
			}
			if (edad > 70 && edad < 120) {
				kil = pes - 20;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : MEDELLIN \n"
								+ "Ciudad de destino: BOGOTA \n" + "Valor de tiquete : 165000 "
								+ "\nValor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : 165000 \nkilos pasados:" + kil);
			}
			break;

		// MANIZALES - BOGOTA
		case 'G':
			if (edad < 60 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				neto = tarfport + kilosmas;
				des = 0.05 * 135000;
				tarfport = 135000 + des;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : MANIZALES \n"
								+ " Ciudad de origen : BOGOTA \n" + "Valor de tiquete : $ 135000 "
								+ "\nValor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del tiquete : " + tarfport + "\nkilos pasados:" + kil);
			} else if (edad > 60 && edad < 70 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				neto = tarfport + kilosmas;
				des = 0.05 * 135000;
				tarfport = 0;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : MANIZALES \n"
								+ " Ciudad de origen : BOGOTA \n" + "Valor de tiquete : $ 135000 "
								+ "\nValor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del tiquete : " + tarfport + "\nkilos pasados:" + kil);
			}
			if (edad > 70 && edad < 120) {
				kil = pes - 20;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : MANIZALES \n"
								+ " Ciudad de origen : BOGOTA \n" + "Valor de tiquete : $ 135000 "
								+ "\nValor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total del neto : 135000 \nkilos pasados:" + kil);
			}
			break;
		// BARRANQUILLA - BOGOTA
		case 'H':
			if (edad < 60 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				neto = tarfport + kilosmas;
				des = 0.05 * 2450000;
				tarfport = 2450000 + des;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BARRANQUILLA \n"
								+ " Ciudad de origen : BOGOTA \n" + "Valor de tiquete : $ 245000 "
								+ "\nValor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total de tiquete : " + tarfport + "\nkilos pasados:" + kil);
			} else if (edad > 60 && edad < 70 && pes > 20) {
				kilosmas = (pes - 20) * 2000;
				kil = pes - 20;
				neto = tarfport + kilosmas;
				des = 0.05 * 2450000;
				tarfport = 0;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BARRANQUILLA \n"
								+ " Ciudad de origen : BOGOTA \n" + "Valor de tiquete : $ 245000 "
								+ "\nValor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total de tiquete : " + tarfport + "\nkilos pasados:" + kil);

			}
			if (edad > 70 && edad < 120) {
				kil = pes - 20;
				JOptionPane.showMessageDialog(null,
						"Nombres y Apellidos:" + nom + "\nCiudad de origen : BARRANQUILLA \n"
								+ " Ciudad de origen : BOGOTA \n" + "Valor de tiquete : $ 245000 "
								+ "\nValor de tarifa aeroportuaria : " + des + "\n Valor de kilos de mas : " + kilosmas
								+ "\n Valor total de neto : 245000 \nkilos pasados:" + kil);
			}
			break;

		}
		
	//	llega = JOptionPane.showConfirmDialog(null, "Desea Continuar ? ");
		//return ver;

	//} while (llega==0);
	}
}
