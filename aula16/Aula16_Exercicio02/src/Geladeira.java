public class Geladeira extends Produto{

    private String marca;
    private int capacidadeLitros;

    public Geladeira() {

    }

    public Geladeira(String codBarra, String nome, Double preco, String marca, int capacidadeLitros) {
        super(codBarra, nome, preco);
        this.marca = marca;
        this.capacidadeLitros = capacidadeLitros;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeLitros() {
        return this.capacidadeLitros;
    }

    public void setCapacidadeLitros(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public String toString() {
        return "-- PRODUTO -- \n" +
                "Nome: " + this.getNome() + "\n" +
                "Código: " + this.getCodBarra() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Marca: " + this.marca + "\n" +
                "Capacidade de litros: " + this.capacidadeLitros + "\n";
    }
}
