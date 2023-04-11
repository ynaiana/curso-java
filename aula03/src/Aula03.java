public class Aula03 {
    public static void main(String[] args) {

        System.out.println("------------    FOR    ----------------");
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("------------    WHILE    ----------------");
        int i = 0;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println("------------    DO WHILE    ----------------");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }while (j <= 10);

        System.out.println("***************************************");

        System.out.println("------------    FOR    ----------------");
        for (int l = 10; l >= 0; l--){
            System.out.println(l);
        }

        System.out.println("------------    WHILE    ----------------");
        int l = 10;
        while (l >= 0){
            System.out.println(l);
            l--;
        }

        System.out.println("------------    DO WHILE    ----------------");
        int c = 10;
        do {
            System.out.println(c);
            c--;
        }while (c >= 0);
    }
}