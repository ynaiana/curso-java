import java.util.Scanner;

public class Aula07_Exercicio05 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int linhas = 3, colunas = 3;
        int linhaMaior = 0, colunaMaior = 0;
        int matriz[][] = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.println("Informe a linha " +(i+1)+ " e a coluna " +(j+1)+ ": ");
                matriz[i][j] = leia.nextInt();
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                if (matriz[i][j] > matriz[linhaMaior][colunaMaior] || i == 0){
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.print(" " +matriz[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");
        System.out.println("O maior número está na linha " +(linhaMaior + 1)+ " e na coluna " +(colunaMaior + 1));
        System.out.println("----------------------------------------------");
    }
}
//AULA 07 - EXERCÍCIO 5
//
//Escreva um programa que cria uma matriz 3x3 de inteiros. Em seguida, encontre a posição do maior valor na
// matriz e exiba as coordenadas.
