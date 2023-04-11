import java.util.Scanner;

public class Aula04_Atividade02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero = 0;
        int maiorNumero = 0, menorNumero = 0;

        for (int i = 1; i <= 15; i++){
            System.out.print("Informe o " +i+ "º número: ");
            numero = leia.nextInt();

            if (numero > maiorNumero || i == 1){
                maiorNumero = numero;
            }

            if (numero < menorNumero || i == 1) {
                menorNumero = numero;
            }
        }
        System.out.println("Menor número: " +menorNumero);
        System.out.println("Maior número: " +maiorNumero);
    }
}
//AULA 04 - ATIVIDADE 02
//
//Escreva um programa em que lê 15 valores inteiros, encontra o maior e o menor deles e mostra o resultado.