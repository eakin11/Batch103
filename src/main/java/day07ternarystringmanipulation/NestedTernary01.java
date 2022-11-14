package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {
       /*
            Verilen yilin "Leap Year "olup olmadigini konrtol eden kodu yaziniz.

            i)Yil 100'e bolunurse 400 e de bolunmelidir ==> 1600+   1800-
            ii)Yil 100'e bolunmezse 4 'e bolunmeli
        */

        int year =2022;
        String leapMi = year%100==0 ? year%400==0 ? ("Leap year"):("Leap year degil"): (year%4==0? "Leap year" :"Leap year degil");
        System.out.println(leapMi);

//Asaidaki kurallara gore password un gecerli olup olmadigini kontrol eden kodu yaziniz
        //1) En az 8 character icermeli
        //2)Spece charecteri icermemeli
        //Ilk harf "M" veya "m" olmali
        //Son characteri "?" olmali


       String pwd = "Mana1?";
//
//
//

        //1) En az 8 character icermeli
       boolean birinci= pwd.length()>7;

        //2)Spece charecteri icermemeli
       boolean ikinci = !pwd.contains(" ");

        //Ilk harf "M" veya "m" olmali

       boolean ucuncu =pwd.charAt(0)=='M' || pwd.charAt(0)=='M';


        //Son characteri "?" olmali

        boolean dorduncu=pwd.charAt(pwd.length()-1)=='?';



        if (birinci&&ikinci&&ucuncu&&dorduncu){
            System.out.println("Parola gecerli");
        } else {
            System.out.println("Parola  gecersiz");
        }





//
// 1) En az 8 character icermeli
//       boolean first = pwd.length()>7;
//        //2)Spece charecteri icermemeli
//       boolean secont= !pwd.contains(" ");
//
//


//       //Ilk harf "M" veya "m" olmali
//
//       boolean thirt=  pwd.charAt(0)=='M'|| pwd.charAt(0)=='m';
//
//        boolean fort = pwd.charAt(pwd.length()-1)=='?';
//
//
//        if (first&&secont&&thirt&&fort){
//            System.out.println("Gecerli passwort");
//
//        }else {
//            System.out.println("Gecersiz faswort");
//        }








    }


}
