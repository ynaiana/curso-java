public class Endereco {

    private String rua;
    private String numero;

    public Endereco() {
    }

    public Endereco(String rua, String numero) {
        this.rua = rua;
        this.numero = numero;
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

    @Override
    public String toString() {
        return "-- Endereço -- \n" +
                "Rua: " + this.rua + "\n" +
                "Número: " + this.numero + "\n";
    }
}
