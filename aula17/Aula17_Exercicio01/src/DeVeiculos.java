public class DeVeiculos extends Vendedor{

    private int qtdVendida;

    public DeVeiculos() {
    }

    public DeVeiculos(String nome, String endereco, int matr, Double salario, int qtdVendida) {
        super(nome, endereco, matr, salario);
        this.qtdVendida = qtdVendida;
    }

    public int getQtdVendida() {
        return this.qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    public String toString() {
        return "-- Vendedor de Veículos -- \n" +
                "Nome: " + this.getNome() + "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "Matrícula: " + this.getMatr() + "\n" +
                "Salário: " + this.getSalario() + "\n" +
                "Quantidade vendida: " +this.qtdVendida+ "\n";
    }
}
