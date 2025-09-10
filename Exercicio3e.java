import java.util.Scanner;

public class Exercicio3e{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o inicio do intervalo: ");
        int min = sc.nextInt();

        System.out.println("Digite o fim do intervalo: ");
        int max = sc.nextInt();

        if ((min < 0 || min == 1) || (max < 0 || max == 1 || max < min)){
            System.out.println("Entrada invalida. Finalizando programa.");
            System.exit(1);
        }

        for(int i=min;i<=max;i++){
            if (i < 2) continue;
            boolean isPrime = true;

            for(int j=2;j<=i / 2;j++){
                
                if (i % j == 0) {
                    isPrime = false;
                    break; 
                }
            }

            if (isPrime) {
                System.out.println("\n" + i);
            }
        }

        sc.close();
    }
}