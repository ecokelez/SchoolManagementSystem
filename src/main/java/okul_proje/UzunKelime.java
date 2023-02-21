package okul_proje;

import java.util.Scanner;

public class UzunKelime {
    public static void main(String[] args) {


        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         *
         * //ben bugun javayi daha cok sevdim ama cok zorlandim
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str=scan.nextLine();

        System.out.println("theLongestWord(str) = " + theLongestWord(str));


        // Arraylerde --> for each ya da fori ile calısmak bu tarz sorularda

    }

    public static String  theLongestWord(String str) {

        String arr[]=str.split(" ");

        int max=0;
        String longestWorld="";

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length() > max) {
                max=arr[i].length();   // max ilk calıs. kod max=3 oldu
                longestWorld=arr[i];
            }

        }




        return longestWorld;
    }


}
