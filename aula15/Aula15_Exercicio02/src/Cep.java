public class Cep {

    private String numero;

    public Cep() {
    }

    public Cep(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return "-- CEP -- \n" +
                "Número: " + this.numero + "\n";
    }
}
