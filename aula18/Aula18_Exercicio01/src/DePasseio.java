public class DePasseio extends Veiculo{


    private String marca;
    private String descricao;
    private Montadora montadora;

    public DePasseio(String placa, int ano, String cor, Double preco, Proprietario proprietario, String marca, String descricao, Montadora montadora) {
        super(placa, ano, cor, preco, proprietario);
        this.marca = marca;
        this.descricao = descricao;
        this.montadora = montadora;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Montadora getMontadora() {
        return this.montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    @Override
    public Double ipva() {
        return 0.03 * this.getPreco();
    }

    @Override
    public Double seguro() {
        return (1.5 / 100) * this.getPreco();
    }

    @Override
    public String toString() {
        return "==== CARRO DE PASSEIO ==== \n" +
                "Placa: " + this.getPlaca() + "\n" +
                "Ano: " + this.getAno() + "\n"+
                "Cor: " + this.getCor() + "\n"+
                "Preço: " + this.getPreco() + "\n"+
                "Marca: " + this.marca + "\n" +
                "Descrição: " + this.descricao + "\n" +
                "IPVA: " + this.ipva() + "\n"+
                "Seguro: " + this.seguro() + "\n"+
                this.montadora + "\n"+
                this.getProprietario();
    }
}
