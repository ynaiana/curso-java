public class Aula04_Desafio01 {
    public static void main(String[] args) {

        int numeroAnterior = 0, numeroAtual = 1, proximoNumero = 0;
        int sequencia = 0;

        for (int i = 1; i <= 20; i++){

            proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;

            System.out.print(proximoNumero+ ", ");

        }
    }
}
//AULA 04 - DESAFIO 01
//
// Sequência de Fibonacci: crie um programa que gera a sequência de Fibonacci até um determinado número n,
// em que cada número é a soma dos dois anteriores (1, 1, 2, 3, 5, 8, 13, ...). O programa deve usar um
// laço de repetição para gerar a sequência.