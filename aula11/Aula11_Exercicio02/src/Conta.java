public class Conta {

    String titular;
    String numeroDaConta;
    Double saldo;

    public void cadastrarConta(String titular, String numeroDaConta, Double saldo){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public void apresentarConta(){
        System.out.println("--- INFORMAÇÕES DA CONTA ---");
        System.out.println("Titular: " +titular);
        System.out.println("Nº da conta: " +numeroDaConta);
        System.out.println("Saldo: " +saldo);
    }

    public Double depositar(Double qtdDeposito){
        return saldo += qtdDeposito;
    }

    public Double sacar(Double qtdSaque){
        return saldo -= qtdSaque;
    }
}