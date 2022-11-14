import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class qestions {


    public static <Test01> void main(String[] args) {

        //Bir Stringin palindrom olup olmadigini kontrol eden kod yaziniz
        //Bir String tersi ile ayniysa , palinrom dur.Ornek "anna" "123321"


//        String str= "hhna";
//        String r ="";
//
//       for (int i = str.length()-1; i>-1 ; i--) {
//          String c = str.substring(i,i+1);
//
//           r =r+ c;
//
//       }
//
//       if (str.equals(r)){
//           System.out.println("Polindromdur");
//       }else {
//           System.out.println("Polindrom degildir");
//       }
//


//       String str = "anna";
//        String r ="";
//        int i=str.length()-1;
//        while(i>-1){
//        String c=str.substring(i,i+1);
//        r=r+c;//anna
//        i--;
//        }
//        if (str.equals(r)){
//            System.out.println("Polindrom");
//        }else {
//            System.out.println("Polindrom degildir");
//
//       }


//        String str = "anhha";
//        String birlestirici ="";
//
//        int i = str.length() - 1;
//        do {
//            String c = str.substring(i , i + 1);//
//            birlestirici+=c;
//            i--;
//        }
//        while (i>-1);
//
//        if (str.equals(birlestirici)){
//            System.out.println("Polindrom");
//        }else {
//            System.out.println("Polindrom degil");
//        }
//

//Bir String' i tersine çevirmek için kod yazınız. Örnek;" Mark" ==> kraM

        String str1 = "Ercan";
        String hiclik = "";
        for (int j = str1.length() - 1; j > -1; j--) {

            String ters = str1.substring(j, j + 1);

            hiclik += ters;


        }

        System.out.println(hiclik);


        String t = "Mark";
        StringBuilder sb = new StringBuilder(t);
        System.out.println(sb.reverse());

        //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
//Örneğin; 'Ali Can?' ==> l*i*a*n*
//        String s = "Ali Can?";
//
//    s=  s.replaceAll("[^a-z]","");
//        String concat ="";
//     for (int i=0;i<s.length(); i++){
//
//      String birles= s.substring(i,i+1);
//
//      concat+=birles+"*";
//
//     }
//
//     System.out.println(concat);
//
//String s= "Ali Can";
//s=s.replaceAll("[^a-z]","");
//
//int i = 0;
//String r  ="";
//while (i<s.length()){
//
//    String alma= s.substring(i,i+1);
//    r+=alma+"*";
//i++;
//}
//        System.out.println(r);

//
//        String str ="Ali Can";
//        String concat="";
//      str=  str.replaceAll("[^a-z]","");
//
//      int i=0;
//
//      do{
//         String alma= str.substring(i,i+1);
//         concat+=alma+"*";
//         i++;
//
//      }
//
//      while (i<str.length());
//        System.out.println(concat);
//


/*
Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.

 */

//      int sayi = 6;
//      int carp =1;
//
//
//      for (i =sayi;sayi>1; i--){
//
//         carp = carp*sayi;
//
//
//      }
//
//
//        System.out.println(carp);
//


//


        //  List<Character> list = new ArrayList<Character>();
        //  List<int> list = new ArrayList<>();
        //  ArrayList<> list = new ArrayList<String>();
        //   ArrayList<boolean> list = new ArrayList<>();


        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);


    }
}









































