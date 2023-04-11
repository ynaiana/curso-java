public class Main {
    public static void main(String[] args) {

        Filme umFilmeQualquer = new Filme("Os vingadores", 142);

        umFilmeQualquer.exibirDuracaoEmHoras();

        Filme meuFilmeFavorito = new Filme("Enrolados", 90);

        meuFilmeFavorito.setDuracaoEmMinutos(100);

        meuFilmeFavorito.exibirDuracaoEmHoras();

        System.out.println("---- Flilmes no catálago ----");
        System.out.println("- " +umFilmeQualquer.getTitulo());
        System.out.println("- " +meuFilmeFavorito.getTitulo());

    }
}
//AULA 12 - EXERCÍCIO 01
// Atividade da duração de horas do filme