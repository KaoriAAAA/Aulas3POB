package Aulas3POB;

import java.util.Scanner;

public class Exercicio2c {
    public static void main(String[] args){

        System.out.println("Entre com dois numeros inteiros");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int maior = (a > b) ? a : b;

        System.out.println("O maior numero e " + maior);

        sc.close();
    }
}
