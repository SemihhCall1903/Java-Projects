public class RecapDemo1 {

    public static void main(String[] args) {
        int sayi1 = 20, sayi2 = 19, sayi3 = 31, enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        } else if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println("En Büyük Sayı : " + enBuyuk);
    }

}