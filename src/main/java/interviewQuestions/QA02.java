package interviewQuestions;

import java.util.Scanner;

public class QA02 {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan
     *  alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir String ifade giriniz");
        String str= scan.nextLine();

        System.out.println("Lutfen bir sayı giriniz");
        int sayı=scan.nextInt();

        ilkHarSonHarf(str,sayı);
        System.out.println(ilkHarSonHarf(str, sayı));


    }

    private static String ilkHarSonHarf(String str, int sayı) {
        String input=str.substring(0,1)+str.substring(str.length()-1);
        String sonuc="";

        for (int i = 1; i <=sayı ; i++) {
            sonuc+=input;


        }
        return sonuc;

    }
}
