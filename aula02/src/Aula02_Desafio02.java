import java.util.Scanner;

public class Aula02_Desafio02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double salarioAtual = 0, salarioComReajuste = 0, valorReajuste = 0, porcentagem = 0;

        System.out.println("Informe o seu salário: ");
        salarioAtual = leia.nextDouble();

        if (salarioAtual <= 280.00){
            porcentagem = 20;
            valorReajuste = (salarioAtual * 20) / 100;
            salarioComReajuste = salarioAtual + valorReajuste;

        } else if (salarioAtual >= 280.00 && salarioAtual <= 700.00) {
            porcentagem = 15;
            valorReajuste = (salarioAtual * 15) / 100;
            salarioComReajuste = salarioAtual + valorReajuste;

        }else if (salarioAtual >= 700.00 && salarioAtual <= 1500.00) {
            porcentagem = 10;
            valorReajuste = (salarioAtual * 10) / 100;
            salarioComReajuste = salarioAtual + valorReajuste;

        }else {
            porcentagem = 5;
            valorReajuste = (salarioAtual * 5) / 100;
            salarioComReajuste = salarioAtual + valorReajuste;
        }

        System.out.println("Salário antes do reajuste: " +salarioAtual+ " reais");
        System.out.println("Percentual de aumento aplicado: " +porcentagem+ "%");
        System.out.println("Valor do aumento: " +valorReajuste+ " reais");
        System.out.println("Salário depois do reajuste: " +salarioComReajuste+ " reais");
    }
}
//AULA 02 - DESAFIO 02
//
//a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério,
// baseado no salário atual;
//b. Salários até R$ 280,00 (incluindo): aumento de 20%;
//c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
//d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
//e. Salários de R$ 1500,00 em diante: aumento de 5%
//
//Após o aumento ser realizado; informe na tela;
//
//a. O salário antes do reajuste;
//b. O percentual de aumento aplicado;
//c. O valor do aumento;
//d. O novo salário, após o aumento.
