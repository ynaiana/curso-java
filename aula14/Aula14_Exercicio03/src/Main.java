public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Onix",
                new Motor(17.0, "teste"), 15);

        System.out.println(carro);
    }
}