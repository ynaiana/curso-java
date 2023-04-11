import java.util.Scanner;

public class Aula05_Atividade01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 0;
        int aux = 0;
        int posicaoMenor = 0;

        System.out.println("Informe a quantidade de números: ");
        qtdNumeros = leia.nextInt();

        int numeros[] = new int[qtdNumeros];

        for(int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o número");
            numeros[i] = leia.nextInt();
        }

        for(int i = 0; i < qtdNumeros; i++){

            if (numeros[i] < numeros[posicaoMenor] || i == 0) {
                posicaoMenor = i;
            }
        }

        for(int i = 0; i < qtdNumeros; i++){
            aux = numeros[0];
            numeros[0] = numeros[posicaoMenor];
            numeros[posicaoMenor] = aux;
        }

        System.out.println("Resultado: ");
        for(int i = 0; i < qtdNumeros; i++){
            System.out.println(numeros[i]);
        }
    }
}
//AULA 05 - ATIVIDADE 01
//
//1. Faça um programa para ler uma quantidade N de números inteiros e armazená-los em um vetor.
// O programa deve trocar o menor elemento do vetor com o elemento da primeira posição, e imprimir o
// vetor resultante
}