import java.util.Scanner;

public class Aula06_Exercicio03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 4;
        int posicaoMenor = 0;
        int numeros[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o " +(i+1)+ "º número: ");
            numeros[i] = leia.nextInt();
        }

        for(int i = 0; i < qtdNumeros - 1; i++){
            for(int j = i + 1; j < qtdNumeros; j++){
                if (numeros[i] > numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println(numeros[i]);
        }
    }
}
//AULA 06 - EXERCÍCIO 03
//
//Escreva um programa que lê um conjunto de números inteiros do usuário e armazena esses números em um vetor.
//O programa deve então ordenar o vetor em ordem crescente e exibir o vetor ordenado na tela.