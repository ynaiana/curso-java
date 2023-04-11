public class Main {
    public static void main(String[] args) {

        Livro pequenoPrincipe = new Livro("O Pequeno Príncipe");

        pequenoPrincipe.setQtdPaginas(98);

        System.out.println("O livro " +pequenoPrincipe.getTitulo()+ " possui " +pequenoPrincipe.getQtdPaginas()+
                " páginas.");

        pequenoPrincipe.setPaginasLidas(20);
        pequenoPrincipe.verificarProgresso();
        pequenoPrincipe.setPaginasLidas(50);
        pequenoPrincipe.verificarProgresso();

        System.out.println("---------------------------------------------");

        Livro meuLivro = new Livro("O Poder do Hábito", 303, 248);
        System.out.println("O livro " +meuLivro.getTitulo()+ " possui " +meuLivro.getQtdPaginas()+
                " páginas.");
        meuLivro.verificarProgresso();
    }
}