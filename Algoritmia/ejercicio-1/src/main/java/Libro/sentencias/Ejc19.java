package Libro.sentencias;

public class Ejc19 {

	public static void main(String[] args) {

		int n1 = 123;
		int a = n1 / 100;
		int b = n1 % 100;

		if (a > (b / 10)) {
			System.out.println(a + " es mayor que " + (b / 10));

		}
		
		if (((b / 10) % 10) > a) {
			System.out.println((b / 10) % 10 + " es mayor que " + a);
		}
		
		if ((b / 10) < (b % 10)) {
			System.out.println((b % 10) + " es mayor que " + (b / 10));
		} else {
			System.out.println("Ningun numero es mayor");
		}
	}

}
