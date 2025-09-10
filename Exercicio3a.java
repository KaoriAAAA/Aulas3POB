import java.util.Scanner;

public class Exercicio3a{
    public static void main(String[] args){

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero n: ");
        int n = sc.nextInt();

        for (int i=0; i <= n; i++){
            sum += i;
        }

        System.out.println("Soma: " + sum);

    }
}