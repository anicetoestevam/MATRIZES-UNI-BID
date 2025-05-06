//Faça um programa que leia 20 números, armazene-os em um array e imprima-o. Depois, substitua
//todos os números ímpares por 1 e imprima o array.


import java.util.Scanner;

public class Questão1 {
    
    public static void main(String[] args) {
        
        // Declaração do método Scanner e da matriz unidimensional com 20 números 
        
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[20];

        // O usuário precisa digitar na matriz os valores 
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número do índice " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Imprimir a matriz unidimensional originária
        
        System.out.print("Matriz unidimensional original: ");
        
        for (int valor_original : numeros) {
            System.out.print(valor_original + " ");
        }
        
        System.out.println();

        // Vamos substituir os números ímpares por 1
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                numeros[i] = 1;
            }
        }

        // Por fim vamos imprimir a matriz alterada
        
        System.out.print("Matriz alterada: ");
        
        for (int valor_alterado : numeros) {
            System.out.print(valor_alterado + " ");
        }
        
        System.out.println();

        entrada.close();
    }
}