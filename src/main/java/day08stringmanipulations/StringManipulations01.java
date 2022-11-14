package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

       //Kullanicidan aldiginiz isimn  ilk ve son harfini ekrana yazdiriniz
       //     Ramazan ===>Rn


       Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen isim giriniz");
//        String isim = input.nextLine();
//
//        char ilkHarf = isim.charAt(0);  //R
//
//        char sonHarf = isim.charAt(isim.length()-1);//n
//
//
//        System.out.println(""+ilkHarf+sonHarf);
//
//
//





        //Yazdiginiz code sadece bazi durumlar icin caliirsa o code'a "Hard Coding"
        //Yazdiginiz code her durum icin calisirsa o code 'a "Dynamic Coding" denir.






//        //2.Yol
//
//        String ilkHarff = isim.substring(0,1);
//         String sonHarff = isim.substring(isim.length()-1);
//
//       System.out.println(ilkHarff+sonHarff);
//
//
//        //Example 2: Verilen Stringteki tum hayva isimlerini ekrana yazdiriniz
//
//        //           "Ben kedi esim tavuk oglum inek sever"
//
//        String str = "Ben kedi, esim tavuk, oglum  sever inek ";
//
//        //subsitring() in iki kullanimi vardir.
//        //1)subsitring(baslama  indeksi,bitis indeksi
//
//        String  kedi =str.substring(4,8);
//        String tavuk =str.substring(16,20);
//        String inek = str.substring(34);
//
//




        //Example 3: Ilk isim ve  soismi iceren isimlerden ilk ve soy isimlerin basharflerini ekrana yazdiriniz
        //              Ali Can     Tahsin Yurdakul===>TH

//
//        System.out.println("Lutfen isim giriniz");
//        String isimm =input.nextLine();
//
//        String ilkHarfi = isimm.substring(0,1);
//
//     String sonHarfii =isimm.split(" ")[1].substring(0,1);
//
//        System.out.println(ilkHarfi+sonHarfii);


//        System.out.println("Lutfen isminizi giriniz");
//        String isim =input.next();
//        char ilkHarf = isim.charAt(0);
//        System.out.println(ilkHarf);
//
//        char sonHarf = isim.charAt(isim.length()-1);
//        System.out.println(sonHarf);
//
//
//        System.out.println(" "+ ilkHarf+sonHarf );


          String str = "Ali okula gitti";
          String num= str.replace(" ","");
        System.out.println(num);

           String u ="Ali%% 13; yasinda ;;dersem inanma!";
           int sonuc =u.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(sonuc );
    }






























}
