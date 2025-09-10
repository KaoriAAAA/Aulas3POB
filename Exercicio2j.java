package Aulas3POB;

import java.util.Scanner;

public class Exercicio2j {
    public static void main(String[] args){

        System.out.println("Entre com seu ano de nascimento");

        Scanner sc = new Scanner(System.in);
        int ano = sc.nextInt();

        int idade = 2025 - ano;

        System.out.println("Entre com seu sexo (M/F)");
        String sexo = sc.next();

        if (idade == 18 && sexo.equalsIgnoreCase("M")){
            System.out.println("Serviço militar obrigatorio");
        }else{
            System.out.println("Isento de serviço militar");
        }

        sc.close();
    }
}
