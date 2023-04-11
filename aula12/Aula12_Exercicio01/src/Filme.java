public class Filme {

    private String titulo;
    private int duracaoEmMinutos;

    public Filme(String titulo, int duracaoEmMinutos){
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos(){
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirDuracaoEmHoras(){
        int duracaoEmHoras = 0;
        int qtdMinutos = 0;
        duracaoEmHoras = this.duracaoEmMinutos /60;
        qtdMinutos = duracaoEmMinutos % 60;
        System.out.println("O filme " +titulo+ " possui " +duracaoEmHoras+ " horas e " +qtdMinutos+ " minutos.");
    }
}
