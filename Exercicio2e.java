package Aulas3POB;

import java.util.Scanner;

public class Exercicio2e {
    public static void main(String[] args){

        System.out.println("Entre com seu ano de nascimento");
        Scanner sc = new Scanner(System.in);

        int ano = sc.nextInt();

        int idade = 2025 - ano;

        String resultado = (idade >= 16) ? "Apto a ser eleitor." : "Inapto a ser eleitor.";

        System.out.println(resultado + " Possui aproximadamente " + idade + " anos.");

        sc.close();
    }
}
