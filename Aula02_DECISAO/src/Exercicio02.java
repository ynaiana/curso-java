import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero1 = 0, numero2 = 0, numero3 = 0;
        int maiorNumero = 0;

        System.out.println("Informe o primeiro número: ");
        numero1 = leia.nextInt();

        System.out.println("Informe o segundo número");
        numero2 = leia.nextInt();

        System.out.println("Informe o terceiro número");
        numero3 = leia.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            maiorNumero = numero1;

        } else if (numero2 > numero1 && numero2 > numero3) {
            maiorNumero = numero2;

        } else {
            maiorNumero = numero3;
        }

        System.out.println("O maior número foi: " +maiorNumero);
    }
}
//EXERCÍCIO 02  - AULA 02
//2. Faça um algoritmo que receba três números inteiros e mostre o maior deles.
//(Considere que os números sempre serão diferentes)