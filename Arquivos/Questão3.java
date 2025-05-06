//Escreva um programa que lê uma matriz M 5 x 5 e calcula as somas:
//da linha 4 de M.
//da coluna 2 de M.
//da diagonal principal.
//de todos os elementos da matriz.
//Escreva estas somas e a matriz.


import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {
        
        // Declaração das matrizes de 5 colunas e 5 linhas

        
        Scanner entrada = new Scanner(System.in);
        int[][] matriz_bidimensional = new int[5][5];

        // O usuário terá que preencher todas as linhas e colunas
        
        System.out.println("Digite os elementos da matriz 5x5:");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz_bidimensional[i][j] = entrada.nextInt();
            }
        }

        // Declarar as variáveis para as somas 
        
        int somaLinha4 = 0;
        int somaColuna2 = 0;
        int somaDiagonal = 0;
        int somaTotal = 0;

        // Vamos calcular as somas
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaTotal += matriz_bidimensional[i][j]; 
                if (i == 4) somaLinha4 += matriz_bidimensional[i][j]; 
                if (j == 2) somaColuna2 += matriz_bidimensional[i][j];
                if (i == j) somaDiagonal += matriz_bidimensional[i][j]; 
            }
        }

        // Vamos imprimir os resultados 
        
        System.out.println("\nResultados:");
        System.out.println("Soma da linha 4: " + somaLinha4);
        System.out.println("Soma da coluna 2: " + somaColuna2);
        System.out.println("Soma da diagonal principal: " + somaDiagonal);
        System.out.println("Soma de todos os elementos: " + somaTotal);

        // Agora vamos exibir a matriz
        
        System.out.println("\nMatriz:");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz_bidimensional[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}