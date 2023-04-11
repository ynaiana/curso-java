public class Roda {

    private int aro;
    private int qtdParafusos;

    public Roda(){
    }

    public Roda(int aro, int qtdParafusos){
        this.aro = aro;
        this.qtdParafusos = qtdParafusos;
    }

    public int getAro(){
        return this.aro;
    }

    public void setAro(int aro){
        this.aro = aro;
    }

    public int getQtdParafusos(){
        return this.qtdParafusos;
    }

    public void setQtdParafusos(int qtdParafusos){
        this.qtdParafusos = qtdParafusos;
    }
}
