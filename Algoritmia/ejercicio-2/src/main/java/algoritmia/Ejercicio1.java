package algoritmia;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1;

        System.out.println("Ingrese un numero");
        numero1 = sc.nextInt();

        if (numero1%10 == 4) {
            System.out.println("El numero termina en 4");
        }else{
            System.out.println("No termina en 4");
        }

    }
}
