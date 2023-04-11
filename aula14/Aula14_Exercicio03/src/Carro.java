public class Carro {

    private String modelo;
    private Motor motor;
    private Roda rodaDianteira;
    private Roda rodaTraseira;

    public Carro() {

    }

    public Carro(String modelo, Motor motor, int tamanhoAro) {
        this.modelo = modelo;
        this.motor = motor;
        this.rodaDianteira = new Roda(tamanhoAro);
        this.rodaTraseira = new Roda(tamanhoAro);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda getRodaDianteira() {
        return this.rodaDianteira;
    }

    public void setRodaDianteira(Roda rodaDianteira) {
        this.rodaDianteira = rodaDianteira;
    }

    public Roda getRodaTraseira() {
        return this.rodaTraseira;
    }

    public void setRodaTraseira(Roda rodaTraseira) {
        this.rodaTraseira = rodaTraseira;
    }

    @Override
    public String toString() {
        return "== Carro == \n" +
                "Modelo: " + this.modelo + "\n" +
                "Motor: " + this.motor + "\n" +
                "Roda dianteira: " + this.rodaDianteira + "\n" +
                "Roda traseira: " + this.rodaTraseira+ "\n";
    }
}
