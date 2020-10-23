package Libro.sentencias;

public class Ejc17 {

	public static void main(String[] args) {

		int n1 = 123;
		int a = n1 / 100;
		int b = n1 % 100;
		int c = b / 10;
		int d = b % 10;

		if (a > c && a>d) {
			System.out.println("El numero mayor es "+a+" y es esta en la primera posicion ");
		} else if (c > a && c>d) {
			System.out.println("El numero mayor es "+c+" y esta en segunda posicion");
		} else if (d > a && d>c) {
			System.out.println("El numero mayor es "+d+" y esta en la ultima pocision");
		}
	}
}
