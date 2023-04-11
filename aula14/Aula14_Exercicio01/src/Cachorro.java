public class Cachorro {

    private String nome;
    private String codigo;
    private String raca;
    private Filiacao filiacao;
    private Proprietario proprietario;

    public Cachorro(){

    }

    public Cachorro(String nome, String codigo, String raca, Filiacao filiacao, Proprietario proprietario){
        this.nome = nome;
        this.codigo = codigo;
        this.raca = raca;
        this.filiacao = filiacao;
        this.proprietario = proprietario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Filiacao getFiliacao() {
        return this.filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public Proprietario getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String toString() {
        return "---- CACHORRO ---- \n"+
                "Nome: " +nome+ "\n"+
                "Código: " +codigo+ "\n"+
                "Raça: " +raca+ "\n"+
                this.filiacao+ "\n"+
                this.proprietario+ "\n";

    }
}
