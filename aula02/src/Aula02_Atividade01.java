import java.util.Scanner;

public class Aula02_Atividade01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
        double media = 0;

        System.out.println("Informe a 1ª nota: ");
        nota1 = leia.nextDouble();

        System.out.println("Informe a 2ª nota: ");
        nota2 = leia.nextDouble();

        System.out.println("Informe a 3ª nota: ");
        nota3 = leia.nextDouble();

        System.out.println("Informe a 4ª nota: ");
        nota4 = leia.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 6){
            System.out.println("Aprovado!");

        } else if (media < 6 &&  media > 5) {
            System.out.println("Recuperação!");

        } else {
            System.out.println("Reprovado!");
        }
    }
}
// AULA 02 - Atividade 01
// Algoritmo que receba 4 notas e verifique se a média é maior ou igual a 6. Se for maior ou igual a
// seis apresente a mensagem de "Aprovado". Se for menor apresente "Reprovado".
// (Aventureiro:  Se for menor que 6 e maior que 5 então apresente "Recuperação").