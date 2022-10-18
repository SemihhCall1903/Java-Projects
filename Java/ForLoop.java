public class ForLoop {

    public static void main(String[] args) {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("Döngü Bitti");

        int i = 2;

        while (i <= 10) {
            System.out.println(i);
            i += 2;

        }

        System.out.println("While Döngüsü Bitti.");

        int j = 1;

        do {
            j++;

            if (j % 2 == 0) {
                System.out.println(j);
            }
        } while (j <= 10);

        System.out.println("Do While Döngüsü Bitti");
    }
}