import java.util.Scanner;

public class Aula06_Exercicio08 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 3, qtdNResultante = 6;
        int vetor1[] = new int[qtdNumeros];
        int vetor2[] = new int[qtdNumeros];
        int vetorResultante[] = new int[qtdNResultante];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o elemento do 1º vetor: ");
            vetor1[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o elemento do 2º vetor: ");
            vetor2[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){
            vetorResultante[i] = vetor1[i];
        }

        for (int i = 0; i < qtdNResultante; i++){
            System.out.println(vetorResultante[i]);
        }
    }
}
//AULA 06 - EXERCÍCIO 08
//
//Escreva um programa Java que lê dois vetores de números inteiros e exibe o vetor resultante da união entre eles
//(ou seja, todos os números que aparecem em pelo menos um dos vetores).