import java.util.Scanner;

public class Ejercicio2 {

    private int a;
    private int b;

    public int suma(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {

        Ejercicio2 s = new Ejercicio2();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero");
        int numero1 = sc.nextInt();

        System.out.println("Ingrese numero 2");
        int numero2 = sc.nextInt();

        System.out.println(s.suma(numero1,numero2));
    }
}
