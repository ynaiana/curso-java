import java.util.Scanner;

public class Aula06_Exercicio07 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 4;
        int maiorNumero = 0, segundoMaior = 0;
        int numeros[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o " +(i+1)+ "º número: ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){

            if(numeros[i] > maiorNumero || i == 0){
                maiorNumero = numeros[i];
            }

        }

        for (int i = 0; i < qtdNumeros; i++){

            if (numeros[i] < maiorNumero && numeros[i] > segundoMaior){
                segundoMaior = numeros[i];
            }
        }

        System.out.println("O segundo maior número é: " +segundoMaior);
    }
}
//AULA 06 - EXERCÍCIO 07
//
//Escreva um programa Java que lê um vetor de números inteiros e exibe o segundo maior número do vetor.