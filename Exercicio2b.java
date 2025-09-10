package Aulas3POB;

import java.util.Scanner;

public class Exercicio2b {
    public static void main(String[] args){

        System.out.println("Entre com a idade");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >= 18){
            System.out.println("Maior de idade");
        }
        else
        {
            System.out.println("Menor de idade");
        }


        sc.close();
    }
}
