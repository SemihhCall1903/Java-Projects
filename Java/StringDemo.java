public class StringDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        /*
         * String newMessage = mesaj.concat(" Evet dışarı çıkabilirim !");
         * System.out.println("Eleman sayısı : " + mesaj.length());
         * 
         * System.out.println("5. eleman : " + mesaj.charAt(4));
         * System.out.println(mesaj.concat(" Evet dışarı çıkabilirim !"));
         * System.out.println(mesaj);
         * 
         * System.out.println(newMessage);
         * System.out.println(mesaj.startsWith("B"));
         * System.out.println(mesaj.endsWith("."));
         * char[] characters = new char[10];
         * 
         * mesaj.getChars(0, 5, characters, 5);
         * mesaj.getChars(15, 20, characters, 0);
         * 
         * System.out.println(characters);
         * System.out.println(mesaj.indexOf('h'));
         * System.out.println(mesaj.lastIndexOf(""));
         */

        String mesajReplace = mesaj.replace(' ', '-');
        System.out.println(mesaj.substring(6, 20));
        System.out.println(mesajReplace);
    }
}
