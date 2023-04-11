import java.util.Scanner;

public class Aula03_Exercicio03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade = 0, idadeMaisNova = 0;
        String nome = "", nomeMaisNova = "";

        for (int i = 1; i <= 3; i++){
            System.out.print("Informe o " +i+ "º nome: ");
            nome = leia.next();

            System.out.print("Informe a " +i+ "ª idade: ");
            idade = leia.nextInt();

            if (idade < idadeMaisNova || i == 1){
                idadeMaisNova = idade;
                nomeMaisNova = nome;
            }
        }
        System.out.println("A pessoa mais nova é: " +nomeMaisNova);
    }
}
//AULA 03 - EXERCÍCIO 03
//
//Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.