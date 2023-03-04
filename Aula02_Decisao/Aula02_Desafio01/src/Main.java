import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valorDaHora = 0, horasTrabalhadas = 0;
        double salarioBruto = 0, salarioLiquido = 0;
        double descontos = 0, fgts = 0, impostoRenda = 0, inss = 0;

        System.out.println("Informe o valor da sua hora: ");
        valorDaHora = leia.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadas = leia.nextDouble();

        salarioBruto = valorDaHora * horasTrabalhadas;

        if (salarioBruto <= 900.00){
            impostoRenda = 0.0;

        }else if (salarioBruto <= 1500.00) {
            impostoRenda = (salarioBruto * 5) / 100;

        } else if (salarioBruto <= 2500.00) {
           impostoRenda = (salarioBruto * 10) / 100;

        } else {
           impostoRenda = (salarioBruto * 20) / 100;
       }

        fgts = (salarioBruto * 11) / 100;
        inss = (salarioBruto * 10) / 100;
        descontos = inss + impostoRenda + (salarioBruto * 0.03);
        salarioLiquido = salarioBruto - descontos;

        System.out.println("-------------------------------");
        System.out.println("Salário bruto: R$ " +salarioBruto);
        System.out.println("Imposto de renda: R$ " +impostoRenda);
        System.out.println("INSS: R$ " +inss);
        System.out.println("FGTS: R$ " +fgts);
        System.out.println("Total de descontos: R$ " +descontos);
        System.out.println("Salário líquido: R$ " +salarioLiquido);

    }
}
//DESAFIO 01  - AULA 02
//
//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda,
// que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11%
// do salário bruto, mas não é descontado (é a empresa que deposita.)
//
//O salário líquido corresponde ao salário bruto menos os descontos. O programa deverá pedir ao usuário o valor
// da sua hora e a quantidade de horas trabalhadas no mês.
//
//a. Desconto do IR;
//b. Salário Bruto ate R$900,00 (inclusive) – Isento;
//c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
//d. Salario bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
//e. Salário bruto acima de 2500 – Desconto de 20%.
//
//Imprima na tela as informações, dispostas conforme o exemplo abaixo, no exemplo valor da hora é 5 e a
// quantidade de horas é 220.
//
//Salário bruto (5 * 220): R$    1100,00
//( – ) IR (5%)          : R$      55,00
//( – ) INSS ( 10% )     : R$     110,00
//FGTS ( 11%)            : R$     121,00
//Total de descontos     : R$     165,00
//Salário Líquido        : R$     935,00