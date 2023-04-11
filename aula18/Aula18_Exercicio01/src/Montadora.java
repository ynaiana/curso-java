public class Montadora {

    private String cnpj;
    private String nome;
    private Endereco endereco;

    public Montadora() {
    }

    public Montadora(String cnpj, String nome, Endereco endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        return "-- Montadora -- \n" +
                "CNPJ: " + this.cnpj + "\n" +
                "Nome: " + this.nome + "\n"+
                this.endereco + "\n";
    }
}
