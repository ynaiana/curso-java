import java.util.Scanner;

public class Aula06_Exercicio06 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 4;
        int somaImpares = 0, mediaImpares = 0, qtdImpares = 0;
        int numeros[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o " +(i+1)+ "º número: ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){
            if (numeros[i] % 2 != 0){
                somaImpares = somaImpares + numeros[i];
                qtdImpares++;
            }
        }

        mediaImpares = somaImpares / qtdImpares;

        System.out.println("---------------------------------");
        System.out.println("A média dos número ímpares é: " + mediaImpares);
        System.out.println("---------------------------------");
    }
}
//AULA 06 - EXERCÍCIO 06
//
//Escreva um programa Java que lê um vetor de números inteiros e exibe a média dos números armazenados em posições
// ímpares.