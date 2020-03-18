package algoritmia;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int a = 0;
        int b = 0;


        System.out.println("Digite un numero ");
        n1 = sc.nextInt();

        a = n1/10;
        b = n1%10;

        if (a > b ){
            System.out.println(a+" es mayor que "+b);
        }else if (b > a){
            System.out.println(b+ " es mayor que ");
        }
    }
}
