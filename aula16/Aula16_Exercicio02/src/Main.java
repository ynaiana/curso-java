public class Main {
    public static void main(String[] args) {

        SaboneteLiquido sabonete = new SaboneteLiquido("001", "Sabonete Líquido", 1.99, 5, "Ressecada");

        Geladeira geladeira = new Geladeira("002", "Geladeira", 3.000,"Brastemp", 300);

        CarneFrango carneFrango = new CarneFrango("003", "Carne de Frango", 16.00, "01/01/24", 1.1);

        System.out.println(sabonete);
        System.out.println(geladeira);
        System.out.println(carneFrango);
    }
}