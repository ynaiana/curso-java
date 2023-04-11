public abstract class Veiculo {

    private String placa;
    private int ano;
    private String cor;
    private Double preco;
    private Proprietario proprietario;

    public Veiculo(String placa, int ano, String cor, Double preco, Proprietario proprietario) {
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Proprietario getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public abstract Double ipva();

    public abstract Double seguro();

    public abstract String toString();
}
