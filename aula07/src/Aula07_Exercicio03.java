import java.util.Scanner;

public class Aula07_Exercicio03 {
    public static void main(String[] args) {

        int linhas = 2, colunas = 3;
        int somaPrimeiraLinha = 0, mediaPrimeiraLinha = 0;
        int somaSegundaLinha = 0, mediaSegundaLinha = 0;
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < 1; i++){
            for (int j = 0; j < colunas; j++) {
                somaPrimeiraLinha = somaPrimeiraLinha + matriz[i][j];
            }
        }

        for (int i = 1; i < 2; i++){
            for (int j = 0; j < colunas; j++) {
                somaSegundaLinha = somaSegundaLinha + matriz[i][j];
            }
        }

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.print(" " +matriz[i][j]+ " ");
            }
            System.out.println();
        }

        mediaPrimeiraLinha = somaPrimeiraLinha / colunas;
        mediaSegundaLinha = somaSegundaLinha / colunas;

        System.out.println("---------------------------------------------");
        System.out.println("A média dos elementos da primeira linha é: " +mediaPrimeiraLinha);
        System.out.println("A média dos elementos da segunda linha é: " +mediaSegundaLinha);
        System.out.println("---------------------------------------------");
    }
}
//AULA 07 - EXERCÍCIO 03
//
//Escreva um programa que cria uma matriz 2x3 de inteiro. Em seguida, calcule a média dos elementos de cada
// linha e exiba os resultados.