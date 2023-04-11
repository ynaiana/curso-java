import java.util.ArrayList;
import java.util.Scanner;

public class Aula09_Atividade01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valorInformado = 0;
        double somaNotas = 0, mediaNotas = 0;
        ArrayList<Double> listaNotas = new ArrayList<Double>();

        for (int i = 0; i < 15; i++){
            System.out.println("Informe a " +(i+1)+ "ª nota: ");
            valorInformado = leia.nextDouble();
            listaNotas.add(valorInformado);
        }

        for (int i = 0; i < 15; i++){
            somaNotas = somaNotas + listaNotas.get(i);
        }

        mediaNotas = somaNotas / listaNotas.size();

        System.out.println("A média geral da nota dos alunos é: " +mediaNotas);
    }
}
//AULA 05 - ATIVIDADE 01
//
// Faça um programa para ler a nota da prova de 15 alunos e armazene num ArrayList, calcule e imprima a
// media geral.