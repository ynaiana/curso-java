import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int codigo = 0;

        System.out.println("Informe o código: ");
        codigo = leia.nextInt();

        if (codigo == 1){
            System.out.println("Alimento não-perecível");

        } else if (codigo == 2 || codigo == 3 || codigo == 4) {
            System.out.println("Alimento perecível");

        }else if (codigo == 5 || codigo == 6){
            System.out.println("Vestuário");

        } else if (codigo == 7) {
            System.out.println("Higiene pessoal");

        } else if (codigo == 8 || codigo == 9 || codigo == 10) {
            System.out.println("Utensílios domésticos");

        }else {
            System.out.println("Código inválido");
        }
    }
}
//EXERCÍCIO 03 - AULA 02
//3. DESAFIO: Construa um algoritmo que leia o código de um determinado produto e mostre a sua classificação.
//
//Código Classificação
//1 - Alimento não-perecível
//2, 3 ou 4 - Alimento perecível
//5 ou 6 - Vestuário
//7 - Higiene pessoal
//8, 9, 10 - Utensílios domésticos
//Qualquer outro código Inválido