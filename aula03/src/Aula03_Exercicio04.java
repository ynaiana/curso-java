import java.util.Scanner;

public class Aula03_Exercicio04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int opcao = 0;
        int numero = 0;
        int somaNumerosPares = 0;
        int multiNumerosImpares = 1;

        System.out.println("Quantidade de números que deseja informar: ");
        opcao = leia.nextInt();

        for (int i = 1; i <= opcao; i++){
            System.out.print("Informe o " +i+ "º número: ");
            numero = leia.nextInt();

            if (numero %2 == 0){
                somaNumerosPares = somaNumerosPares + numero;

            } else {
                multiNumerosImpares = multiNumerosImpares * numero;
            }
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Soma dos números pares: " +somaNumerosPares);
        System.out.println("Multiplicação dos números ímpares: " +multiNumerosImpares);
        System.out.println("-------------------------------------------------");
    }
}
//AULA 03 - EXERCÍCIO 04
//
//Crie um algoritmo que o usuário entre com vários números inteiros e positivos e imprima o produto dos números
//ímpares e a soma dos números pares.