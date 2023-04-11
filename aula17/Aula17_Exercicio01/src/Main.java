public class Main {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("José", "Rua Terra casa 01", "123456789", "Brasil");

        DeMoveis deMoveis = new DeMoveis("Antônio", "Rua Sol casa 02", 0005, 1300.00,"Paraíso Móveis", "Cozinha", 50.0);

        DeVeiculos deVeiculos = new DeVeiculos("Maria", "Rua Lua casa 03", 0006, 1450.00, 10);

        PessoaFisica pessoaFisica = new PessoaFisica("Ana", "Rua Marte casa 04", 56, "223344556");

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Ana", "Rua Marte casa 04", 56, "556677998");


        System.out.println(fornecedor);
        System.out.println(deMoveis);
        System.out.println(deVeiculos);
        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);
    }
}