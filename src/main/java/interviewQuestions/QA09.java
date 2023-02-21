package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QA09 {
        /*
      Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
        */

    public static void main(String[] args) {

        List<Integer> fibonacciList=new ArrayList();
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı gir");
        int sayı=scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);

        int i=1; // while sartını olusturmak ıcın

        if (sayı<=1){
            System.out.println("daha buyuk sayılar gir");
        }else {
            while (fibonacciList.get(i)<sayı){
                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i-1));
                i++;
            }
            System.out.println("fibonacciList :" +fibonacciList);
        }

        int sonIndextekiEleman=fibonacciList.size()-1;
        if (fibonacciList.get(sonIndextekiEleman)>sayı){
            fibonacciList.remove(sonIndextekiEleman);
            System.out.println("Girdigin sayı  fibonacci dizisinde bulunmamaktadır : " +
                    "giridiginiz sayıya kadar fibonacci dizisi : " + fibonacciList);
        }else {
            System.out.println("Girdigin sayı  fibonacci dizisinde var :" + fibonacciList);
        }
    }
}
