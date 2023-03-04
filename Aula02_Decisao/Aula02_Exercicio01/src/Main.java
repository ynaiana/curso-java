import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double produto1 = 0, produto2 = 0, produto3 = 0;

        System.out.print("Informe o preço do 1º produto: ");
        produto1 = leia.nextDouble();

        System.out.print("Informe o preço do 2º produto: ");
        produto2 = leia.nextDouble();

        System.out.print("Informe o preço do 3º produto: ");
        produto3 = leia.nextDouble();

        if (produto1 < produto2 && produto1 < produto3){
            System.out.println("Você deve comprar o 1º produto, com valor de " +produto1+ " reais.");

        }else if (produto2 < produto1 && produto2 < produto3){
            System.out.println("Você deve comprar o 2º produto, com valor de " +produto2+ " reais.");

        }else{
            System.out.println("Você deve comprar o 3º produto, com valor de " +produto3+ " reais.");
        }

    }
}
//EXERCÍCIO 1  - AULA 02
//
//Faça um algoritmo que pergunte o preço de três produtos e informe qual produto você deve comprar,
// sabendo que a decisão é sempre o mais barato.