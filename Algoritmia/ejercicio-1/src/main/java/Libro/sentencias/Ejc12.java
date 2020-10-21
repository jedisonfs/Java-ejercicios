package Libro.sentencias;

public class Ejc12 {

	public static void main (String [] args) {
		
		int n1 = 24;
		int n2=24;
		int a = n1 / 10;
		int b = n1 % 10;
		int c = n2/10;
		int d = n2%10;
		
		if(a == c || a == d || b == c || b == d  ) {
			System.out.println("Tiene numeros iguales");
		}
	}
}
