public class Livro {

    private String titulo;
    private int numeroPaginas;
    private Edicao edicao;

    public Livro() {
    }

    public Livro(String titulo, int numeroPaginas, Edicao edicao) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Edicao getEdicao() {
        return this.edicao;
    }

    public void setEdicao(Edicao edicao) {
        this.edicao = edicao;
    }

    public String toString() {
        return "::: Livro ::: \n" +
                "Título: " + this.titulo + "\n"+
                "Número de páginas: " + this.numeroPaginas + "\n"+
                this.edicao+ "\n";
    }
}
