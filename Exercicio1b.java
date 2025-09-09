package Aulas3POB;
import java.util.Scanner;

public class Exercicio1b {
    public static void main(String[] args){

        System.out.println("Entre com o raio do circulo");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double result = a*a * 3.14159;

        System.out.println(result);

        sc.close();
    }
}
