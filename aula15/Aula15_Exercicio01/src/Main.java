public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Bíblia", 3000,
                new Edicao(5, 1000,
                        new Patrocinador("Jesus",
                                new Endereco("Céu", 7),
                                new Editora("707","Jerusalém Celeste",
                                        new Endereco("Terra Prometida", 77)))));

        System.out.println(livro);
    }
}