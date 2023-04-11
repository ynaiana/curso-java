import java.util.Scanner;

public class Aula06_Exercicio04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 4;
        int somaNumeros = 0, mediaNumeros = 0;
        int qtdNumerosMaiores = 0;
        int numeros[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o " +i+ "º número: ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){
            somaNumeros = somaNumeros + numeros[i];
            mediaNumeros = somaNumeros / qtdNumeros;
        }

        for (int i = 0; i < qtdNumeros; i++) {

            if (numeros[i] > mediaNumeros){
                qtdNumerosMaiores++;
            }
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("A quantidade de elementos que são maiores que a média é: " +qtdNumerosMaiores);
        System.out.println("-----------------------------------------------------------");
    }
}
//AULA 06 - EXERCÍCIO 04
//
//Faça um programa que lê um conjunto de números inteiros do usuário e armazena esses números em um vetor.
//O programa deve então encontrar e exibir o número de elementos no vetor que são maiores do que a média
//dos números no vetor.