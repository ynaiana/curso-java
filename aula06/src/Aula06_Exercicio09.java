import java.util.Scanner;

public class Aula06_Exercicio09 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 3;
        int numeros[] = new int[qtdNumeros];
        boolean isPar = true;

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o " +(i+1)+ "º número: ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){

            if (numeros[i] % 2 != 0){
                isPar = false;
            }
        }

        if (isPar){
            System.out.println("------------------");
            System.out.println("O vetor é par: ");
            for (int i = 0; i < qtdNumeros; i++) {
                System.out.println(numeros[i]);
            }

        }else {
            System.out.println("------------------");
            System.out.println("O vetor não é par!");
        }
    }
}
//AULA 06 - EXERCÍCIO 09
//
//Escreva um programa Java que lê um vetor de números inteiros e verifica se ele contém apenas números pares.
// Se sim, apresente o vetor. Caso não, informe que o vetor não é par.