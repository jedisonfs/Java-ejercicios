package algoritmia;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1;
        int a;
        int b;

        System.out.println("Ingrese un numero");
        numero1 = sc.nextInt();

        a = numero1/10;
        b = numero1%10;

        if(a%2 == 0 && b%2 == 0){
            System.out.println("Los dos numeros son pares");
        }else{
            System.out.println("No son pares");
        }
    }
}
