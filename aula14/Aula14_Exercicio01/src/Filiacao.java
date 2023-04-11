public class Filiacao {

    private String nomeDoPai;
    private String nomeDaMae;

    public Filiacao() {

    }

    public Filiacao(String nomeDoPai, String nomeDaMae) {
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
    }

    public String getNomeDoPai() {
        return this.nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return this.nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    @Override
    public String toString() {
        return "---- Filiação ---- \n"+
                "Nome do pai: " +nomeDoPai+ "\n"+
                "Nome da mãe: " +nomeDaMae+ "\n";
    }
}
