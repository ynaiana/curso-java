import java.util.Scanner;

public class Aula06_Exercicio01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 0;
        int valorProcurado = 0, indiceProcurado = -1;

        System.out.println("Informe a quantidade de números: ");
        qtdNumeros = leia.nextInt();

        int numeros[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("Informe o " +i+ "º número: ");
            numeros[i] = leia.nextInt();
        }

        System.out.println("Informe o valor a ser procurado: ");
        valorProcurado = leia.nextInt();

        for (int i = 0; i < qtdNumeros; i++){

            if(valorProcurado == numeros[i]){
                indiceProcurado = i;
            }
        }
        System.out.println("O valor procurado (" +valorProcurado+ ") foi encontrado na posição " +indiceProcurado);
    }
}
//AULA 06 - EXERCÍCIO 01
//
//Faça um programa cujas entradas são o número de elementos de um vetor de números inteiros, seguida dos
// elementos do vetor, seguido de um valor a ser procurado no vetor. O programa deve retornar um número
// inteiro indicando o índice da posição do elemento, caso ele tenha sido encontrado, ou o número -1,
// caso não tenha sido encontrado.