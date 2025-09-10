import java.util.Scanner;

public class Exercicio4b{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] notas = new int[4];
        int sum = 0;

        for (int i=0;i<notas.length;i++){
            System.out.print("Digite a nota do aluno na Av" + (i+1) + " ");

            notas[i] = sc.nextInt();

            sum += notas[i];
        }

        float result = (float)sum/notas.length;

        System.out.println("\nMedia do aluno: " + result);

        if (result >= 7) System.out.println("Aprovado"); else System.out.println("Reprovado");

        sc.close();
    }
}