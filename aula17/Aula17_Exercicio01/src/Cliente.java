public class Cliente extends Pessoa{

    private int idade;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, int idade) {
        super(nome, endereco);
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
