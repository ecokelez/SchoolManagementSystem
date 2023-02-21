package coreJava_Questions;

import java.util.Scanner;

public class C03_DoWhileLoop {
   /*
    Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
    islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
    ve “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
    yanlislikla kac negative sayi girdigini ve
    girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
      */
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);


       int num = 0;
       int quantPosNum = 0;
       int quantNegNum = 0;
       int sumPosNum = 0;

       do {
           System.out.println("Please enter positive numbers to add up");
           num = scan.nextInt();

           if (num<0){
               System.out.println("You cannot enter negative numbers");
               quantNegNum++;
           } else if (num>0) {
             sumPosNum += num;
             quantPosNum++;
           }
       } while (num != 0);

       System.out.println(quantPosNum + "you entered positive quantity number, sum : " + sumPosNum);
       System.out.println(quantNegNum + " you entered quantity number,negative numbers are not included in the sum");

   }


}
