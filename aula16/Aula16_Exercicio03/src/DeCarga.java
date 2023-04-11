public class DeCarga extends Carro{

    private Double capacidade;

    public DeCarga() {
    }

    public DeCarga(int qtdRodas, int ano, String cor, String placa, int qtdPortas, String marca, Double capacidade) {
        super(qtdRodas, ano, cor, placa, qtdPortas, marca);
        this.capacidade = capacidade;
    }

    public Double getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public String toString() {
        return "== Carro de Carga == \n"+
                "Quantidade de rodas: " +this.getQtdRodas()+ "\n"+
                "Ano: " +this.getAno()+ "\n"+
                "Cor: " +this.getCor()+ "\n"+
                "Placa: " +this.getPlaca()+ "\n"+
                "Quantidade de portas: " +this.getQtdPortas()+ "\n"+
                "Marca: " +this.getMarca()+ "\n"+
                "Capacidade: " +this.capacidade+ "\n";
    }
}
