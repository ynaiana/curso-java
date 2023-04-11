import java.util.Scanner;

public class Aula04_Atividade05 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int opcaoElevador = 0;
        int elevadorA = 0, elevadorB = 0, elevadorC = 0;

        for(int i = 1; i <= 50; i++){
            System.out.println("Informe o elevador que você mais utiliza: ");
            System.out.println("1. Elevador A");
            System.out.println("2. Elevador B");
            System.out.println("3. Elevador C");
            opcaoElevador = leia.nextInt();

            switch (opcaoElevador){
                case 1: {
                    elevadorA++;
                    break;

                } case 2:{
                    elevadorB++;
                    break;

                } case 3:{
                    elevadorC++;
                    break;

                } default:{
                    System.out.println("Opção inválida!");
                }
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("O total de pessoas que utilizam mais o elevador A é: " +elevadorA);
        System.out.println("O total de pessoas que utilizam mais o elevador B é: " +elevadorB);
        System.out.println("O total de pessoas que utilizam mais o elevador C é: " +elevadorC);
        System.out.println("--------------------------------------------------------");
    }
}
//AULA 04 - ATIVIDADE 05
//
//Uso de elevadores em um prédio!
//Em um prédio com 50 moradores há três elevadores denominados A, B e C. Para otimizar o sistema de controle dos
// elevadores, desenvolva um programa em que cada morador informa qual o elevador que utiliza com mais
// frequência (A, B ou C). O programa deve contabilizar o total de pessoas que usa cada um dos elevadores
// e mostrar estes totais no final.