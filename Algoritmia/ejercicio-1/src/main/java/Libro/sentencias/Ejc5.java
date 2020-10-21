package Libro.sentencias;

public class Ejc5 {

	public static void main (String [] args) {
		 
		int n1=24;
		int a=n1/10;
		int b=n1%10;
		
		if (a%2 == 0 && b%2 == 0) {
			System.out.println("Los numeros son pares "+a+"\n"+b);
		}else {
			System.out.println("Los numeros son impares");
		}
	}
}
