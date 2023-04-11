public class Empregado extends Pessoa {

    private Double salario;

    public Empregado() {

    }

    public Empregado(String codigo, String nome, int idade, Double salario) {
        super(codigo, nome, idade);
        this.salario = salario;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "-- Empregado -- \n"+
                "Nome: " +this.getNome()+ "\n"+
                "Código: " +this.getCodigo()+ "\n"+
                "Idade: " +this.getIdade()+ "\n"+
                "Salário: " +this.salario+ "\n";
    }
}
