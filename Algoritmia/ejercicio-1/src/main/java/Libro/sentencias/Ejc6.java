package Libro.sentencias;

public class Ejc6 {
	public static void main(String[] args) {

		int n1 = 11;

		if (n1 < 20 && n1 > 9) {
			if (n1 % 1 == 0 && n1 % 2 == 0 && n1 % n1 == 0) {
				System.out.println("El numero no es primo " + n1);
			} else {
				System.out.println("El numero  es primo " + n1);
			}
		}
	}
}
