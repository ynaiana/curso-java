public class Produto {

    private String codBarra;
    private String nome;
    private Double preco;

    public Produto(){
    }

    public Produto(String codBarra, String nome, Double preco) {
        this.codBarra = codBarra;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodBarra() {
        return this.codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
