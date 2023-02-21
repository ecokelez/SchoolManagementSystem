package interviewQuestions;

import java.util.Scanner;

public class QA04 {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        //bunu kart sifre kontrol de de kullabilirinisz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sifre="ersoy.1989";
        int girisSayısı=3;

        System.out.println("Lutfen bir sayı giriniz agey");

        while (true){
            System.out.println("sifre gir");
            String girilenSifre=scan.nextLine();

            if (sifre.equals(girilenSifre)){
                System.out.println("sifre basarılı dogru");
                break;
            }else {
                System.out.println("sifren yanlıs");
                girisSayısı--;
                System.out.println("kalan gırıs hakkın " + girisSayısı);
            }
            if (girisSayısı==0){
                System.out.println("Gırıs hakkınız kalmadı.. bloklandınız..");
                break;
            }
        }
    }
}
