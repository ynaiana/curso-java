public class Onibus extends Veiculo{

    private int qtdPassageiros;
    private Montadora montadora;

    public Onibus(String placa, int ano, String cor, Double preco, Proprietario proprietario, int qtdPassageiros, Montadora montadora) {
        super(placa, ano, cor, preco, proprietario);
        this.qtdPassageiros = qtdPassageiros;
        this.montadora = montadora;
    }

    public int getQtdPassageiros() {
        return this.qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public Montadora getMontadora() {
        return this.montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    @Override
    public Double ipva() {
        return 0.05 * this.getPreco();
    }

    @Override
    public Double seguro() {
        return (2.5 / 100) * this.getPreco();
    }

    @Override
    public String toString() {
        return "==== ÔNIBUS ==== \n" +
                "Placa: " + this.getPlaca() + "\n" +
                "Ano: " + this.getAno() + "\n"+
                "Cor: " + this.getCor() + "\n"+
                "Preço: " + this.getPreco() + "\n"+
                "Quantidade de passageiros: " + this.qtdPassageiros + "\n" +
                "IPVA: " + this.ipva() + "\n"+
                "Seguro: " + this.seguro() + "\n"+
                this.montadora + "\n" +
                this.getProprietario();
    }
}
