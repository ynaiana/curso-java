import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero1 = 0, numero2 = 0, numero3 = 0;
        int primeiro = 0, segundo = 0, terceiro = 0;

        System.out.println("Informe o primeiro número: ");
        numero1 = leia.nextInt();

        System.out.println("Informe o segundo número: ");
        numero2 = leia.nextInt();

        System.out.println("Informe o terceiro número: ");
        numero3 = leia.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3 && numero2 >= numero3){
            System.out.println("Os números informados foram: " +numero1+ ", " +numero2+ ", " +numero3);

        } else if (numero1 >= numero2 && numero1 >= numero3 && numero3 >= numero2) {
            System.out.println("Os números informados foram: " +numero1+ ", " +numero3+ ", " +numero2);

        }else if (numero2 >= numero1 && numero2 >= numero3 && numero1 >= numero3) {
            System.out.println("Os números informados foram: " +numero2+ ", " +numero1+ ", " +numero3);

        }else if (numero2 >= numero1 && numero2 >= numero3 && numero3 >= numero1) {
            System.out.println("Os números informados foram: " +numero2+ ", " +numero3+ ", " +numero1);

        }else if (numero3 >= numero1 && numero3 >= numero2 && numero1 >= numero2) {
            System.out.println("Os números informados foram: " +numero3+ ", " +numero1+ ", " +numero2);

        }else {
            System.out.println("Os números informados foram: " +numero3+ ", " +numero2+ ", " +numero1);
        }
    }
}
//EXERCÍCIO 02  - AULA 02
//
// Faça um algoritmo que leia três números e mostre-os em ordem decrescente.