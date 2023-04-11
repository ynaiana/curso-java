import java.util.Scanner;

public class Aula03_Atividade03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero = 0, tabuada = 0;

        System.out.println("Informe o número desejado: ");
        numero = leia.nextInt();

        for (int i = 1; i <= 50; i++){
            tabuada = numero * i;
            System.out.println(numero+ " * " +i+ " = " +tabuada);
        }
    }
}
//AULA 03 - ATIVIDADE 03
//
//Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação até 50.