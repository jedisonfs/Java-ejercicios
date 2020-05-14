package algoritmia;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nu1 = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        System.out.println("Digite un numero de tres digitos");
        nu1 = sc.nextInt();


        do{
            nu1++;
        }while(nu1 < 20);
        a = nu1 / 100;
        b = nu1 % 100;
        c = b / 10;
        d = b % 10;

        if(a == d){
            System.out.println(a+" y "+b+" son iguales");
        }else if(a == c){
            System.out.println(a+" y "+c+" son iguales");
        }else if(d == c){
            System.out.println(b+" y "+b+" son iguales");
        }else{
            System.out.println("No hay numeros iguales");
        }

    }
}
