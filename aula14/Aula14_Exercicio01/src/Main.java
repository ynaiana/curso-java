public class Main {
    public static void main(String[] args) {

        Filiacao filiacaoPet = new Filiacao("Scooby","Mel");
        Filiacao filiacaoProprietario = new Filiacao("fulano","fulana");
        Proprietario proprietario = new Proprietario("Ynaiana", "rua amadora", filiacaoProprietario);
        Cachorro cachorro = new Cachorro("Aurora", "1234", "Vira-Salsicha", filiacaoPet, proprietario);


        System.out.println(cachorro);
    }
}