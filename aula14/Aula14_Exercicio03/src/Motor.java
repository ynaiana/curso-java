public class Motor {

    private double potencia;
    private String tipoMotor;

    public Motor() {
    }

    public Motor(double potencia, String tipoMotor) {
        this.potencia = potencia;
        this.tipoMotor = tipoMotor;
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipoMotor() {
        return this.tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "Potência: " + this.potencia + "\n"+
                "Tipo motor: " + this.tipoMotor + "\n";
    }
}
