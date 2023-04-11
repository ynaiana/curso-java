public class Aluno {

    private String nome;
    private int matricula;
    private Endereco endereco;


    public Aluno(String nome, int matricula, Endereco endereco){
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString(){
        return "--- ALUNO --- \n"+
                "Nome: " +this.nome+ "\n"+
                "Matrícula: " +this.matricula+ "\n"+
                this.endereco+ "\n";
    }
}
