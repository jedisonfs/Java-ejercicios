package algoritmia;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;

        System.out.println("Ingrese un numero");
        numero1 = sc.nextInt();

        if(numero1 < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("No es negativo");
        }
    }
}
