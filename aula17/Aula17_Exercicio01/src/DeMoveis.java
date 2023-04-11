public class DeMoveis extends Vendedor{

    private String nomeLoja;
    private String nomeSetor;
    private Double comissao;

    public DeMoveis() {
    }

    public DeMoveis(String nome, String endereco, int matr, Double salario, String nomeLoja, String nomeSetor, Double comissao) {
        super(nome, endereco, matr, salario);
        this.nomeLoja = nomeLoja;
        this.nomeSetor = nomeSetor;
        this.comissao = comissao;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getNomeSetor() {
        return this.nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public Double getComissao() {
        return this.comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public String toString() {
        return "-- Vendedor de Móveis -- \n"+
                "Nome: " +this.getNome()+ "\n"+
                "Endereço: " +this.getEndereco()+ "\n"+
                "Matrícula: " +this.getMatr()+ "\n"+
                "Salário: " +this.getSalario()+ "\n"+
                "Nome da loja: " +this.nomeLoja+ "\n"+
                "Nome do setor: " +this.nomeSetor+ "\n"+
                "Comissão: " +this.comissao+ "\n";
    }
}
