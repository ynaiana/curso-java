import java.util.Scanner;

public class Aula05_Atividade04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 8;
        int numerosA[] = new int[qtdNumeros];
        int numerosB[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o " +(i+1)+ "º número: ");
            numerosA[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){
            numerosB[i] = numerosA[i] * 3;
        }

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Resultado: " +numerosB[i]);
        }
    }
}
//AULA 05 - ATIVIDADE 04
//
// Ler oito elementos inteiros em uma matriz unidimensional (A). Construir uma matriz B de
//mesma dimensão com os elementos da matriz A multiplicados por 3. Após, apresente os números da matriz B
//
//Exemplo:
//vetorA[0] = 1;
//vetorB[0] = vetorA[0] * 3;
//resultado: vetor[0] // 3