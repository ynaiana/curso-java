import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int lado1 = 0, lado2 = 0, lado3 = 0;

        System.out.println("Informe o 1º lado: ");
        lado1 = leia.nextInt();

        System.out.println("Informe o 2º lado: ");
        lado2 = leia.nextInt();

        System.out.println("Informe o 3º lado: ");
        lado3 = leia.nextInt();

        if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1) {

            if (lado1 == lado2 && lado1 == lado3){
                System.out.println("É um Triângulo Equilátero");

            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                System.out.println("É um Triângulo Isósceles");

            } else {
                System.out.println("É um Triângulo Escaleno");
            }

        } else {
            System.out.println("Não é um triângulo");
        }


    }
}
//EXERCÍCIO 04 - AULA 02
//
//Faça um algoritmo que receba os 3 lados de um triângulo. O programa deverá informar se os valores podem ser
//um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ouescaleno.
//Dicas:
//Três lados formam um triangulo quando a soma de quaisquer dos dois lados é maior que o terceiro.
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;