public class Caminhao extends Veiculo{

    private int qtdEixos;

    public Caminhao() {
    }

    public Caminhao(int qtdRodas, int ano, String cor, String placa, int qtdEixos) {
        super(qtdRodas, ano, cor, placa);
        this.qtdEixos = qtdEixos;
    }

    public int getQtdEixos() {
        return this.qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public String toString() {
        return "-- Caminhão -- \n"+
                "Quantidade de rodas: " +this.getQtdRodas()+ "\n"+
                "Ano: " +this.getAno()+ "\n"+
                "Cor: " +this.getCor()+ "\n"+
                "Placa: " +this.getPlaca()+ "\n"+
                "Quantidade de eixos: " +this.qtdEixos+ "\n";

    }

}
