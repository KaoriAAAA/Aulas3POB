import java.util.Scanner;

public class Exercicio1i {
    public static void main(String[] args){

        System.out.println("Entre com o valor em reais e a cotaçao do dolar");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = a * b; 

        System.out.printf("%.2f", result);

        sc.close();
    }
}
