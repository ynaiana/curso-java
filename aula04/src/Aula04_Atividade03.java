import java.util.Scanner;

public class Aula04_Atividade03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int sexo = -1;
        int qtdMulheres = 0, qtdPessoas = 50;
        double altura = 0;
        double menorAltura = 0, maiorAltura = 0;
        double mediaMulheres = 0, mediaPopulacao = 0;
        double somaMulheres = 0, somaPopulacao = 0;

        for (int i = 1; i <= qtdPessoas; i++){

            System.out.println("Informe o sexo (0 = masc | 1 = fem): ");
            sexo = leia.nextInt();

            System.out.println("Informe a altura: ");
            altura = leia.nextDouble();

            if (altura > maiorAltura || i == 1){
                maiorAltura = altura;
            }

            if (altura < menorAltura || i == 1) {
                menorAltura = altura;
            }

            if (sexo == 1){
                somaMulheres += altura;
                qtdMulheres++;
            }
            somaPopulacao += altura;
        }

        mediaMulheres = somaMulheres / qtdMulheres;
        mediaPopulacao = somaPopulacao / qtdPessoas;

        System.out.println("---------------------------------------");
        System.out.println("A maior altura é: " +maiorAltura);
        System.out.println("A menor altura é: " +menorAltura);
        System.out.println("A média de altura das mulheres é: " +mediaMulheres);
        System.out.println("A média de altura da população é: " +mediaPopulacao);
        System.out.println("---------------------------------------");
    }
}
//AULA 04 - ATIVIDADE 03
//
// Foi feita uma pesquisa entre os habitantes de uma região e coletados os dados de altura e sexo (0=masc, 1=fem)
//das pessoas. Faça um programa que leia 50 dados diferentes e informe:
//- a maior e a menor altura encontradas;
//- a média de altura das mulheres;
//- a média de altura da população;