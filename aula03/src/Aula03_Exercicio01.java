import java.util.Scanner;

public class Aula03_Exercicio01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero = 0, numerosMaiores8 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe o " +i+ "º número: ");
            numero = leia.nextInt();

            if (numero > 8){
                numerosMaiores8++;
            }
        }
        System.out.println("A quantidade de números maiores do que 8 são " +numerosMaiores8);
    }
}
//AULA 03 - EXERCÍCIO 01
//
// Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.