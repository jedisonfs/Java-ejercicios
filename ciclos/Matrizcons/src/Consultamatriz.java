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

				{ "51662369", "Sandra Milena Castellanos Mar�n", "Medicina", "VI", "3,5", "4,0", "3,3", "3,5" },
				{ "80223220", "Luis Andr�s Montoya Montoya", "Ingenier�a de Telecomunicaciones", "IV", "3,0", "3,3",
						"4,2", "4,5" },
				{ "79444555", "Francisco Mart�nez Marin", "	Ingenier�a de Alimentos", "	III", "	3.4", "	4.5", "	4.4",
						"	3.0\n" },
				{ "79001003", "Luis Francisco Casta�eda Roa", "Ingenier�a de Sistemas", "	VIII",
						"	3.3	3.4	4.5	4.4\n" },
				{ "79003003", "Pedro Jos� Pineda Pineda	Odontolog�a	", "VI", "	4.0	", "4.1", "	3.9", "	4.5\n" },
				{ "52900901", "Ruth Paola Mahecha Mahecha	", "Odontolog�a", "	VII	", "3.6", "	3.6	", "3.8", "3.9\n" },
				{ "26900345", "Lucia Valderrama Pineda", "	Fisioterapia", "	VIII", "	4.4", "	4.5", "	4.1	",
						"3.1\n" },
				{ "35676900", "  Mariela Lucia Olgu�n Ram�rez", "Medicina", "V", "3.0", "3.1", "	4.6", "	3.7\n" },
				{ "27101234", "Lucila Pe�aranda Pe�aranda", "	Enfermer�a", "	II", "	2.5", "	4.6", "	3.4",
						"	4.6\n" },
				{ "80231678", "	Milena Palacios Palacios	", "Ingenier�a Mec�nica", "	III	", "3.6", "	3.4	", "3.5",
						"	4.5\n" },
				{ "1030617979", "	Luis Alberto Castellanos Frias", "	Odontolog�a", "	VI	", "4,0", "	4.1	", "3.9",
						"	4.5\n" },
				{ "1019066342", "	Nercy Aleidis Rengifo Rengifo", "	Fisioterapia", "	VII", "	3.6	", "3.6",
						"	3.8	", "3.9\n" },
				{ "1014249436", "	Fabi�n Ra�l Moreno Carvajal	", "Medicina	", "VIII", "	4.4", "	4.5", "	4.1",
						"	31\n" },
				{ "1022380843", "	Jonathan Mauricio Baez Baez", "	Enfermer�a", "	V", "	3.0", "	3.1", "	4.6",
						"	3.7\n" },
				{ "1012353083", "	Germ�n Dario Rodr�guez Baez", "	Ingenier�a Mec�nica", "	II", "	2.5", "	4.6",
						"	3.4", "	4.6\n" },
				{ "1030630231", "	Diego Fernando Giraldo Romero", "	Ingenier�a de Petr�leo", "III", "	3.6", "3.4",
						"3.5", "	4.5\n" },
				{ "1020765332", "	Luz Herminda Fonseca Daza	", "Psicolog�a", "	VI", "	4.0	", "4.1	", "3.9",
						"	4.5\n" },
				{ "1022357137", "	Rhonald Dahian Jim�nez Garc�a", "	Ingenier�a Civil", "	VI", "	3.5", "	4.0",
						"	3.3	", "3.5\n" },
				{ "52263227", "	Edgar Andr�s Bejarano P�rez", "	Ingenier�a Civil", "	IV", "	3.0", "	3.3", "	4.2",
						"	4.5\n" },
				{ "1013579638", "	Diego Fernando Bautista G�mez", "	Ingenier�a Civil", "	III", "	3.4", "	4.5",
						"	4.4", "	3.0\n" },
				{ "1030617979", "	Luis Alberto Jaime Hern�ndez", "	Ingenier�a  de Sistemas", "	II", "	4.0",
						"	4.1", "	3.9	", "4.5\n" },
				{ "1019066342", "	Zabala Pereira Nercy Aleidys", "	Ingenier�a Mec�nica", "	V", "	3.0", "	3.3",
						"	4.2", "	4.5\n" },
				{ "1014249436", "	Fabian Raul Duarte Serrano", "	Medicina", "IV	", "3.6", "	3.6", "	3.8",
						"	3.9\n" },
				{ "1022380843", "	Jhonatan Mauricio Rodr�guez  C.", "	Ingenier�a de Petr�leos", "	I	", "3.4	",
						"4.5", "	4.4	", "3.0\n" },
				{ "1012353083", "	German Dario Gonz�lez  Ria�o	", "Ingenier�a de Petr�leos	", "III", "	3.4",
						"	4.5	", "4.4", "	3.0\n" },
				{ "96040605441", "	Michael Duvan Beltran Salcedo", "	Medicina", "	IV	", "3.0", "	3.3", "	4.2",
						"	4.5\n" },
				{ "1013641467", "	Romero Pi�a Dylan David	", "Fisioterapia", "	II	", "3.6	", "3.6", "	3.8",
						"	3.9\n" },
				{ "1030632107", "	Ruben Dario Fuquene C.", "	Ingenier�a Mec�nica", "	V	", "3.0", "	3.3", "	4.2	",
						"4.5\n" },
				{ "53072770", "	Maryory Cuesta Rodr�guez	", "Ingenier�a de Telecomunicaciones", "	IV", "	3.0",
						"	3.3", "	4.2", "	4.5\n" },
				{ "1014245401", "	Cristian Camilo Ortiz Ortiz	", "Ingenier�a de Telecomunicaciones", "	VI",
						"	2.0", "	3.1", "	4.8	", "1.5\n" },
				{ "95070115361", "	Yuly Katherine Sierra	", "Ingenier�a Mec�nica	", "V", "2.7	", "3.9	", "4.7	",
						"4.5\n" },
				{ "1020796896", "	Daniel Andres Zapata Bello", "Ingenier�a Mec�nica", "IV", "3.0", "	3.3", "	4.2",
						"	4.5\n" },
				{ "1003819124", "	Jos� Eitner Montiel  Aldana", "Medicina", "	IV", "3.0", "	3.3	", "4.2", "4.5\n" },
				{ "1031131906", "	Luis Guillermo Andrade Cifuentes", "Medicina", "VIII", "	3.9	", "3.8", "	2.6	",
						"4.5\n" },
				{ "1019018284", "	Jairo Joel Noguera melo", "	Medicina", "VIII", "3.7", "	3.7	", "4,7	", "4.0\n" },
				{ "1014218719", "	Bryan Andr�s Orteg�n", "	Medicina", "IV", "	3.0", "	3.3", "	4.2", "	4.5\n" },
				{ "1030611565", "M�nica Andrea Plaza Bernal	", "Medicina", "IV", "	3.6,", "	3.8,", "	4.8,",
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