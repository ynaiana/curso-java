public class Motor {

    private Double potencia;
    private String tipoCombustivel;

    public Motor(){
    }

    public Motor(Double potencia, String tipoCombustivel){
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Double getPotencia(){
        return this.potencia;
    }

    public void setPotencia(Double potencia){
        this.potencia = potencia;
    }

    public String getTipoCombustivel(){
        return this.tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
}
