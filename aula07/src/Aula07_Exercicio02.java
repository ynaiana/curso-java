import java.util.Scanner;

public class Aula07_Exercicio02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n = 4;
        boolean isDiagonal = true;
        int matriz[][] = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("Informe a linha " +(i+1)+ " e a coluna " +(j+1)+ ": ");
                matriz[i][j] = leia.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i != j){
                    if (matriz[i][j] != 0) {
                        isDiagonal = false;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" " +matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(isDiagonal ?  "A matriz é diagonal!" : "A matriz não é diagonal!" );
    }
}
//AULA 07 - EXERCÍCIO 02
//
//Faça um programa que leia a dimensão de uma matriz quadrada N. A seguir, leia os elementos da matriz. Faça um
// programa que verifique se essa matriz é diagonal.
