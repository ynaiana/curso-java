public class Endereco {

    private String rua;
    private int numero;

    public Endereco() {
    }

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return "... Endereco ... \n" +
                "Rua: " + this.rua + "\n" +
                "Número: " + this.numero + "\n";
    }
}
