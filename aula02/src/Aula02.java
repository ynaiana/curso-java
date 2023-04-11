import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade = 0;

        System.out.println("Informe a idade: ");
        idade = leia.nextInt();

        if (idade >= 18) {
            System.out.println("A pessoa é maior de idade!");
        } else {
            System.out.println("A pessoa é menor de idade!");
        }
    }
}