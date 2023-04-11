public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Professor professor1 = new Professor();

        aluno1.nome = "Ynaiana";
        aluno1.idade = 23;
        aluno1.matricula = "17012";

        aluno2.nome = "Raphael";
        aluno2.idade = 23;
        aluno2.matricula = "17013";

        professor1.nome = "Gabriel";
        professor1.disciplina = "Java";
        professor1.titulacao = "PHD";

        System.out.println("PROFESSOR 1");
        System.out.println("Nome: " +professor1.nome+ " Disciplina: " +professor1.disciplina+ " Titulação: "
                +professor1.titulacao);
        System.out.println();
        System.out.println("ALUNO 1");
        System.out.println("Nome: " +aluno1.nome+ " Idade: " +aluno1.idade+ " Matrícula: " +aluno1.matricula);
        System.out.println("ALUNO 2");
        System.out.println("Nome: " +aluno2.nome+ " Idade: " +aluno2.idade+ " Matrícula: " +aluno2.matricula);
    }
}
//AULA 10 - EXERCÍCIO 02
//Crie um programa que tenha:
//- uma classe "Aluno" com atributos nome, idade e matrícula.
//- uma classe "Professor" com atributos nome, disciplina e titulação.
//Crie 2 alunos e 1 professor e exiba as informações.