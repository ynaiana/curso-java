import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("-------- AGENDA --------");
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Mostrar agenda");
            System.out.println("5 - Mostrar pessoa");
            System.out.println("0 - Encerrar programa");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:{
                    System.out.println("Informe o nome, idade e altura da pessoa:");
                    agenda.armazenaPessoa(sc.next(), sc.nextInt(), sc.nextDouble());
                    System.out.println("Pessoa adicionada com sucesso!");
                    break;
                }
                case 2:{
                    System.out.println("Informe a pessoa que quer remover: ");
                    agenda.removePessoa(sc.next());
                    System.out.println("Pessoa removida com sucesso!");
                    break;
                }
                case 3:{
                    System.out.println("Informe a pessoa que deseja buscar: ");
                    int indicePessoa;
                    indicePessoa = agenda.buscaPessoa(sc.next());
                    if (indicePessoa != -1) {
                        System.out.println("O índice da pessoa é: "+indicePessoa);
                    }else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;
                }
                case 4:{
                    agenda.imprimeAgenda();
                    break;
                }
                case 5:{
                    System.out.println("Informe o índice da pessoa que deseja buscar:");
                    agenda.imprimePessoa(sc.nextInt());
                    break;
                }
                default:{
                    if (opcao == 0){
                        System.out.println("Programa encerrado!");

                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                }
            }
        }
    }
}
//AULA 11 - EXERCÍCIO 03
//
//Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
//seguintes operações:
//
//void armazenaPessoa(String nome, int idade, double altura);
//void removePessoa(String nome);
//int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
//void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
//void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
//agenda.