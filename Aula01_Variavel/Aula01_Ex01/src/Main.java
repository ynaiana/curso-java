import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int nota1 = 0;
        int nota2 = 0;
        int media = 0;

        System.out.println("Informe a 1ª nota do aluno: ");
        nota1 = leia.nextInt();

        System.out.println("Informe a 2ª nota do aluno: ");
        nota2 = leia.nextInt();

        media = (nota1 + nota2) /2;

        System.out.println("A média do(a) aluno(a) é: " +media);

    }
}
//AULA 01  - EXERCÍCIO 1
//Ler as 1ª e 2ª  avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem: " A média do aluno(a) é:  valor da média "