package areolinia;

import javax.swing.JOptionPane;

public class Promedio {

	private int edades[] = new int[5];
	private int promedio = 0;
	private String may = "", men = "";
	private String orden = "";

	public void prom() {
		int rep=0;
	do {
		for (int i = 0; i < 5; i++) {

			switch (i) {
			case 0:
				orden = "Primera";
				break;
			case 1:
				orden = "Segunda";
				break;
			case 2:
				orden = "Tercera";
				break;
			case 3:
				orden = "Cuarta";
				break;
			case 4:
				orden = "Quinta";
				break;
			}
			edades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite " + orden + " edad "));
			promedio += edades[i] / 5;
		}
		for(int j=0;j<5;j++) {
			if (edades[j] < promedio) {
				men = men + edades[j]+",";
			}
			if (edades[j] > promedio) {
				may = may + edades[j]+",";
			}
		}		
		JOptionPane.showMessageDialog(null,
				edades[0] + "\n" + edades[1] + "\n" + edades[2] + "\n" + edades[3] + "\n" + edades[4] + "\n"
						+ "\n\n Su promedio es : " + promedio + "\n Numero menor : " + men + "\n Numero mayor : "
						+ may);
		rep=JOptionPane.showConfirmDialog(null, "Desea continuar con el programa");
		}while(rep==1);
		}
	
}