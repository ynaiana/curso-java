public class DePasseio extends Carro{

    private int qtdPassageiros;

    public DePasseio() {
    }

    public DePasseio(int qtdRodas, int ano, String cor, String placa, int qtdPortas, String marca, int qtdPassageiros) {
        super(qtdRodas, ano, cor, placa, qtdPortas, marca);
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdPassageiros() {
        return this.qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public String toString() {
        return "== Carro de Passeio == \n"+
                "Quantidade de rodas: " +this.getQtdRodas()+ "\n"+
                "Ano: " +this.getAno()+ "\n"+
                "Cor: " +this.getCor()+ "\n"+
                "Placa: " +this.getPlaca()+ "\n"+
                "Quantidade de portas: " +this.getQtdPortas()+ "\n"+
                "Marca: " +this.getMarca()+ "\n"+
                "Quantidade de passageiros: " +this.qtdPassageiros+ "\n";
    }
}
