public class Roda {

    private int tamanhoAro;

    public Roda() {

    }

    public Roda(int tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }

    public int getTamanhoAro() {
        return this.tamanhoAro;
    }

    public void setTamanhoAro(int tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }

    @Override
    public String toString() {
        return "Tamanho do Aro: " +this.tamanhoAro+ "\n";
    }
}
