public class Cliente {

    private String cpf;
    private String nome;
    private int idade;
    private Endereco endereco;
    private Produto produto;

    public Cliente() {
    }

    public Cliente(String cpf, String nome, int idade, Endereco endereco, Produto produto) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.produto = produto;
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

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String toString() {
        return "-- Cliente -- \n" +
                "CPF: " + this.cpf + "\n"+
                "Nome: " + this.nome + "\n"+
                "Idade: " + this.idade + "\n"+
                this.endereco + "\n"+
                this.produto + "\n";
    }
}
