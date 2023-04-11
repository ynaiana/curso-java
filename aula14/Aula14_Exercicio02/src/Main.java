public class Main {
    public static void main(String[] args) {

        Universidade universidade = new Universidade("UnB",
                new Endereco("Ceilândia", "Psul", "12345678"));

        Aluno aluno = new Aluno("Ynaiana", 17012,
                new Endereco("Taguatinga", "M Norte", "87654321"));

        universidade.addAluno(aluno);

        System.out.println(universidade);
    }
}