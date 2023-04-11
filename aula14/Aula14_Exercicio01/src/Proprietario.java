public class Proprietario {

    private String nome;
    private String endereco;
    private Filiacao filiacao;

    public Proprietario() {

    }

    public Proprietario(String nome, String endereco, Filiacao filiacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.filiacao = filiacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Filiacao getFiliacao() {
        return this.filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    @Override
    public String toString() {
        return  "---- Proprietário ---- \n"+
                "Nome: " +nome+ "\n"+
                "Endereço: " +endereco+ "\n"+
                this.filiacao+ "\n";
    }
}
