import java.util.Scanner;

public class Aula07_Exercicio01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int m = 3, n = 3;
        int maiores10 = 0;
        int matriz[][] = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.println("Informe a linha " +(i+1)+ " e a coluna " +(j+1)+ ": ");
                matriz[i][j] = leia.nextInt();
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){

                if (matriz[i][j] > 10){
                    maiores10++;
                }
            }
        }
        System.out.println("-------------------------------");
        System.out.println(maiores10+ " valores foram maiores que 10.");
        System.out.println("-------------------------------");
    }
}
//AULA 07 - Exercicio 01
//
//Faça um programa que leia a dimensão de uma matriz de inteiros M e N, onde M é
//o número de linhas e N é o número de colunas. A seguir, leia os elementos da matriz,
//conte e escreva quantos valores maiores que 10 ela possui.