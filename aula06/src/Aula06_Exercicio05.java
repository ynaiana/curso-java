import java.util.Scanner;

public class Aula06_Exercicio05 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 3;
        int vetor1[] = new int[qtdNumeros];
        int vetor2[] = new int[qtdNumeros];
        int vetorResultante[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe os elementos do 1º vetor:");
            vetor1[i] = leia.nextInt();
        }

        System.out.println("--------------------------------------");
        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe os elementos do 2º vetor:");
            vetor2[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){
            for (int j = 0; j < qtdNumeros; j++) {
                if (vetor1[i] == vetor2[j]) {
                    vetorResultante[i] = vetor1[i];
                }
            }
        }

        for (int i = 0; i < qtdNumeros; i++){
            if (vetorResultante[i] != 0) {
                System.out.println(vetorResultante[i]);
            }
        }
    }
}
//AULA 06 - EXERCÍCIO 05
//
//Escreva um programa Java que lê dois vetores de números inteiros e exibe o vetor resultante da interseção
// entre eles (ou seja, os números que aparecem nos dois vetores).