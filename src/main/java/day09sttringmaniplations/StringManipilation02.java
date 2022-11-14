package day09sttringmaniplations;

import java.util.Scanner;

public class StringManipilation02 {

    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";
       int idxA= str.indexOf("kara");
        System.out.println(idxA);

        int idxA2= str.lastIndexOf("kara");
        System.out.println(idxA2);


        String s = "Mississippi";

       int idxI =s.indexOf('i');
        System.out.println(idxI);//1


        int idxIss1= s.indexOf("iss");
        System.out.println(idxIss1);

        int idxIss2=s.lastIndexOf("iss");
        System.out.println(idxIss2);

    //Example 1:Bir Stringte bir characterin tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz
        //"Helloooo" ====>H--->Tekrarsiz   e---->Tekrarsiz    l---->Tekrarli   o---->Tekrarli

        String t ="Helloooo";


//
//        if (t.indexOf('o')==t.lastIndexOf('o')) {
//
//            System.out.println("'Tekrarsiz");
//
//        }else{
//            System.out.println("Tekrarli");
//        }
//
//
//       String u ="Learn Java earn money";
//       int sonuc = u.indexOf("e",4);
//        System.out.println(sonuc);
//
//        int son =u.lastIndexOf("a",5);
//        System.out.println(son);
//
//
//        String v =" ";
//       boolean bosMu = v.isEmpty();
//        System.out.println(bosMu);
//
//
//        String x="  ";
//      boolean blankMi=x.isBlank();
//        System.out.println(blankMi);
//
//  ///Example 2: Kullanican alinan isim mutlaka space den farkli en az 1 character icermelidir.
//        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen isim giriniz");
//       String  isim =input.nextLine();
//
//   if(isim.isBlank()){
//       System.out.println("Sana isim gir ededim");
//   }else{
//       System.out.println(isim);
//   }

        String b = "Ali 12 ?_";
        System.out.println(b.replaceAll("\\w","*"));




    }





}
