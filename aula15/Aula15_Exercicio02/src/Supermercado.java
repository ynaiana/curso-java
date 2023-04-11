public class Supermercado {

    private String cnpj;
    private String razaoSocial;
    private String telefone;
    private Endereco endereco;
    private Produto produto;
    private Cliente cliente;

    public Supermercado() {
    }

    public Supermercado(String cnpj, String razaoSocial, String telefone, Endereco endereco, Produto produto, Cliente cliente) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
        this.endereco = endereco;
        this.produto = produto;
        this.cliente = cliente;
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

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String toString() {
        return "---- SUPERMERCADO ---- \n" +
                "CNPJ: " + this.cnpj + "\n"+
                "Razão Social: " + this.razaoSocial + "\n"+
                "Telefone: " + this.telefone + "\n"+
                this.endereco + "\n"+
                this.produto + "\n"+
                this.cliente + "\n";
    }
}
