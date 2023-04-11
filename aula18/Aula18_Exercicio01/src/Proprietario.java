public class Proprietario{

    private String cpf;
    private String nome;
    private Endereco endereco;

    public Proprietario() {
    }

    public Proprietario(String cpf, String nome, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        return "-- Proprietário -- \n" +
                "CPF: " + this.cpf + "\n" +
                "Nome: " + this.nome + "\n"+
                this.endereco + "\n";
    }
}
