package day08stringmanipulations;

public class StringManipulations02 {


    public static void main(String[] args) {

        //replace methodu bir Stringdeki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir



        //Example 1: Bir stringdeki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //         "Ali okula gitti."   ===>14


        String str = ("Ali okula giiti.");

       int sayi = str.replace(" ","").length();
        System.out.println(sayi);










        //Bir Stringdeki tum 'a' harflerini 'A' ya ceviririz


       // Example :2
        String s = "Ankara'nin tasina gozlerimin yasina bak.";

        //Bir Stringdeki tum "kara" kelimelerinin yerine "*" koyunuz

        String yeni = s.replace("a","A");
        System.out.println(yeni);





        //Example 4: Bir Striingdeki tum sayilari '*' a ceviriniz
        //              "AC202117004"==> AC*********
        String stdId ="AC202117004";
        String newstdId = stdId.replaceAll("[0-9]","*");
        System.out.println(newstdId);



/*
    Bir grup data'yı ifade eden kodlara "Regex" denir.
    "Regex" Regular Expressions'in kısaltılmış halidir.

    1)Tüm rakamlar ==> [0-9]
    2)Tüm küçük harfler ==> [a-z]
    3)Tüm büyük harfler ==> [A-Z]
    4)Tüm harfler ==> [a-zA-Z]
    5)Sesli hardler ==> [aeiouAEIOU]
    6)Space ==> [ ]
    7)Tüm rakamlar ve tüm harfler ==>[0-9a-zA-Z]
    8)Tum noktalama isaretleri ===> \\p{Punct}

 */
        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
//       tum karakterlerin sayisini bulan kodu yaziniz

          String u = "Ali 13 yasinda, dersem inanma!...";
          int sonuc = u.replace("[0-9]","").
                  replace(" ","").
                  replaceAll("\\p{Punct}","").length();

        System.out.println(sonuc);








 //Example
        // 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
//           i)Space haric en az sekiz karakter olmali
//           ii)En az 1 sembol icermeli
//           iii)En az 1 rakam icermeli
//           iv)En az 1 buyuk harf icermeli
//           v)En az 1 kucuk harf icermeli

              String pwd = "B78c? K!m";
//1
        //           i)Space haric en az sekiz karakter olmali
       boolean first =pwd.replace(" ","").length()>7;

        //ii)En az 1 sembol icermeli


            boolean secont = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;


        //iii)En az 1 rakam icermeli

        boolean thirt = pwd.replaceAll("[^0-9]","").length()>0;

        //iv)En az 1 buyuk harf icermeli

        boolean fourt= pwd.replaceAll("^A-Z","").length()>0;



       // v)En az 1 kucuk harf icermeli

boolean fift = pwd.replaceAll("[a-z]","").length()>0;


     boolean gecerliPwd = first&&secont&&thirt&&fourt&&fift;

if (gecerliPwd) {
    System.out.println("gecerli passwort");

}   else{

    System.out.println("gecersiz passwort");


    }
}





















    }






