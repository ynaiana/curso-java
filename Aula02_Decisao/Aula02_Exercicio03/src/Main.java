import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero = 0;

        System.out.println("Informe o número desejado: ");
        numero = leia.nextInt();

        System.out.println(numero % 2 == 0 ? "O número é par!" : "O número é ímpar!");
    }
}
// EXERCÍCIO 03 - AULA 02
//
//Faça um algoritmo que peça um número inteiro e determine se ele e par ou ímpar.
// Dica: utilize o operador mod (resto da divisão).