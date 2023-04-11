public class Pessoa {

    private String codigo;
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(){
    }

    public Pessoa(String codigo, String nome, int idade, Endereco endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString(){
        return "--- PESSOA --- \n"+
                "Código: " +this.codigo+ "\n"+
                "Nome: " +this.nome+ "\n"+
                "Idade: " +this.idade+ "\n"+
                this.endereco+ "\n";
    }
}
