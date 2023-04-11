public class Veiculo {

    private String placa;
    private int ano;
    private Pessoa proprietario;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano, Pessoa proprietario) {
        this.placa = placa;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public String toString() {
        return "------- VEÍCULO ------- \n"+
                "Placa: " +this.placa+ "\n"+
                "Ano: " +this.ano+ "\n"+
                this.proprietario+
                "----------------------"+ "\n";
    }
}
