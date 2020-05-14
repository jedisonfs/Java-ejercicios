package algoritmia;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int nu1 = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        System.out.println("Digite un numero de tres digitos");
        nu1 = sc.nextInt();

        a = nu1/100;
        b = nu1%100;
        c = b/10;
        d = b%10;


        System.out.println("La suma total es de "+(a+c+d));
    }
}
