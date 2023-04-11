public class Vendedor extends Pessoa{

    private int matr;
    private Double salario;

    public Vendedor() {
    }

    public Vendedor(String nome, String endereco, int matr, Double salario) {
        super(nome, endereco);
        this.matr = matr;
        this.salario = salario;
    }

    public int getMatr() {
        return this.matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
