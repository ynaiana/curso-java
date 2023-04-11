import java.util.Objects;
import java.util.Scanner;

public class Aula08_Desafio01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int qtdAlunos = 0, qtdNotas = 0;
        int opcao = - 1;
        int mediaAprovacao = 6;

        System.out.print("Informe a quantidade de alunos que deseja lançar: ");
        qtdAlunos = leia.nextInt();

        System.out.print("Informe a quantidade de notas que deseja lançar: ");
        qtdNotas = leia.nextInt();

        double notas[][] = new double[qtdAlunos][qtdNotas];
        String nomeAluno[] = new String[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++){
            System.out.println("Informe o nome do " +(i+1)+ "º alune: ");
            nomeAluno[i] = leia.next();
        }

        for (int i = 0; i < qtdAlunos; i++){
            for (int j = 0; j < qtdNotas; j++){
                System.out.println("Informe a " +(j+1)+ "ª nota do alune " +nomeAluno[i]+ ": ");
                notas[i][j] = leia.nextDouble();
            }
        }

        double somaNotas[] = new double[qtdAlunos];
        for (int i = 0; i < qtdAlunos; i++){
            for (int j = 0; j < qtdNotas; j++){
                somaNotas[i] = somaNotas[i] + notas[i][j];
            }
        }

        while (opcao != 0) {

            System.out.println("----------------------------------------------------------------");
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - Listar todos os alunos");
            System.out.println("2 - Buscar as notas de um aluno e dizer se está aprovado ou não");
            System.out.println("3 - Apresentar a quantidade de alunos aprovados");
            System.out.println("4 - Apresentar a quantidade de alunos reprovados");
            System.out.println("5 - Corrigir a nota de um aluno");
            System.out.println("6 - Limpar a tela");
            System.out.println("0 - Encerrar o programa");
            System.out.println("----------------------------------------------------------------");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("...................");
                    for (int i = 0; i < qtdAlunos; i++) {
                        System.out.println(nomeAluno[i]);
                        for (int j = 0; j < qtdNotas; j++) {
                            System.out.print(" " + notas[i][j] + " ");
                        }
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println("...................");

                    break;
                }
                case 2: {
                    String alunoProcurado = "";
                    int indiceAlunoProcurado = -1;

                    System.out.println("Informe o nome do aluno a ser procurado: ");
                    alunoProcurado = leia.next();

                    for (int i = 0; i < qtdAlunos; i++) {
                        if (Objects.equals(alunoProcurado, nomeAluno[i])) {
                            indiceAlunoProcurado = i;
                        }
                    }

                    if (indiceAlunoProcurado != -1) {
                        System.out.println(".....................");
                        System.out.println("Notas do aluno: ");
                        for (int j = 0; j < qtdNotas; j++) {
                            System.out.print(" " + notas[indiceAlunoProcurado][j] + " ");
                        }
                        System.out.println();

                        System.out.println();
                        System.out.println("Situação do aluno: ");
                        boolean situacao = somaNotas[indiceAlunoProcurado] / qtdNotas >= mediaAprovacao;
                        if (situacao) {
                            System.out.println("Aprovado!");

                        } else {
                            System.out.println("Reprovado!");
                        }
                        System.out.println(".....................");

                    }else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                }
                case 3: {
                    int qtdAlunosAprovados = 0;

                    System.out.println("......................");
                    for (int i = 0; i < qtdAlunos; i++) {
                        if (somaNotas[i] / qtdNotas >= mediaAprovacao) {
                            qtdAlunosAprovados++;
                        }
                    }
                    System.out.println(qtdAlunosAprovados + " alunos foram aprovados.");
                    System.out.println("......................");
                    break;
                }
                case 4: {
                    int qtdAlunosReprovados = 0;

                    System.out.println("......................");
                    for (int i = 0; i < qtdAlunos; i++) {
                        if (somaNotas[i] / qtdNotas < mediaAprovacao) {
                            qtdAlunosReprovados++;
                        }
                    }
                    System.out.println(qtdAlunosReprovados + " alunos foram reprovados.");
                    System.out.println("......................");
                    break;
                }
                case 5: {
                    String alunoModificarNota = "";
                    int indiceAlunoModificarNota = -1;

                    System.out.println("Informe o nome do aluno que deseja mudar a nota: ");
                    alunoModificarNota = leia.next();

                    for (int i = 0; i < qtdAlunos; i++) {
                        if (Objects.equals(alunoModificarNota, nomeAluno[i])) {
                            indiceAlunoModificarNota = i;
                        }
                    }

                    if (indiceAlunoModificarNota != -1) {
                        for (int j = 0; j < qtdNotas; j++) {
                            System.out.println("Informe a " + (j + 1) + "ª nota  do aluno: ");
                            notas[indiceAlunoModificarNota][j] = leia.nextDouble();
                        }
                        System.out.println("Notas alteradas com sucesso!");

                        somaNotas = new double[qtdAlunos];

                        for (int i = 0; i < qtdAlunos; i++){
                            for (int j = 0; j < qtdNotas; j++){
                                somaNotas[i] = somaNotas[i] + notas[i][j];
                            }
                        }

                    }else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                }
                case 6: {
                    for (int i = 0; i < 19; i++) {
                        System.out.println();
                    }
                    break;
                }
            }
        }
        System.out.println("Programa encerrado!");
    }
}
//AULA 08 - DESAFIO 01

//Escreva um algoritmo que receba a quantidade de alunos (Linhas da matriz) e a quantidade de notas
// (Colunas da matriz será 4). E que também receba os nomes dos alunos (VETOR DE STRING).
//
//   Opcional: Pode receber ou deixar fixa a media mínima para aprovação (6 por exemplo).
//
// 1- Preencha todas as notas de todos os alunos E O NOME;
// 2- Permita que seja selecionada diferentes opções:
//      1 - Listar todos os alunos (NOME E AS NOTAS). (pode apresentar a opção 3 e 4 se quiserem também)
//      2 - Buscar as notas de um aluno e dizer se está aprovado ou não.
//      3 - Apresentar a quantidade de alunos aprovados.
//      4 - Apresentar a quantidade de alunos reprovados.
//      5 - Permitir a correção de uma nota de um aluno.
//      6 - Limpar a tela.
//      0 - Encerrar o programa.

//Mega desafio
//     9 - Organizar a matriz de forma crescente ou decrescente. Ou seja organizar a posição dos alunos de
//      menor média para a maior média e vice-versa.