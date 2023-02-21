package interviewQuestions;

import java.util.Arrays;

public class QA14 {
        /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz
    cevap : 13 donsun
        */

    public static void main(String[] args) { // mDA ıcın -> Nested for Loop aklımıza gelmeli

        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        elemanSayısı(arr);
        System.out.println("elemanSayısı(arr) : " + elemanSayısı(arr));
        System.out.println(Arrays.toString(arr));  // referans
        System.out.println(Arrays.deepToString(arr));
    }

    private static int elemanSayısı(int[][] arr) {
        int sayac=0;

        for (int i = 0; i <arr.length ; i++) { // outer loop
            for (int j = 0; j <arr[i].length ; j++) { // inner for loop
                sayac++;
            }

        }
        return sayac;
    }
}
