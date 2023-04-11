import java.util.Scanner;

public class Aula07_Atividade01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int matriz[][] = new int[2][2];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println("Informe a linha " +(i+1)+ " e a coluna " +(j+1)+ ":");
                matriz[i][j] = leia.nextInt();
            }
        }

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(" " +matriz[i][j]+ " " );
            }
            System.out.println();
        }
    }
}
//AULA 07 - EXERCÍCIO 01
//
//Crie um programa que preencha todos os valores de uma matriz 2x2, e em seguida exiba todos os valores e a soma
// de todos os valores. EXIBIR EM FORMA DE MATRIZ!