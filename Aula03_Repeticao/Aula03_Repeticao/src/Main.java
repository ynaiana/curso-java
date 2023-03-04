public class Main {
    public static void main(String[] args) {

        System.out.println("------------    FOR    ----------------");
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println("------------    WHILE    ----------------");
        int i = 0;
        while (i <= 100){
            System.out.println(i);
            i++;
        }

        System.out.println("------------    DO WHILE    ----------------");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }while (j <= 100);

    }
}