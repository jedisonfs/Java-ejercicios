package algoritmia;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int a = 0;
        int b = 0;
        int cont = 0;
        int cont2 = 0;

        System.out.println("Digite un numero ");
        n1 = sc.nextInt();

        a = n1/10;
        b = n1%10;
        for (int i = 1; i < 20; i++) {
            if (a % i == 0) {
                cont++;
            } if ( b % i == 0) {
                cont2++;
            }
        }

        if( cont == 2 && cont2 == 2){
            System.out.println("Los dos son primos");
        }else{
            System.out.println("No son primos");
        }
    }
}
