package algoritmia;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int a = 0;
        int b = 0;

        System.out.println("Digite un numero ");
        n1 = sc.nextInt();

        a = n1/10;
        b = n1%10;

        if (a%b == 0 ){
            System.out.println(a+" es multiplo de "+b);
        }else{
            System.out.println("No son multiplos");
        }
    }
}
