import java.util.Scanner;

public class Aula07_Desafio01 {
    public static void main(String[] args) {

        int [][] matriz = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int aux = 0;

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                int col = coluna;
                for (int i = linha; i < matriz.length; i++){
                    for (int j = col + 1; j < matriz.length; j++){
                        if (matriz[linha][coluna] > matriz[i][j]){
                            aux = matriz[linha][coluna];
                            matriz[linha][coluna] = matriz[i][j];
                            matriz[i][j] = aux;
                        }
                    }
                    col = -1;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
//AULA 07 - DESAFIO 01
//
// Crie um programa que crie uma matriz 3x3 de inteiro. Em seguida, ordene os elementos em ordem crescente e
// exiba a matriz resultante.
