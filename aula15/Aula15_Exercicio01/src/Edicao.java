public class Edicao {

    private int numero;
    private int ano;
    private Patrocinador patrocinador;

    public Edicao() {
    }

    public Edicao(int numero, int ano, Patrocinador patrocinador) {
        this.numero = numero;
        this.ano = ano;
        this.patrocinador = patrocinador;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Patrocinador getPatrocinador() {
        return this.patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String toString() {
        return "... Edição ... \n" +
                "Número: " + this.numero + "\n"+
                "Ano: " + this.ano + "\n"+
                this.patrocinador+ "\n";
    }
}
