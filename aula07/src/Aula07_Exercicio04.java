
public class Aula07_Exercicio04 {
    public static void main(String[] args) {

        int linhas = 3, colunas = 3;
        int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int somaLinha[] = new int[linhas];
        int somaColuna[] = new int[colunas];

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                somaLinha[i] = somaLinha[i] + matriz[i][j];
            }
        }

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                somaColuna[j] = somaColuna[j] + matriz[i][j];
            }
        }

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.print(" " +matriz[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                if(i == j){
                    System.out.println("A soma da linha  " +(i+1)+ " é: " +somaLinha[i]);
                    System.out.println("A soma da coluna  " +(j+1)+ " é: "  +somaColuna[j]);
                }
            }
        }
        System.out.println("-----------------------------");
    }
}
//AULA 07 - EXERCÍCIO 04
//
//Escreva um programa que cria uma matriz 3x3 de inteiros. Em seguida, calcule a soma dos elementos de cada
// linha e de cada coluna e exiba os resultados.