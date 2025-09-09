package Aulas3POB;

import java.util.Scanner;

public class Exercicio2k {
    public static void main(String[] args){

        System.out.println("Entre com tres inteiros");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b + c || b >= a + c || c >= a + b){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            System.out.println("FORMA TRIANGULO");
        }

        sc.close();
    }
}
