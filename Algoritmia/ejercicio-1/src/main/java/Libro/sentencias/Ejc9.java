package Libro.sentencias;

public class Ejc9 {
	
	public static void main (String [] args) {
		
		int n1 = 24;
		int a = n1 / 10;
		int b = n1 % 10;
		
		if(a<b) {
			if(b%a == 0) {
				System.out.println("Los numeros son multiplos ");	
			}else {
				System.out.println("El numero no son primos");
			}
		}else if(b<a) {
			if(a%b == 0) {
				System.out.println("El numero son primos");
			}else {
				System.out.println("No son primos");
			}
		}
		
	}
}
