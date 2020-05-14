package algoritmia;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int a;
        int b;

        System.out.println("Ingrese un numero");
        numero1 = sc.nextInt();

        a = numero1/10;
        b = numero1%10;

        if(numero1 >=10 && numero1 < 100){
            System.out.println("La suma es igual a: "+(a+b));
        }else{
            System.out.println("El numero digitado no tiene dos cifras");
        }
    }
}
