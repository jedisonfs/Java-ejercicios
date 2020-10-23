package Libro.sentencias;

public class Ejc16 {

	public static void main(String [] args) {
		
		int n1 = 123;
		int a = n1/100;
		int b = n1%100;
		int c = b/10;
		int d = b%10;
		
		
		if(a == c ) {
			System.out.println(a+" y  "+b+" son iguales");
		}else if(a == d) {
			System.out.println(a+" y "+c+" son iguales");
		}else if(c == d) {
			System.out.println(b + " y "+c+" son iguales");
		}else if (a == c && c == d && a == d) {
			System.out.println("Todos los numeros son iguales");
		}else {
			System.out.println("Ninguno es igual");
		}
	}
}
