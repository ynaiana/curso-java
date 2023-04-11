import java.util.ArrayList;

public class Universidade {

    private String nome;
    private Endereco endereco;
    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public Universidade(){

    }

    public Universidade(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void addAluno(Aluno aluno){
        listaDeAlunos.add(aluno);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Aluno> getListaDeAlunos() {
        return this.listaDeAlunos;
    }

    public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public String toString(){
        return "--- UNIVERSIDADE --- \n"+
                "Nome: " +this.nome+ "\n"+
                this.endereco+ "\n"+
                this.listaDeAlunos+ "\n";
    }
}
