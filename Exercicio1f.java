package Aulas3POB;
import java.util.Scanner;

public class Exercicio1f {
    public static void main(String[] args){

        System.out.println("Entre com o salário e o desconto do inss");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = a - b;

        System.out.println(result);

        sc.close();
    }
}
