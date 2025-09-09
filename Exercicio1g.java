import java.util.Scanner;

public class Exercicio1g {
    public static void main(String[] args){

        System.out.println("Entre com a base e a altura");
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base+altura);

        System.out.println("Area: " + area + " Perimetro: " + perimetro);

        sc.close();
    }
}
