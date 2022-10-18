public class ReCapDemo2 {

    public static void main(String[] args) {
        double[] myList = { 3.1, 42.3, 4.2, 93.1 };
        double total = 0;
        double max = myList[0];
        for (double number : myList) {

            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println("Sayılar : " + number);
        }

        System.out.println("--------------------\nToplam : " + total);
        System.out.println("--------------------\nEn Büyük Sayı : " + max);
    }
}
