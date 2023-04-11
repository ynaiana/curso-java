public class Moto extends Veiculo{

    private Double cilindrada;

    public Moto() {
    }

    public Moto(int qtdRodas, int ano, String cor, String placa, Double cilindrada) {
        super(qtdRodas, ano, cor, placa);
        this.cilindrada = cilindrada;
    }

    public Double getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return "-- Moto -- \n"+
                "Quantidade de rodas: " +this.getQtdRodas()+ "\n"+
                "Ano: " +this.getAno()+ "\n"+
                "Cor: " +this.getCor()+ "\n"+
                "Placa: " +this.getPlaca()+ "\n"+
                "Cilindrada: " +this.cilindrada+ "\n";
    }
}
