import java.util.Scanner;

public class Aula06_Exercicio10 {
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

            if (vetor1[i] == vetor2[i]){
                vetorResultante[i] = vetor1[i];
            }
        }

        System.out.println("------------------------------------------");
        System.out.println("Os elementos que estão na mesma ordem são: ");
        for (int i = 0; i < qtdNumeros; i++){
            if (vetorResultante[i] != 0) {
                System.out.println(vetorResultante[i]);
            }
        }
        System.out.println("------------------------------------------");
    }
}
//AULA 06 - EXERCÍCIO 10
//
//Escreva um programa Java que lê dois vetores de números inteiros e verifica se eles são iguais (ou seja, se
// possuem os mesmos elementos na mesma ordem)