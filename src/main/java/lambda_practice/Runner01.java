package lambda_practice;

import static lambda_practice.Lambda02.*;

public class Runner01 extends Lambda01{
    public static void main(String[] args) {
        ıcındeAHarfleriSilenGerisiniYazdıran(names);
        System.out.println("**************");
        enBuyukElemanıBul(numbers);
        System.out.println("**************");
        elemanlarınToplamınıBul(numbers);
        System.out.println("**************");
        ciftElemanlarınCarpımınYazdır(numbers);
        System.out.println("**************");
        ciftElemanlarınCarpımınYazdır01(numbers);
        System.out.println("**************");
        teklerinKareBuyuktenKucuge(numbers);
        System.out.println("**************");
        sonHarfineGoreTersSırala(menu);
        System.out.println("**************");
        karakterSayısı7ve7denAzOlanlarıYaz(menu);
        System.out.println("**************");
        karkterEnFazla(menu)   ;
    }
}
