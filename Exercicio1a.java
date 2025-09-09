import java.util.Scanner;

public class Exercicio1a {
    public static void main(String[] args){

        System.out.println("Entre com dois números inteiros");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a + b;

        System.out.println(result);

        sc.close();
    }
}
