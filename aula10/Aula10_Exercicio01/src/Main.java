public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.nome = "Ynaiana";
        pessoa1.idade = 23;
        pessoa1.genero = 'F';

        pessoa2.nome = "Gabriel";
        pessoa2.idade = 24;
        pessoa2.genero = 'M';

        pessoa3.nome = "Gabrielly";
        pessoa3.idade = 18;
        pessoa3.genero = 'F';

        System.out.println("PESSOA 1");
        System.out.println("Nome: " +pessoa1.nome+ " Idade: " +pessoa1.idade+ " Gênero: " +pessoa1.genero);
        System.out.println();
        System.out.println("Pessoa 2");
        System.out.println("Nome: " +pessoa2.nome+ " Idade: " +pessoa2.idade+ " Gênero: " +pessoa2.genero);
        System.out.println();
        System.out.println("Pessoa 3");
        System.out.println("Nome: " +pessoa3.nome+ " Idade: " +pessoa3.idade+ " Gênero: " +pessoa3.genero);
    }
}
//AULA 10 - EXERCÍCIO 01;
//
//Crie um programa que receba o nome, idade, altura e gênero ('M'  e 'F') de uma pessoa. Faça utilizando
//classes, crie 3 pessoas diferentes. Receba os valores de cada uma e EXIBA na tela cada uma também.