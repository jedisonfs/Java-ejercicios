package metodo;

import javax.swing.JOptionPane;

public class examen {

	public void cedula() {
		String[] cedu = { "1007385015", "1010032057", "10234562156", "1203458796", "1234561235" };
		String ce="";
			ce = JOptionPane.showInputDialog(null, "Ingrese su numero de cedula");
		
		for (int i = 0; i < cedu.length; i++) {
			//do {
		//		i++
			
			if (cedu[i].compareTo(ce)==0) {
				JOptionPane.showMessageDialog(null,"Su cedula esta  registrada");
				break;
			}else  {
				JOptionPane.showMessageDialog(null,"Su numero de cedula no se encontro");
				break;
			}
		}
		
	}
}
