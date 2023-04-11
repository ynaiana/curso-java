public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("JFG3030", 2018,
                new Pessoa("17012", "Ynaiana", 23,
                        new Endereco("Amadora", 10)));

        System.out.println(veiculo);
    }
}