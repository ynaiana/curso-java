public class Fornecedor extends Pessoa{

    private String cnpj;
    private String pais;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String endereco, String cnpj, String pais) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.pais = pais;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String toString() {
        return "-- Fornecedor -- \n"+
                "Nome: " +this.getNome()+ "\n"+
                "Endereço: " +this.getEndereco()+ "\n"+
                "CNPJ: " +this.cnpj+ "\n"+
                "País: " +this.pais+ "\n";
    }
}
