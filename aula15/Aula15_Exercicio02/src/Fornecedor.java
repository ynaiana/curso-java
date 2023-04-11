public class Fornecedor {

    private String cnpj;
    private String razaoSocial;
    private String telefone;
    private Endereco endereco;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String razaoSocial, String telefone, Endereco endereco) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "-- Fornecedor -- \n" +
                "CNPJ: " + this.cnpj + "\n"+
                "Razão Social: " + this.razaoSocial + "\n"+
                "Telefone: " + this.telefone + "\n"+
                this.endereco + "\n";
    }
}
