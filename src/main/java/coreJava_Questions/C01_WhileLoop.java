package coreJava_Questions;

public class C01_WhileLoop {
      /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */



    public static void main(String[] args) {
        char firstLetter = 'a';
        char endLetter = 'h';

        char temp = firstLetter;  // Ilk  harf degerını korumak ıcın , bozmamak ıcın bu degerı olusturduk
        String enLarge = "";

        while (temp<=endLetter){
            enLarge =( temp + "").toUpperCase();     //char larda prımıtve data turu oldugu ıcın to UpperCase metodu olmaz
                                                    // String bır ıfadeyı char olarak kullanabıllmemız ıcın temp sonuna "" ekledık  ve paranteze aldık
            System.out.print(temp);
            temp+= 1;
        }
    }







}
