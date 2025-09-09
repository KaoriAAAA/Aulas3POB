package Aulas3POB;

import java.util.Scanner;

public class Exercicio2g {
    public static void main(String[] args){

        System.out.println("Entre com um numero inteiro");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String resultado = (a > 0) ? "POSITIVO" : (a < 0) ? "NEGATIVO" : "NULO";

        System.out.println(resultado);

        sc.close();
    }
}
