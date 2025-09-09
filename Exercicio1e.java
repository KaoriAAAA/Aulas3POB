import java.util.Scanner;

public class Exercicio1e {
    public static void main(String[] args){

        System.out.println("Entre com a idade para exibir em dias");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a < 0){
            System.out.println("Idade invalida");
            System.exit(1);
        }

        int result = a * 365;

        System.out.println(result);

        sc.close();
    }
}
