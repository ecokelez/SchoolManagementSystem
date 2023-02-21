package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class QA01 {
    /*
        Kullanicidan bir String aliniz.
        String'de var olan her character'in sayisini ekrana yazdiriniz.
        Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1

        Scanner ile obj olsutur,
        split methodu,ve sonra sort,
        for loop ,
        if ile kontrol ve sout ile yazdır
    */

    //split:böl parçala array oluştur :)


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ifade giriniz ede ");
        String str=scan.nextLine();

        String arr[]=str.split("");
        System.out.println( "arr : " + Arrays.toString(arr));

        // sort;
        Arrays.sort(arr);
        System.out.println("arr'nin sort hali: " +  Arrays.toString(arr));;

        int counter=0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i-1].equals(arr[i])){
                counter++;

            }else {
                System.out.println(arr[i-1]+ "karkteri "+ (counter+1));
                counter=0;
            }if (i==arr.length-1){   // for loop da en sona geldıgınde
                System.out.println(arr[i]+ " karakteri " + (counter+1));
            }

        }







    }
}
