import java.util.Scanner;

public class Aula06_Exercicio02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 4;
        int qtdPares = 0, somaImpares = 0;
        int numeros[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("Informe o " +i+ "º número: " );
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){
            if (numeros[i] % 2 == 0){
                qtdPares++;

            }else {
                somaImpares = somaImpares + numeros[i];
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("A quantidade de valores pares é: " +qtdPares);
        System.out.println("A soma dos valores ímpares é: " +somaImpares);
        System.out.println("-------------------------------------");
    }
}
//AULA 06 - EXERCÍCIO 02
//
//Faça um programa para ler N valores inteiros e armazená-los em um vetor. O programa deve contar quantos
//valores pares ele possui e somar os valores ímpares.