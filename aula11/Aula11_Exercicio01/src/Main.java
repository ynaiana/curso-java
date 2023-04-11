public class Main {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();

        veiculo1.cadastrarVeiculo("Amarelo", "CrossFox", "Volkswagen","Automático", 1.6, 4);

        veiculo1.apresentarInformacoes();
        System.out.println();
        System.out.println("Potência: "+veiculo1.buscarPotencia());
    }
}
//EXERCÍCIO 1 - AULA 11
//
//Crie uma classe Veiculo que tenha os seguintes atributos:
//String cor;
//String tipoCambio;
//Double potencia
//Integer qtdPorta
//String modelo
//String marca
//
//e os seguintes métodos:
//void cadastrar(String cor, ...);
//void apresentarInformacoes();
//Double buscarPotencia();