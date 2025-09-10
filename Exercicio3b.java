import java.util.Scanner;

public class Exercicio3b{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero n: ");
        int n = sc.nextInt();

        int i=1;
        while (i<=10){

            int result = n*i;

            System.out.print("\n" + n + "*" + i + " = " + result + "\n");

            i++;
        }

        sc.close();
    }
}