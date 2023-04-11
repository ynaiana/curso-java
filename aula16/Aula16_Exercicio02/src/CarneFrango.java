public class CarneFrango extends Produto{

    private String dataValidade;
    private Double peso;

    public CarneFrango() {
    }

    public CarneFrango(String codBarra, String nome, Double preco, String dataValidade, Double peso) {
        super(codBarra, nome, preco);
        this.dataValidade = dataValidade;
        this.peso = peso;
    }

    public String getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String toString() {
        return "-- PRODUTO -- \n" +
                "Nome: " + this.getNome() + "\n" +
                "Código: " + this.getCodBarra() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Data de validade: " + this.dataValidade + "\n" +
                "Peso: " + this.peso + "\n";
    }
}
