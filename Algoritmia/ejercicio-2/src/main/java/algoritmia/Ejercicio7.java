package algoritmia;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int cont = 0;

        System.out.println("Digte un numero");
        numero = sc.nextInt();

        for (int i = 1; i < 20; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }

        if (cont == 2 && numero < 0) {
            System.out.println("El numero es primo \n"+"Es negativo");
        } else {
            System.out.println("El numero no es primo\n"+" No es negativo");
        }
    }
}
