public class Main {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao(6, 2021, "Branco", "abc123", 4);

        Moto moto = new Moto(2, 2022, "Azul", "def456", 700.0);

        DeCarga deCarga = new DeCarga(4, 2023, "Preto", "ghi789", 4, "Fiat",
                600.00);

        DePasseio dePasseio = new DePasseio(4, 2023, "Prata", "jkl123", 4,
                "Chevrolet", 7);

        System.out.println(caminhao);
        System.out.println(moto);
        System.out.println(deCarga);
        System.out.println(dePasseio);
    }
}