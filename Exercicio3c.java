import java.util.Scanner;

public class Exercicio3c{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero n: ");
        int n = sc.nextInt();

        do{


            System.out.print(n + "\n");

            n--;
        }while(n >= 0);

        sc.close();
    }
}