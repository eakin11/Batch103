package day13looparrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    //Example 1:Kullanicidan bir sayi aliniz,sayi 100 den kucuk ise ekrana "kazandiniz!) yazdiriniz
    //          Aksi halde ekrana "kaybettiniz" yazdiriniz
    //          Kullanici kazandikca devam etmeli


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = 0;

        do {
            System.out.println("Bir sayi giriniz");
            sayi = input.nextInt();

            if (sayi < 100) {
                System.out.println("Kazandiniz");
            }
        } while (sayi < 100) ;




        System.out.println("Kaybettiniz");









    }

}