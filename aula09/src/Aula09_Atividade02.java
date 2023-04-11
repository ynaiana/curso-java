import java.util.ArrayList;
import java.util.Scanner;

public class Aula09_Atividade02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 15;
        int vetor[] = new int[qtdNumeros];
        ArrayList<Integer> listaPares = new ArrayList<Integer>();
        ArrayList<Integer> listaImpares = new ArrayList<Integer>();

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o " +(i+1)+ "º número: ");
            vetor[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){

            if (vetor[i] % 2 == 0){
                listaPares.add(vetor[i]);

            } else {
                listaImpares.add(vetor[i]);
            }
        }

        System.out.println("-----------------------");
        System.out.println("Lista números pares: ");
        for (int i = 0; i < listaPares.size(); i++){
            System.out.println(listaPares.get(i));
        }

        System.out.println("-----------------------");
        System.out.println("Lista números impares: ");
        for (int i = 0; i < listaImpares.size(); i++){
            System.out.println(listaImpares.get(i));
        }
    }
}
//AULA 09 - ATIVIDADE 02
//
//Receber 15 numeros em um VETOR. Depois armazenar os valores impares em uma LISTA de numeros impares,
// e o pares e uma LISTA de numeros pares.