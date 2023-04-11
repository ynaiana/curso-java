import java.util.Scanner;

public class Aula04_Atividade04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int opcao = -1;
        double numero1 = 0, numero2 = 0;

        while (opcao != 0) {
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - SOMAR");
            System.out.println("2 - SUBTRAIR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("0 - ENCERRAR A CALCULADORA");
            opcao = leia.nextInt();

            if (opcao >= 1 && opcao <= 4) {

                System.out.println("Informe o 1º número: ");
                numero1 = leia.nextDouble();

                System.out.println("Informe o 2º número: ");
                numero2 = leia.nextDouble();

                switch (opcao) {
                    case 1: {
                        double soma = 0;

                        soma = numero1 + numero2;

                        System.out.println("----------------------------");
                        System.out.println("Resultado: " +numero1+ " + " +numero2+ " = " +soma);
                        System.out.println("----------------------------");
                        break;
                    }

                    case 2: {
                        double subtracao = 0;

                        subtracao = numero1 - numero2;

                        System.out.println("----------------------------");
                        System.out.println("Resultado: " +numero1+ " - " +numero2+ " = " +subtracao);
                        System.out.println("----------------------------");
                        break;
                    }

                    case 3: {
                        double multiplicacao = 0;

                        multiplicacao = numero1 * numero2;

                        System.out.println("----------------------------");
                        System.out.println("Resultado: " +numero1+ " * " +numero2+ " = " +multiplicacao);
                        System.out.println("----------------------------");
                        break;
                    }

                    case 4: {
                        double divisao = 0;

                        if (numero2 == 0){
                            System.out.println("Informe um número válido!"); break;

                        }else {
                            divisao = numero1 / numero2;
                        }

                        System.out.println("----------------------------");
                        System.out.println("Resultado: " +numero1+ " / " +numero2+ " = " +divisao);
                        System.out.println("----------------------------");
                        break;
                    }
                }
            }
        }
        System.out.println("Calculadora encerrada!");
    }
}
//AULA 04 - ATIVIDADE 04
//
//Faça um algoritmo que simule uma calculadora. O algoritmo deve permitir que eu faça mais de um calculo
// antes de encerrar, ou seja apresente a opção para que o usuário encerre a calculadora. Ex:
//Selecione uma opção:
//1 - SOMAR
//2 - SUBTRAIR
//3 -  MULTIPLICAR
//4 - DIVIDIR
//0 - ENCERRAR CALCULADORA;
//
//Obs: Não permita que haja divisão por 0; Para calcular receba sempre dois números!