public class Endereco {

    private String rua;
    private String numero;
    private Cep cep;

    public Endereco() {
    }

    public Endereco(String rua, String numero, Cep cep) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cep getCep() {
        return this.cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public String toString() {
        return "-- Endereço -- \n" +
                "Rua: " + this.rua + "\n"+
                "Número: " + this.numero + "\n"+
                this.cep + "\n";
    }
}
