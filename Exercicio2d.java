package Aulas3POB;

import java.util.Scanner;

public class Exercicio2d {
    public static void main(String[] args){

        System.out.println("Entre com um numero inteiro");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String resultado = (a % 2 == 0) ? "PAR" : "IMPAR";

        System.out.println("O numero e " + resultado);

        sc.close();
    }
}
