import java.util.Scanner;

public class Exercicio1d {
    public static void main(String[] args){

        System.out.println("Entre com as tres notas");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double result = (a+b+c)/3;

        System.out.println(result);

        sc.close();
    }
}
