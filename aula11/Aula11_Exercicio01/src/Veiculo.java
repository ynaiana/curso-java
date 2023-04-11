public class Veiculo {

    String cor;
    String modelo;
    String marca;
    String tipoCambio;
    Double potencia;
    Integer qtdPorta;

    public void cadastrarVeiculo(String cor, String modelo, String marca,String tipoCambio, Double potencia,
                                 Integer qtdPorta){
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.tipoCambio = tipoCambio;
        this.potencia = potencia;
        this.qtdPorta = qtdPorta;
    }

    public void apresentarInformacoes(){
        System.out.println("-----INFORMAÇÕES DO VEÍCULO-----");
        System.out.println("Cor: " +cor);
        System.out.println("Modelo: " +modelo);
        System.out.println("Marca: " +marca);
        System.out.println("Tipo de câmbio: " +tipoCambio);
        System.out.println("Potência: " +potencia);
        System.out.println("Quantidade de porta: " +qtdPorta);
    }

    public Double buscarPotencia(){
        return potencia;
    }
}