import java.util.ArrayList;
import java.util.Scanner;

public class Aula09_Atividade03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdNumeros = 5;
        int numerosInformados = 0;
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        ArrayList<Integer> listaNumerosInvertidos = new ArrayList<Integer>();

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Informe o" +(i+1)+ "º número: ");
            numerosInformados = leia.nextInt();
            listaNumeros.add(numerosInformados);
        }

        for (int i = qtdNumeros; i > 0; i++){
            listaNumerosInvertidos[i] = numerosInformados[i];
        }

    }
}
//AULA 09 - ATIVIDADE 03
//
//Receber 15 números em um array e inverter a ordem dos elementos armazenando em outro ArrayList.