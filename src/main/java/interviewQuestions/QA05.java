package interviewQuestions;

public class QA05 {
    public static void main(String[] args) {
        int arr[]={17,23,33,9,20,55};
        arrTopla(arr);
        System.out.println(arrTopla(arr));

        varargsToplaList(25,55,63,21,20);

        varargsToplaArr(arr);
        System.out.println(varargsToplaArr(arr));
    }

    private static int varargsToplaArr(int...i) {
        int toplam=0;
        for (int w:i) {
           toplam+=w;
        }
       return toplam;
    }

    private static void varargsToplaList(int i, int i1, int i2, int i3, int i4) {


    }


    private static int arrTopla(int[] arr) {
        int toplam=0;
        for (int w:arr) {
            toplam+=w;
        }
        return toplam;
    }
}
