import java.util.Scanner;

public class Aula03_Exercicio02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade = 0;
        int tempoContribuicao = 0;

        System.out.println("Informe a idade: ");
        idade = leia.nextInt();

        System.out.println("Informe o tempo de contribuição: ");
        tempoContribuicao = leia.nextInt();

        if (idade >= 65 || tempoContribuicao >= 30 || (idade >= 60 && tempoContribuicao >= 25)){
            System.out.println("A pessoa pode aposentar.");
        }else {
            System.out.println("A pessoa ainda não pode aposentar.");
        }

    }
}
//EXERCÍCIO 02  - AULA 03
//
//Faça um programa que leia dois inteiros, que representam a idade e o tempo de contribuição de um trabalhador
// e informe se ele pode se aposentar ou não. Os critérios para aposentadoria são:
//• Ter pelo menos 65 anos de idade;
//• Ou ter trabalhado pelo menos 30 anos;
//• Ou ter pelo menos 60 anos e trabalhado pelo menos 25.
