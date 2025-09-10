import java.util.Scanner;

public class Exercicio4c{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i=0;i<numeros.length;i++){
            System.out.print("Digite o numero no indice " + i + " ");

            numeros[i] = sc.nextInt();
        }

        for (int i = numeros.length-1;i>=0;i--){
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}