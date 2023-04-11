import java.util.Scanner;

public class Aula01_Exercicio02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double altura = 0.0;
        double pesoIdeal = 0.0;

        System.out.println("Informe a altura do homem: ");
        altura = leia.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal dele é: "+pesoIdeal);
    }
}
//AULA 01  - EXERCÍCIO 2
//Tendo como dado de entrada a altura de um homem, calcule e mostre seu peso ideal, utilizando a
// seguinte fórmula:
//peso ideal = (72.7 * altura) - 58
//Exiba na tela o resultado final.