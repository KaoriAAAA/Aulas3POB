package Aulas3POB;

import java.util.Scanner;

public class Exercicio2i {
    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com duas notas");
        double av1 = sc.nextDouble();
        double av2 = sc.nextDouble();

        double media = (av1 + av2)/2;

        if (media >= 7){
            System.out.println("APROVADO");
        }else{
            System.out.println("Entre com uma terceira nota");
            double avf = sc.nextDouble();

            double novamedia = ((av1) + (av2) + (avf * 2))/4;
            
            if (novamedia >= 6){
                System.out.println("APROVADO");
            }else{
                System.out.println("REPROVADO");
            }
        }

        sc.close();
    }
}
