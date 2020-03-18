package algoritmia;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int suma = 0;

        System.out.println("Digite numero uno");
        n1 = sc.nextInt();

        System.out.println("Digite un segundo numero ");
        n2 = sc.nextInt();

        suma = n1+n2;

        if (suma % 2 == 0){
            System.out.println("La suma es numero par "+suma);
        }else{
            System.out.println("No es par "+suma);
        }
    }
}
