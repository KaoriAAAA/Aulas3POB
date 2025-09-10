import java.util.Scanner;

public class Exercicio4a{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i=0;i<5;i++){
            System.out.print("\nDigite o numero no indice " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        int min=numeros[0], max=numeros[0];

        for (int i=0;i<5;i++){
            
            if(numeros[i]<min){
                min = numeros[i];
            }

            if(numeros[i]>max){
                max = numeros[i];
            }

        }

        System.out.println("\nValor minimo: " + min + " Valor maximo: " + max);

        sc.close();
    }
}