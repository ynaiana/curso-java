import java.util.Scanner;

public class Aula04_Atividade01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double nota = 0;
        double soma = 0;
        double media = 0;

        for (int i = 1; i <= 4; i++){
            System.out.println("Informe a " +i+ "ª nota: ");
            nota = leia.nextDouble();
            soma += nota;
        }

        media = soma / 4;

        if (media > 6){
            System.out.println("Aluno aprovado!");

        } else if (media > 5 && media < 6){
            System.out.println("Aluno em recuperação!");

        }else {
            System.out.println("Aluno reprovado!");
        }
    }
}
//AULA 04 - ATIVIDADE 01
//
//Escreva um algoritmo que receba 4 notas de um aluno. Depois calcule a média dessas 4 notas e apresente se o
// aluno foi:
// - nota maior que 6: Aprovado
// - nota entre 5 e 6: Em recuperação
// - nota menor que  5: Reprovado
