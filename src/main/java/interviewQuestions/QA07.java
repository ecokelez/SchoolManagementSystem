package interviewQuestions;

public class QA07 {
       /*
        // Stringi ters cevirmek icin bir Java Programi yazin
        //1.Yol: StringBuilder () kullanarak
        //2.Yol: String Classini kullanarak
        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        */
       public static void main(String[] args) {

           String input="All is well";

           StringBuilder str=new StringBuilder();
           str.append(input);   // StringBuilder methodu ekleme yapar
           System.out.println("str :"+ str);

           String tersInput=str.reverse().toString();
           System.out.print("tersInput :" + tersInput); // reverse ile tersine cevrildi
                                                        // to String ile tersine cevrildi


           System.out.println(" 2. yol :");

           int sonHarf=input.length()-1;

           for (int i = input.length()-1; i >=0 ; i--) {
               System.out.print(input.charAt(i));// her bir karakteri alıp yan yana yazdırdık
           }

       }
}
