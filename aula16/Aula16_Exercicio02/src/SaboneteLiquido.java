public class SaboneteLiquido extends Produto {

    private int quantidade;
    private String tipoPele;

    public SaboneteLiquido() {
    }

    public SaboneteLiquido(String codBarra, String nome, Double preco, int quantidade, String tipoPele) {
        super(codBarra, nome, preco);
        this.quantidade = quantidade;
        this.tipoPele = tipoPele;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoPele() {
        return this.tipoPele;
    }

    public void setTipoPele(String tipoPele) {
        this.tipoPele = tipoPele;
    }

    public String toString() {
        return "-- PRODUTO -- \n" +
                "Nome: " + this.getNome() + "\n" +
                "Código: " + this.getCodBarra() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Quantidade: " + this.quantidade + "\n" +
                "Tipo de Pele: " + this.tipoPele + "\n";
    }
}
