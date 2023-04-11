import java.util.Scanner;

public class Aula01_Exercicio05 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numeroDaConta = 0;
        double saldo = 0.0, saldoAtual = 0.0;
        double debito = 0.0, credito = 0.0;

        System.out.println("Informe o número da conta: ");
        numeroDaConta = leia.nextInt();

        System.out.println("Informe o saldo da conta: ");
        saldo = leia.nextDouble();

        System.out.println("Informe o débito: ");
        debito = leia.nextDouble();

        System.out.println("Informe o crédito: ");
        credito = leia.nextDouble();

        saldoAtual = saldo - debito + credito;

        System.out.println("O saldo atual da conta " +numeroDaConta+ " é de: " +saldoAtual+ " reais.");
    }
}
//AULA 01  - EXERCÍCIO 5
//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
//escrever o saldo atual (saldo atual = saldo - débito + crédito).