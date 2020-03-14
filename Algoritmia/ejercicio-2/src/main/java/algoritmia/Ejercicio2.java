package algoritmia;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1;

        System.out.println("Digite un numero");
        numero1 = sc.nextInt();

        if (numero1 >= 100 && numero1 < 1000 || numero1 <= -100 && numero1 > -1000) {
            System.out.println("Tiene tres digitos");
        }else{
            System.out.println("no tiene tres digitos");
        }
    }
}
