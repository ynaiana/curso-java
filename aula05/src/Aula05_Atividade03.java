import java.util.Scanner;

public class Aula05_Atividade03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 15, qtdPares = 0, qtdImpares = 0;
        int numeros[] = new int[qtdNumeros];
        int impares[] = new int[qtdNumeros];
        int pares[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o " +(i+1)+ "º número: ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){

            if (numeros[i] % 2 == 0){
                pares[qtdPares] = numeros[i];
                qtdPares++;

            }else{
                impares[qtdImpares] = numeros[i];
                qtdImpares++;
            }
        }

        System.out.println("-----------------");
        System.out.println("Números pares: ");
        for (int i = 0; i < qtdPares; i++) {
            System.out.println(pares[i]);
        }

        System.out.println("-----------------");
        System.out.println("Números impares: ");
        for (int i = 0; i < qtdImpares; i++) {
            System.out.println(impares[i]);
        }
    }
}
//AULA 05 - ATIVIDADE 03
//
//Receber 15 numeros em um vetor. Depois armazenar os valores impares em um vetor de numeros impares,
// e o pares e um vetor de numeros pares.