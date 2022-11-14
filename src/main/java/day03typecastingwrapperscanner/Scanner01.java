package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {



    //Scanner kullanicidan data almaya yarar,Scanner kullanici ile etkilesim kurmamizi saglar.
    //Scanner bir Java Clası'dır.



    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        //Kullanicidan Data almak icin gerekenler


        //1.Adim: Scanner Class tan object olusturun

        System.out.println("Hey kullanici yasini gir");


        byte age = input.nextByte();


        System.out.println("Hey kullanici yasin " + age );

       // Scanner İnput = new Scanner();

    }
}
