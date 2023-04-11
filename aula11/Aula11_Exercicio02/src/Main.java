public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta();

        conta1.cadastrarConta("Gabriel", "1234", 300.0);

        conta1.apresentarConta();

        System.out.println();
        System.out.println(conta1.depositar(30.0));
        System.out.println(conta1.sacar(25.0));
        System.out.println();

        conta1.apresentarConta();
    }
}
//AULA 11 - EXERCÍCIO 02
//
//Crie uma classe "Conta" com atributos como número da conta, saldo e titular. Crie métodos para obter e definir
// esses atributos, bem como métodos para depositar e sacar dinheiro.