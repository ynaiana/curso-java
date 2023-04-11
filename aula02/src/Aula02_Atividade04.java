import java.util.Scanner;

public class Aula02_Atividade04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Digite 1 para calcular a área do quadrado");
        System.out.println("Digite 2 para calcular a área do retangulo");
        System.out.println("Digite 3 para calcular a área do círculo");
        opcao = leia.nextInt();

        switch (opcao) {
            case 1: {
                int lado, areaQuadrado;
                System.out.println("Informe o lado do quadrado: ");
                lado = leia.nextInt();
                areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;
            }
            case 2: {
                int altura, comprimento, areaRetangulo;
                System.out.println("Informe a altura do retangulo: ");
                altura = leia.nextInt();
                System.out.println("Informe o comprimento do retangulo: ");
                comprimento = leia.nextInt();
                areaRetangulo = altura * comprimento;
                System.out.println("A área do retangulo é: " + areaRetangulo);
                break;
            }
            case 3: {
                double raio, areaCirculo;
                System.out.println("Informe o raio do circulo: ");
                raio = leia.nextInt();
                areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("A área do circulo é: " + areaCirculo);
                break;
            }
            default: {
                System.out.println("Opção inválida!");
            }
        }
    }
}
// AULA 02 - Atividade 04
//Construa um algoritmo que possa calcular a área de objetos geometricos (quadradro/retangulo/circulo).
// Faça com que o usuario informe primeiro qual a forma ele quer calcular e depois receba os valores
// necessários e realize o calculo.
//Ex:
//Digite 1 para calcular a area do quadrado;
//Digite 2 para calcular a area do retangulo;
//Digite 3 para calcular a area do circulo;
//Qualquer outra opção escreva "Opção inválida"