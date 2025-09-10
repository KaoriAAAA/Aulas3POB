import java.util.Scanner;

public class Exercicio3d{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de alunos na turma: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=0;i<n;i++){
            System.out.println("Digite a nota do " + (i+1) + "º aluno");
            sum += sc.nextInt();
        }

        double media = sum/n;

        System.out.println("\nMedia da turma: " + media);

        sc.close();
    }
}