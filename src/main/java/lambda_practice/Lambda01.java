package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
     static ArrayList<String> names=new ArrayList<>(Arrays.asList("Zeynep","Elif","Hasan","İsmail","Osman","Mevlüt"));

    static List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,54,9,35,35,34));

    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));


     public static void ıcındeAHarfleriSilenGerisiniYazdıran(ArrayList<String>isimler){
       /* 1. yol:
     System.out.println(isimler.stream().  --> akısa alındı
                 map(t -> t.toLowerCase()).  ---->hepsi  kucuk harfe cevrildi
                 filter(t -> !t.contains("a")).  --> a harfi olmayanlar filtrelendi
                 collect(Collectors.toList()));  ---> liste atıldı

        */

         // 2.yol :
         // isimler.stream().filter(t->!t.contains("a") && !t.contains("A")).collect(Collectors.toList());

        // 3. yol:
         isimler.removeIf(t->t.contains("a") || t.contains("A"));
         System.out.println(names);

     }
    //en buyyk elemani bulun

    public static void enBuyukElemanıBul(List<Integer>list){
       /*  Integer max=list.stream().reduce(Math::max).get();
        System.out.println(max);

        */

      // 2. yol:
        /*Optional<Integer> maxSayı=list.stream().reduce(Math::max);
        System.out.println(maxSayı);

         */

       Integer max= list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(max);

       // list.stream().sorted(Comparator.reverseOrder()).reduce(Integer.MIN_VALUE,(t,u)->t>u ? t :u);

    }

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
//Lambda Expression...

    public static void elemanlarınToplamınıBul(List<Integer>list){
       //1 yol:

        Integer toplam =list.stream().reduce(Math::addExact).get();//spesifik bir method cagirirsani daha hizli yani alirsinz
        System.out.println(toplam);
        /*
         reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
                kullanımı yaygındır pratiktir.
         Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde,
        bir önceki adımda elde edilen sonuç bir sonraki adıma girdi olarak sunulmaktadır.
        Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
         */

    /* 2. yol:
      Integer toplam= list.stream().reduce(0,(t,u)->t+u);
        System.out.println(toplam); */

     /* 3. yol:
      Integer toplam= list.stream().reduce(Integer::sum).get();
        System.out.println(toplam);
      */
    }


    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElemanlarınCarpımınYazdır(List<Integer>list) {
       /* Integer carpım = list.stream().filter(t -> t % 2 == 0).reduce(Math::multiplyExact).get();
        System.out.println(carpım); */

       Integer carpım= list.stream().filter(Methodlarım::ciftElemanıBul).reduce(1,(a,b)->a*b);
        System.out.println(carpım);

    }


    public static void ciftElemanlarınCarpımınYazdır01(List<Integer>list){
            Integer carpım= list.stream().filter(t->t%2==0).reduce(1,(t,u)->t*u);
            System.out.println(carpım);
     }



}
