import javax.swing.JOptionPane;

public class Consultamatriz {
	/// public static void main(String[] args) {

	private String buscar = "", dat = "";
	private int i = 0;
	boolean ver = false;
	private Double prom;

	public String[][] matriz() {
		String resul="";
		String datos[][] = {

				{ "51662369", "Sandra Milena Castellanos Marín", "Medicina", "VI", "3,5", "4,0", "3,3", "3,5" },
				{ "80223220", "Luis Andrés Montoya Montoya", "Ingeniería de Telecomunicaciones", "IV", "3,0", "3,3",
						"4,2", "4,5" },
				{ "79444555", "Francisco Martínez Marin", "	Ingeniería de Alimentos", "	III", "	3.4", "	4.5", "	4.4",
						"	3.0\n" },
				{ "79001003", "Luis Francisco Castañeda Roa", "Ingeniería de Sistemas", "	VIII",
						"	3.3	3.4	4.5	4.4\n" },
				{ "79003003", "Pedro José Pineda Pineda	Odontología	", "VI", "	4.0	", "4.1", "	3.9", "	4.5\n" },
				{ "52900901", "Ruth Paola Mahecha Mahecha	", "Odontología", "	VII	", "3.6", "	3.6	", "3.8", "3.9\n" },
				{ "26900345", "Lucia Valderrama Pineda", "	Fisioterapia", "	VIII", "	4.4", "	4.5", "	4.1	",
						"3.1\n" },
				{ "35676900", "  Mariela Lucia Olguín Ramírez", "Medicina", "V", "3.0", "3.1", "	4.6", "	3.7\n" },
				{ "27101234", "Lucila Peñaranda Peñaranda", "	Enfermería", "	II", "	2.5", "	4.6", "	3.4",
						"	4.6\n" },
				{ "80231678", "	Milena Palacios Palacios	", "Ingeniería Mecánica", "	III	", "3.6", "	3.4	", "3.5",
						"	4.5\n" },
				{ "1030617979", "	Luis Alberto Castellanos Frias", "	Odontología", "	VI	", "4,0", "	4.1	", "3.9",
						"	4.5\n" },
				{ "1019066342", "	Nercy Aleidis Rengifo Rengifo", "	Fisioterapia", "	VII", "	3.6	", "3.6",
						"	3.8	", "3.9\n" },
				{ "1014249436", "	Fabián Raúl Moreno Carvajal	", "Medicina	", "VIII", "	4.4", "	4.5", "	4.1",
						"	31\n" },
				{ "1022380843", "	Jonathan Mauricio Baez Baez", "	Enfermería", "	V", "	3.0", "	3.1", "	4.6",
						"	3.7\n" },
				{ "1012353083", "	Germán Dario Rodríguez Baez", "	Ingeniería Mecánica", "	II", "	2.5", "	4.6",
						"	3.4", "	4.6\n" },
				{ "1030630231", "	Diego Fernando Giraldo Romero", "	Ingeniería de Petróleo", "III", "	3.6", "3.4",
						"3.5", "	4.5\n" },
				{ "1020765332", "	Luz Herminda Fonseca Daza	", "Psicología", "	VI", "	4.0	", "4.1	", "3.9",
						"	4.5\n" },
				{ "1022357137", "	Rhonald Dahian Jiménez García", "	Ingeniería Civil", "	VI", "	3.5", "	4.0",
						"	3.3	", "3.5\n" },
				{ "52263227", "	Edgar Andrés Bejarano Pérez", "	Ingeniería Civil", "	IV", "	3.0", "	3.3", "	4.2",
						"	4.5\n" },
				{ "1013579638", "	Diego Fernando Bautista Gómez", "	Ingeniería Civil", "	III", "	3.4", "	4.5",
						"	4.4", "	3.0\n" },
				{ "1030617979", "	Luis Alberto Jaime Hernández", "	Ingeniería  de Sistemas", "	II", "	4.0",
						"	4.1", "	3.9	", "4.5\n" },
				{ "1019066342", "	Zabala Pereira Nercy Aleidys", "	Ingeniería Mecánica", "	V", "	3.0", "	3.3",
						"	4.2", "	4.5\n" },
				{ "1014249436", "	Fabian Raul Duarte Serrano", "	Medicina", "IV	", "3.6", "	3.6", "	3.8",
						"	3.9\n" },
				{ "1022380843", "	Jhonatan Mauricio Rodríguez  C.", "	Ingeniería de Petróleos", "	I	", "3.4	",
						"4.5", "	4.4	", "3.0\n" },
				{ "1012353083", "	German Dario González  Riaño	", "Ingeniería de Petróleos	", "III", "	3.4",
						"	4.5	", "4.4", "	3.0\n" },
				{ "96040605441", "	Michael Duvan Beltran Salcedo", "	Medicina", "	IV	", "3.0", "	3.3", "	4.2",
						"	4.5\n" },
				{ "1013641467", "	Romero Piña Dylan David	", "Fisioterapia", "	II	", "3.6	", "3.6", "	3.8",
						"	3.9\n" },
				{ "1030632107", "	Ruben Dario Fuquene C.", "	Ingeniería Mecánica", "	V	", "3.0", "	3.3", "	4.2	",
						"4.5\n" },
				{ "53072770", "	Maryory Cuesta Rodríguez	", "Ingeniería de Telecomunicaciones", "	IV", "	3.0",
						"	3.3", "	4.2", "	4.5\n" },
				{ "1014245401", "	Cristian Camilo Ortiz Ortiz	", "Ingeniería de Telecomunicaciones", "	VI",
						"	2.0", "	3.1", "	4.8	", "1.5\n" },
				{ "95070115361", "	Yuly Katherine Sierra	", "Ingeniería Mecánica	", "V", "2.7	", "3.9	", "4.7	",
						"4.5\n" },
				{ "1020796896", "	Daniel Andres Zapata Bello", "Ingeniería Mecánica", "IV", "3.0", "	3.3", "	4.2",
						"	4.5\n" },
				{ "1003819124", "	José Eitner Montiel  Aldana", "Medicina", "	IV", "3.0", "	3.3	", "4.2", "4.5\n" },
				{ "1031131906", "	Luis Guillermo Andrade Cifuentes", "Medicina", "VIII", "	3.9	", "3.8", "	2.6	",
						"4.5\n" },
				{ "1019018284", "	Jairo Joel Noguera melo", "	Medicina", "VIII", "3.7", "	3.7	", "4,7	", "4.0\n" },
				{ "1014218719", "	Bryan Andrés Ortegón", "	Medicina", "IV", "	3.0", "	3.3", "	4.2", "	4.5\n" },
				{ "1030611565", "Mónica Andrea Plaza Bernal	", "Medicina", "IV", "	3.6,", "	3.8,", "	4.8,",
						"	4.0" } };
		        resul=consulta(datos);
		        
		        JOptionPane.showMessageDialog(null,resul);
		promedio(datos);
		return datos;
	}

	public double promedio(String dat[][]) {
		Double not1 = Double.parseDouble(dat[i][4]);
		Double not2 = Double.parseDouble(dat[i][5]);
		Double not3 = Double.parseDouble(dat[i][6]);
		Double not4 = Double.parseDouble(dat[i][7]);
		prom = (not1 + not2 + not3 + not4) / 4;
		return prom;
	}

	public String consulta(String da[][]) {
		String dat = "";
		buscar = JOptionPane.showInputDialog(null, "Digite el numero de id");
		do {

			if (da[i][0].equals(buscar)) {
				ver = true;
			} else {
				i++;
			}

		} while (i <= 36 && ver == false);

		if (ver == true) {
			JOptionPane.showMessageDialog(null,
					"N, Documento: " + da[i][0] + "\nNombre: " + da[i][1] + "\nPrograma de formacion: " + da[i][2]
							+ "\nSemestre: " + da[i][3] + "\nNota 1: " + da[i][4] + "\nNota 2: " + da[i][5]
							+ "\nNota 3: " + da[i][6] + "\nNota 4: " + da[i][7] + "\nPromedio: " + promedio(da));
		} else {
			JOptionPane.showMessageDialog(null, "El dato no esta registrado");
		}
      return dat;
	}

	public static void main(String[] args) {
		Consultamatriz ver = new Consultamatriz();

		
            ver.matriz();
	}
}