// Preencha um array com 100 números aleatórios e informe quantos e quais são maiores que a média.

public class Questão2 {
    
    public static void main(String[] args) {
        
        // Declaração da matriz unidimensional com 100 números e o contador inicial da soma

        int[] matriz_unidimensional = new int[100];
        int soma = 0;

        // Preencher a matriz com números aleatórios (0 a 100) e calcular a soma 
        
        for (int i = 0; i < matriz_unidimensional.length; i++) {
            matriz_unidimensional[i] = (int) (Math.random() * 101); 
            soma += matriz_unidimensional[i];
        }

        // Calcular a média 

        double media = (double) soma / matriz_unidimensional.length;

        // Vamos imprimir a média
        
        System.out.println("Média: " + media);

        // Encontrar os números maiores que a média
        
        
        System.out.println("Números maiores que a média:");
        
        int contador = 0;
        
        for (int i = 0; i < matriz_unidimensional.length; i++) {
            if (matriz_unidimensional[i] > media) {
                System.out.print(matriz_unidimensional[i] + " ");
                contador++;
            }
        }

        // Imprimir a quantidade de números maiores que a média
        
        System.out.println("\nQuantidade de números maiores que a média: " + contador);
    }
}