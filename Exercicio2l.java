package Aulas3POB;

import java.util.Scanner;

public class Exercicio2l {
    public static void main(String[] args){

        System.out.println("Entre com tres inteiros");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b + c || b >= a + c || c >= a + b){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if (a == b && b == c){
                System.out.println("EQUILATERO");
            }else if (a == b || a == c || b == c){
                System.out.println("ISOSCELES");
            }else{
                System.out.println("ESCALENO");
            }
        }

        sc.close();
    }
}
