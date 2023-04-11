public class Produto {

    private String codBarra;
    private String descricao;
    private Double preco;
    private Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(String codBarra, String descricao, Double preco, Fornecedor fornecedor) {
        this.codBarra = codBarra;
        this.descricao = descricao;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public String getCodBarra() {
        return this.codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String toString() {
        return "-- Produto -- \n" +
                "Código de barra: " + this.codBarra + "\n"+
                "Descrição: " + this.descricao + "\n"+
                "Preço: " + this.preco + "\n"+
                this.fornecedor + "\n";
    }
}
