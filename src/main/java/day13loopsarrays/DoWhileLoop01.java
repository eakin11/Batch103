package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

//   Example 1:Kullanicidan bir sayi ailiniz, sayi 100 den kucuk ise ekranan "Kazandin!" yazdiriniz
//            Aksi halde ekrana"Kaybettin"   yazdiriniz
//            Kullanici kazandikca  oyun devam etmeli

        Scanner input = new Scanner(System.in);
//        int sayi = 0;
//
//        do {
//            System.out.println("Bir sayi giriniz");
//            sayi = input.nextInt();
//
//            if (sayi < 100) {
//                System.out.println("Kazandiniz");
//            }
//
//
//        } while (sayi < 100);
//
//        System.out.println("Kaybettiniz");

//Example 2 :Kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz

        do {
            System.out.println("Lutfen isim giriniz");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {

                System.out.println("Ismi basariyla giridiniz");
            } else {
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir");
                break;
            }}
            while (true) ;

















        //Example 2:Kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kontol ediniz.















    }



}