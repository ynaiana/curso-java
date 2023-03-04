public class Aula03 {

    public static void main(String[] args) {

        System.out.println("------------    FOR    ----------------");
        for (int i = 100; i >= 0; i--){
            System.out.println(i);
        }

        System.out.println("------------    WHILE    ----------------");
        int i = 100;
        while (i >= 0){
            System.out.println(i);
            i--;
        }

        System.out.println("------------    DO WHILE    ----------------");
        int j = 100;
        do {
            System.out.println(j);
            j--;
        }while (j >= 0);
    }
}
