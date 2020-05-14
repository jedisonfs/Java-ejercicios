package algoritmia;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int a = 0;
        int b = 0;
        int cont = 0;
        int cont2 = 0;

        System.out.println("Digite un numero");
        num1 = sc.nextInt();

        a = num1/10;
        b = num1%10;

        for(int i=1;i < 20;i++){
            if(a % i == 0){
                cont++;
            }if(b % i == 0){
                cont2++;
            }
        }

        if(cont == cont2){
            System.out.println("Tiene numeros iguales");
        }else{
            System.out.println("no tienen numeros iguales ");
        }
    }
}
