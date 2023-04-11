public class Endereco {

    private String cidade;
    private String bairro;
    private String cep;

    public Endereco() {

    }

    public Endereco(String cidade, String bairro, String cep) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return this.bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String toString(){
        return "--- Endereco --- \n"+
                "Cidade: " +this.cidade+ "\n"+
                "Bairro: " +this.bairro+ "\n"+
                "Cep: " +this.cep+ "\n";
    }
}
