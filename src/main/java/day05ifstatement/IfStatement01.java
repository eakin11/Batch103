package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {


        //Example:Kullanicidan alinan sayinin tek mi çift oldugunu ekrana yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);


        System.out.println("Bir sayi giriniz..");


        //1.Yol:
        int s = input.nextInt();

        if (s % 2 == 0) {

            System.out.println("Cift sayi");

        }

        //"!=" demek "esit degil" demek.
        if (s % 2 != 0) {

            System.out.println("Tek sayi");



        }

        //2.Yol

        if (s % 2 == 0) {
            System.out.println("Cift sayii");
        } else {
            System.out.println("Tek sayii");
        }

        //Bir sayinin negatif,pozitif veya notr oldugunu soyleyen kodu yaziniz.

        System.out.println("Bir sayi giriniz");
        double d = input.nextDouble();

        if (d > 0) {

            System.out.println("Pozitif");

        } else if (d == 0) {
            System.out.println("Notr");
        } else {
            System.out.println("Negatif");
        }


    }

}

