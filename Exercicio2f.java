package Aulas3POB;

import java.util.Scanner;

public class Exercicio2f {
    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu salario bruto");
        double salario = sc.nextDouble();

        System.out.println("Entre com seu sexo (M/F)");
        String sexo = sc.next();

        double desconto;
        if (sexo.equalsIgnoreCase("M")) {
            desconto = salario * 0.05;
        } else {
            desconto = salario * 0.03;
        }

        double saliq = salario - desconto;
        System.out.println("Seu desconto e " + desconto + " e seu salário líquido e " + saliq);

        sc.close();
    }
}
