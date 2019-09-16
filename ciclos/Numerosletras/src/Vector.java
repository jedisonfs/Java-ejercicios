import javax.swing.JOptionPane;

public class Vector {

	    public static void main (String[] args) {

	        int edades[] = new int[5];
	        int promedio = 0;
	        String may="",men="";
	        String orden = "";

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
	            promedio += edades[i] /5;
	            if(edades[i]< promedio){
	                men = men +edades[i];
	            }if(edades[i]>promedio){
	                may = may+edades[i];  
	            }
	        }
	        JOptionPane.showMessageDialog(null, edades[0] + "\n" + edades[1] + "\n" + edades[2] + "\n" + edades[3] + "\n" + edades[4] + "\n" + "\n\n Su promedio es : "+promedio+"\n Numero menor : "+men+"\n Numero mayor : "+may );
	    }
}
