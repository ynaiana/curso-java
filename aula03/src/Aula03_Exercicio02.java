import java.util.Scanner;

public class Aula03_Exercicio02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade = 0, qtdMaioresDeIdade = 0;

        for (int i = 1; i <= 20; i++){
            System.out.print("Informe a " +i+ "ª idade: ");
            idade = leia.nextInt();

            if (idade >= 18){
                qtdMaioresDeIdade++;
            }
        }
        System.out.println("A quantidade de pessoas maiores de idade são: " +qtdMaioresDeIdade);
    }
}
//AULA 03 - EXERCÍCIO 02
//
//Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.