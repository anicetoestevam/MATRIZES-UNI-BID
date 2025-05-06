// Elabore um programa que preenche uma matriz 6 x 6 com números inteiros aleatórios. Após isso, o
//programa deve gerar e imprimir a matriz triangular superior e a matriz triangular inferior a partir da
//matriz original.

import java.util.Random;

public class Questão4 {
    

    public static void main(String[] args) {
        
        // Declaração das matrizes e método Random com números inteiros aleatórios (0 a 99)

        
        int[][] matriz_bidimensional = new int[6][6];
        Random random = new Random();

        // Preencher a matriz 6x6 com números inteiros aleatórios (0 a 99)
        
        System.out.println("Matriz Original:");
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz_bidimensional[i][j] = random.nextInt(100); 
                System.out.print(matriz_bidimensional[i][j] + "\t");
            }
            System.out.println();
        }

        // Agora vamos gerar e imprimir a matriz triangular superior
        
        System.out.println("\nMatriz Triangular Superior:");
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j >= i) {
                    System.out.print(matriz_bidimensional[i][j] + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }

        // Após isso vamos gerar e imprimir a matriz triangular inferior
        
        System.out.println("\nMatriz Triangular Inferior:");
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j <= i) {
                    System.out.print(matriz_bidimensional[i][j] + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }
}