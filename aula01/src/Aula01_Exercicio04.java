import java.util.Scanner;

public class Aula01_Exercicio04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int horaInicio = 0;
        int horaFim = 0;
        int duracao = 0;

        System.out.println("Informe o horário de início do jogo: ");
        horaInicio = leia.nextInt();

        System.out.println("Informe o horário de fim do jogo: ");
        horaFim = leia.nextInt();

        duracao = horaFim - horaInicio;

        if (horaInicio > horaFim) {
            horaInicio = horaInicio - 24;
            duracao = horaFim - horaInicio;
        }

        System.out.println("O jogo durou " +duracao+ " horas.");
    }
}
//AULA 01  - EXERCÍCIO 4
//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.