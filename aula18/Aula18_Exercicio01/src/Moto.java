public class Moto extends Veiculo{

    private int cilindrada;

    public Moto(String placa, int ano, String cor, Double preco, Proprietario proprietario, int cilindrada) {
        super(placa, ano, cor, preco, proprietario);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public Double ipva() {
        return 0.08 * this.getPreco();
    }

    @Override
    public Double seguro() {
        return 0.05 * this.getPreco();
    }

    @Override
    public String toString() {
        return "==== MOTO ==== \n" +
                "Placa: " + this.getPlaca() + "\n" +
                "Ano: " + this.getAno() + "\n"+
                "Cor: " + this.getCor() + "\n"+
                "Preço: " + this.getPreco() + "\n"+
                "Cilindrada: " + this.cilindrada + "\n"+
                "IPVA: " + this.ipva() + "\n"+
                "Seguro: " + this.seguro() + "\n"+
                this.getProprietario();
    }
}
