package algoritmia;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1;
        int cont = 0;

        System.out.println("Digite un numero");
        n1 = sc.nextInt();

        for (int i = 1; i < 10; i=i+1) {
            if (n1 % i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No primo");
        }
    }
}



