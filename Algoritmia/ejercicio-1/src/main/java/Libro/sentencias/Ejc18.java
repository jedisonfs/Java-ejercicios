package Libro.sentencias;

public class Ejc18 {

	public static void main (String [] args) {
		
		int n1 = 123;
		int a = n1 / 100;
		int b = n1 % 100;
		int c = b / 10;
		int d = b % 10;
		
		if(a % c == 0) {
			System.out.println(c+" es multiplo de "+a);
		}else if(a % d == 0) {
			System.out.println(d+" es multiplo de "+a);
		}else if(c % d == 0) {
			System.out.println(c+" es multiplo de  "+d);
		}else {
			System.out.println("Ninguno son multiplos");
		}
	}
}
