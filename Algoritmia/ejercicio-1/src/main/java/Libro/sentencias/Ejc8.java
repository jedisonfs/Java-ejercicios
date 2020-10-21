package Libro.sentencias;

public class Ejc8 {

	public static void main(String[] args) {

		int n1 = 24;
		int a = n1 / 10;
		int b = n1 % 10;

		if (a % a == 0 && b % b == 0) 
			if (a % 1 == 0 && b % 1 == 0)
				if (a % 3 == 0 && b % 3 == 0) {
					System.out.println("Los dos numeros son primos ");
		} else {
			System.out.println("Los numeros no son primos");
		}

	}
}
