public class Veiculo {

    private String placa;
    private String cor;
    private Porta porta;
    private Motor motor;
    private Roda roda;

    public Veiculo(){
    }

    public Veiculo(String placa, String cor, Porta porta, Motor motor, Roda roda){
        this.placa = placa;
        this.cor = cor;
        this.porta = porta;
        this.motor = motor;
        this.roda = roda;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Porta getPorta() {
        return this.porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda getRoda() {
        return this.roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }
}
