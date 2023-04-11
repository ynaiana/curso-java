import java.util.Scanner;

public class Aula03_Atividade01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade = 0;
        int valorPagar = 0;

        System.out.println("Informe a idade: ");
        idade = leia.nextInt();

        if(idade > 0 && idade <= 10){
            valorPagar = 30;

        } else if (idade > 10 && idade <= 29) {
            valorPagar = 60;

        } else if (idade > 29 && idade <= 45) {
            valorPagar = 120;

        } else if (idade > 45 && idade <= 59) {
            valorPagar = 150;

        } else if (idade > 59) {
            valorPagar = 300;

        }else {
            System.out.println("Idade inválida!");
        }

        if(valorPagar > 0) {
            System.out.println("A pessoa tem " + idade + " anos de idade e pagará " + valorPagar + " reais.");
        }
    }
}
//AULA 03 - ATIVIDADE 01
//
//Faça um algoritmo que receba a idade de 1 pessoa e mostre essa idade e também o valor
// que ela deverá pagar, segundo a seguinte tabela:
//
//Idade                      Valor
//Até 10 anos                | R$ 30,00
//Acima de 10 até 29 anos    | R$ 60,00
//Acima de 29 até 45 anos    | R$ 120,00
//Acima de 45 até 59 anos    | R$ 150,00
//Acima de 59 anos           | R$ 300,00