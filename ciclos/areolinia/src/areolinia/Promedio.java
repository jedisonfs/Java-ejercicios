package areolinia;

import javax.swing.JOptionPane;

public class Promedio {

	private int edades[] = new int[5];
	private int promedio = 0;
	private String may = "", men = "";
	private String orden = "";

	public void prom() {
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
			if (edades[i] < promedio) {
				men = men + edades[i];
			}
			if (edades[i] > promedio) {
				may = may + edades[i];
			}
		}
		JOptionPane.showMessageDialog(null,
				edades[0] + "\n" + edades[1] + "\n" + edades[2] + "\n" + edades[3] + "\n" + edades[4] + "\n"
						+ "\n\n Su promedio es : " + promedio + "\n Numero menor : " + men + "\n Numero mayor : "
						+ may);
	}
}