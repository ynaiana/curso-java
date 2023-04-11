public class Main {
    public static void main(String[] args) {


        DePasseio dePasseio = new DePasseio("ggg123", 2022, "Branco", 40000.0,
                new Proprietario("01201201233", "Antônia",
                        new Endereco("Amadora", "34")),
                "Chevrolet", "Carro de passeio",
                new Montadora("12312312344", "Montadora Real",
                        new Endereco("Asa Norte", "712")));

        Onibus onibus = new Onibus("fff456", 2021, "Azul", 100000.0,
                new Proprietario("01401401455", "Leôncio",
                        new Endereco("Camarões", "17")),
                30,
                new Montadora("12312312344", "Montadora Real",
                        new Endereco("Asa Norte", "712")));

        Moto moto = new Moto("abc777", 2023, "Vermelho", 15000.0,
                new Proprietario("01501501566", "Cléia",
                        new Endereco("Asa Sul", "702")),
                350);

        System.out.println(dePasseio);
        System.out.println(onibus);
        System.out.println(moto);
    }
}