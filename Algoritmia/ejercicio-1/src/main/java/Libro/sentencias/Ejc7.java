package Libro.sentencias;

public class Ejc7 {

	public static void main(String[] args) {

		int n1 = -11;

		if (n1 > 9 || n1< -9 ) {
			if (n1 % 1 == 0 && n1 % 4 == 0 && n1 % n1 == 0) {
				System.out.println("El numero no es primo");
			} else {
				System.out.println("El numero es primo "+n1);
			}
			
			if(n1<0) {
				System.out.println("El numero  es negativo");
			}
		}
	}
}
