package metodo;

import javax.swing.JOptionPane;

public class examen {

	public void cedula() {
		String[] cedu = { "1007385015", "1010032057", "10234562156", "1203458796", "1234561235" };
		String ce="";
		Boolean encontrado=false;
			ce = JOptionPane.showInputDialog(null, "Ingrese su numero de cedula");
		
		for (int i = 0; i < cedu.length; i++) {

			if (cedu[i].equals(ce)) {
				encontrado=true;
				break;
				}
		}
		if(encontrado==true) {		
				JOptionPane.showMessageDialog(null,"Su cedula esta  registrada");
				}
		else {
				JOptionPane.showMessageDialog(null,"Su numero de cedula no se encontro");
				
			}
		}
		
	}


