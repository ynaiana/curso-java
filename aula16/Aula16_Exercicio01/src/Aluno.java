public class Aluno extends Pessoa{

    private String curso;

    public Aluno() {
    }

    public Aluno(String codigo, String nome, int idade, String curso) {
        super(codigo, nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "-- Aluno -- \n"+
                "Nome: " +this.getNome()+ "\n"+
                "Código: " +this.getCodigo()+ "\n"+
                "Idade: " +this.getIdade()+ "\n"+
                "Curso: " +this.curso+ "\n";

    }
}
