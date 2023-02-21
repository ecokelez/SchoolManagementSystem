package interviewQuestions;

import java.util.Scanner;

public class QA06 {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
            numbers(4 digit-> exclusive)
         Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
        toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        Method create ediniz,parametre olarak sayı alın,
        sayıları küp toplamı conteiner ataması yap,
        girilen conteiner,
        if icersinde kontrol et,
        % kullanınız ->basamaktakı sayı bos variable olusrtur,

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayı=scan.nextInt();
        armstrongSayı(sayı);

        girilenSayıyaKadarOlanArmstrongSayılar(sayı);




    }

    private static void girilenSayıyaKadarOlanArmstrongSayılar(int sayı) {
        for (int i = 1; i <sayı ; i++) {
           armstrongSayı(i);
        }
    }

    private static void armstrongSayı(int sayı) {

        int sayıKuplerToplamı=0;
        int basamaktakiSayı=0;
        int girilenSayı=sayı;

        while (sayı>0){

            basamaktakiSayı=sayı%10;
            sayıKuplerToplamı+=(basamaktakiSayı*basamaktakiSayı*basamaktakiSayı);
            sayı/=10;


        }
        if (girilenSayı==sayıKuplerToplamı){
            System.out.println("Girilen sayı armstrong sayıdır :" + girilenSayı);
        }else System.out.println("Girilen sayı armstrong sayı degildir :" + girilenSayı);

    }

}
