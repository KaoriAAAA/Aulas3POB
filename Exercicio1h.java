import java.util.Scanner;
import java.lang.Math;

public class Exercicio1h {
    public static void main(String[] args){

        System.out.println("Entre com o raio da esfera");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double result = (4.0/3.0) * 3.14159 * Math.pow(a, 3);

        System.out.printf("%.2f", result);

        sc.close();
    }
}
