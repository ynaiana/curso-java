public class PessoaFisica extends Cliente{

    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String endereco, int idade, String cpf) {
        super(nome, endereco, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "-- Cliente -> Pessoa Física -- \n"+
                "Nome: " +this.getNome()+ "\n"+
                "Endereço: " +this.getEndereco()+ "\n"+
                "Idade: " +this.getIdade()+ "\n"+
                "CPF: " +this.cpf+ "\n";
    }
}
