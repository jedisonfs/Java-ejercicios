package Libro.sentencias;

public class Ejc20 {

	public static void main(String[] args) {

		int n1 = 1;
		int n2 = 5;
		int n3 = 2;

		if (n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.println(n1 + n2 + n3);
		} else if (n1 > n2 && n1 > n3 && n3 > n2) {
			System.out.println(n1 + n3 + n2);
		} else if (n2 > n1 && n2 > n3 && n1 < n3) {
			System.out.println(n2 + n1 + n3);
		} else if (n2 > n1 && n2 > n3 && n3 > n1) {
			System.out.println(n2 + n3 + n1);
		} else if (n3 > n2 && n3 > n1 && n2 > n1) {
			System.out.println(n3 + n2 + n1);
		} else if (n3 > n2 && n3 > n1 && n1 > n2) {
			System.out.println(n3 + n1 + n2);
		}else {
			System.out.println("Error en los numeros ingrsados");
		}
	}
}
