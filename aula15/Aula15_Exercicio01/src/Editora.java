public class Editora {

    private String codigo;
    private String nome;
    private Endereco endereco;

    public Editora() {
    }

    public Editora(String codigo, String nome, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
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

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "... Editora ... \n" +
                "Código: " + this.codigo + "\n" +
                "Nome: " + this.nome + "\n"+
                this.endereco+ "\n";
    }
}
