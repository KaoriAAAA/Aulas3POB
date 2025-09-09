import java.util.Scanner;

public class Exercicio1c {
    public static void main(String[] args){

        System.out.println("Entre com a temperatura em celsius");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double result = (a * 9.0/5.0) + 32;

        System.out.println(result);

        sc.close();
    }
}
