import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double altura = 0.0;
        double pesoIdeal = 0.0;

        System.out.println("Informe a sua altura: ");
        altura = leia.nextDouble();

        pesoIdeal = (62.1 * altura) - 44.7;

        System.out.println("O seu peso ideal é: " +pesoIdeal);
    }
}
//AULA 01  - EXERCÍCIO 3
//Tendo como dado de entrada a altura de uma mulher, calcule
//e mostre seu peso ideal, utilizando a seguinte fórmula:
//             peso ideal = (62.1 * altura) - 44.7
//Exiba na tela o resultado final.