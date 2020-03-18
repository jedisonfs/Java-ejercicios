package algoritmia;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int suma = 0;


        System.out.println("Digite un numero ");
        n1 = sc.nextInt();

        System.out.println("Digite un segundo numero");
        n2 = sc.nextInt();

        a = n1/10;
        b = n1%10;
        c = n2/10;
        d = n2%10;

        suma = a+b+c+d;

        if (suma % 2 == 0){
            System.out.println("La suma es numero par "+suma);
        }else{
            System.out.println("No es par "+suma);
        }
    }
}
