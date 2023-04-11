public class Aula03_Exercicio05 {
    public static void main(String[] args) {

        double alturaChico = 1.50;
        double alturaJuca = 1.10;
        int qtdAnos = 0;

        do {
            alturaChico = alturaChico + 0.02;
            alturaJuca = alturaJuca + 0.03;
            qtdAnos++;

        }while (alturaChico > alturaJuca);

        System.out.println("Em " +qtdAnos+ " anos Juca será mais alto do que Chico.");
    }
}
//AULA 03 - EXERCÍCIO 04
//
//Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem 1,10m e cresce 3 centímetros por ano.
//Construir um algoritmo que calcule e imprima quantos anos serão necessários para que Juca seja maior que Chico.