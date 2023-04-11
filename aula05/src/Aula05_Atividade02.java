import java.util.Scanner;

public class Aula05_Atividade02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdAlunos = 15;
        double media = 0, soma = 0;

        double notas[] = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++){
            System.out.println("Informe a " +(i+1)+ "ª nota: ");
            notas[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdAlunos; i++){
            soma = soma + notas[i];
        }

        media = soma / qtdAlunos;

        System.out.println("A média geral dos alunos é: "+media);
    }
}
//AULA 05 - ATIVIDADE 02
//
// Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule e imprima a media geral.