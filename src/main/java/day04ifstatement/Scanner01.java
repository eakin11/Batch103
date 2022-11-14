package day04ifstatement;


import java.util.Scanner;

public class Scanner01 {


    public static void main(String[] args) {
//        Kullanicidan ilk,orta ve soy ismini,kimlik numarasini aliniz ve asagidaki formatta ekrana yazdiriniz
//        Ali Mert Can
//        123456789
//
//


        Scanner input = new Scanner(System.in);
// 1.Yol:
//        System.out.println("Ilk isminizi giriniz");
//        String ilkIsim = input.next();//next methodu kullanicidan String datasi almak icin kullanilir
//
//
//        System.out.println("Orta isminizi giriniz");
//        String ortaİsim = input.next();
//
//        System.out.println("Soyismi giriniz");
//        String soyİsim = input.next();
//
//        System.out.println("Kimlik numaranizi giriniz");
//        String kimlikNo = input.next();
//
//        System.out.println(ilkIsim + " " + ortaİsim + " " + soyİsim );
//        System.out.println(kimlikNo);


//2.Yol:Tek mesajla coklu Data alma!!!!

//        System.out.println("Ilk,Orta ve soy isminizi ve kimlik numaranizi giriniz...");
//
//     String ilk = input.next();
//     String orta = input.next();
//     String soy = input.next();
//     String kimlik = input.next();
//
//        System.out.println(ilk + " " + orta + " " + soy);
//        System.out.println(kimlik);
//

//3.Yol:
        System.out.println("Ilk, orta ve soy isminizi giriniz");
        String tamIsim =  input.nextLine();
        System.out.println(tamIsim);

        System.out.println("kimlik numarasi giriniz");
        String kimlikNo = input.next();
        System.out.println(kimlikNo);








    }
}
