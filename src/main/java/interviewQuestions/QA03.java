package interviewQuestions;

import java.util.Scanner;

public class QA03 {
    /*
Ask user enter a positive number and check if it is prime or not
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını
kontrol edin

Kısaca asal sayılar sadece kendine ve 1'e bölünebilen pozitif tam sayılardır.
1 sayısı ise asal sayı değildir. Çünkü asal sayıların sadece 2 pozitif tam
 sayı böleni olmalıdır.
 1 ise sadece 1'e bölünebildiği için yalnız tek böleni bulunmaktadır.
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz agey");
        int sayı=scan.nextInt();


    boolean asalMı=true;

        if (sayı>1){

            for (int i = 2; i < sayı; i++) { // bolen sayılar
                    if (sayı%i==0){
                        asalMı=false;
                        //break;
                    }
            }
            if (asalMı) System.out.println("sayı asaldır kirve");
            else System.out.println("sayı asal degıl asal sayı gir gari");
        }else System.out.println("sayı asal degıl anliyin mu");
    }
}
