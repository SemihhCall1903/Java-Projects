public class MultiDimensionalArrayDemo {

    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Edirne";
        sehirler[0][2] = "Yalova";
        sehirler[1][0] = "Samsun";
        sehirler[1][1] = "Sinop";
        sehirler[1][2] = "Rize";
        sehirler[2][0] = "Kırıkkale";
        sehirler[2][1] = "Ankara";
        sehirler[2][2] = "Yozgat";

        for (int i = 0; i <= 2; i++) {
            System.out.println("--------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}