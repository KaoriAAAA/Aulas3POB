package Aulas3POB;

import java.util.Scanner;

public class Exercicio2h {
    public static void main(String[] args){

        System.out.println("Entre com a quantidade de materias que o aluno nao alcançou a media");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String resultado = (a == 0) ? "APROVADO" : (a > 5) ? "REPROVADO" : "RECUPERAÇAO";

        System.out.println(resultado);

        sc.close();
    }
}
