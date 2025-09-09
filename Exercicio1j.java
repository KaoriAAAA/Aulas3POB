import java.util.Scanner;
import java.lang.Math;

public class Exercicio1j {
    public static void main(String[] args){

        System.out.println("Entre com x1, y1, x2 e y3, nessa ordem.");
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Distancia = %.2f", result);

        sc.close();
    }
}
