package logica.estructurada;

public class Multiplicacion {

	public static int multiplicacion(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {

		Multiplicacion m1 = new Multiplicacion();

		System.out.println(m1.multiplicacion(2, 5, 6));

	}
}
