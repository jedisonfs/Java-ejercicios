import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int a;
        int b;
        int menor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < b) {
            System.out.println("el numero menor es " + a);
        } else {
            System.out.println("El numero menor es: " + b);
        }

    }
}

