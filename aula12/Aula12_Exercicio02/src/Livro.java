public class Livro {

    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    public Livro(String titulo){
        this.titulo = titulo;
    }

    public Livro(String titulo, int qtdPaginas, int paginasLidas){
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPaginas() {
        return this.qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return this.paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public void verificarProgresso(){
        int porcentagem = 0;
        porcentagem = this.paginasLidas * 100 / qtdPaginas;
        System.out.println("Você já leu " +porcentagem+ " % do livro");
    }
}
