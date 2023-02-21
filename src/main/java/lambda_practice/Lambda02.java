package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda02 {
    public static void main(String[] args) {

    }
    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));

    //TODO task tek lerin karesini buyukten kucuge
    public static void teklerinKareBuyuktenKucuge(List<Integer> sayi) {
        sayi.stream().
                filter(t->t%2!=0).
                map(t->t*t).
                sorted(Comparator.reverseOrder()).
                forEach(Methodlarım::aynıSatırdaBosluklaYazdır);

    }
    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfineGoreTersSırala(List<String>yemek){
        yemek.stream().distinct().
                sorted(Comparator.// sıralama aksiyonuna girildi
                        comparing(t->t.toString(). // her bir eleman string'e cevrildi
                        charAt(t.toString().length()-1)).// son karakter alındı
                        reversed()). // son harfe gore ters sıralama
                forEach(Methodlarım::aynıSatırdaBosluklaYazdır);  // yazdırldı
    }
    // TODO Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void karakterSayısı7ve7denAzOlanlarıYaz(List<String>yemek){
        // ilkel yöntem ile:
      /*   boolean kontrol=yemek.stream().allMatch(t->t.length()<=7);
         if (kontrol){
             System.out.println("List elemanları 7 ve daha az harften olusmus");
         }else System.out.println("Bazı elemanlar 7' den buyuk");

       */

        // modern yontem:

        System.out.println(yemek.stream(). // --> akısa alındı
                allMatch(t -> t.length() <= 7) ?  // 7 ve 7 den kucuk olma durumu kontrol edildi ve ternary ile sarta bakıldı
                "List elemanları 7 ve daha az harften olusmus" :  // true ise
                "Bazı elemanlar 7' den buyuk");                     // false ise

    }

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetikBuyukHarfTekrarsiz(List<String> yemek) {


    }
    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void strKarakterSayisiYazdir(List<String> yemek) {


    }
    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfeGoreTersSira(List<String> yemek) {
    }
    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz
    // buyukten kucuge sirali  print ediniz..
    public static void karakterCiftKareBuyuktenKucuge(List<String> yemek) {
    }
    // TODO Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void karakterSayiYedidenBuyuk(List<String> yemek) {
    }
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void basHarfiWIleBaslayan(List<String> yemek) {
    }

    // TODO Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.
    public static void xIleBitenEleman(List<String> yemek) {
    }


    // TODO Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karkterEnFazla(List<String> yemek) {
        //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
        // şekilde kesilmiş bir akış return eder. Stream return eder.

      // Stream<String> sonIsim= yemek.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(1);
       // System.out.println(Arrays.toString(sonIsim.toArray()));

        Stream<String> sonIsim=    // limit kullnadıgımız ıcın sonIsim objesini atadık
                yemek.stream().    // akısa alındı
                         sorted(Comparator.  // sortlamayı lenghtine gore yaptık
                                comparing(t->t.toString().length()).  // sortlamayı lenghtine gore yaptık
                                    reversed()).  //tersine cevirdik
                                        limit(1);  // limit ile ilk elemanı aldık
                                                            // listeyi ilk eleman ile sınırlandırdık

    }
        /*
        TRİCK : •    Stream'ler ekrana direk yazdırılamaz. Stream'i toArray() ile Array'e çeviririz.
        Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
        •  Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray()));
        kullanılabilir.
        */


    //TODO Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void sonHarfeGoreSiralaIlkHaricElmanlariYaz(List<String> yemek) {
    }

}


