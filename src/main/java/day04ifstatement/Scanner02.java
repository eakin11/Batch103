package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    //Kullanicidan ilk ve soy isimini aliniz, ilk ve soy ismin ilk harflarini ekranayazdiriniz.
    //Ali Can====>AC

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk ismi giriniz");
        char ilk = input.next().charAt(0);// A

        System.out.println("Soyismi giriniz");
       char son = input.next().charAt(0);

        System.out.println("" + ilk+son);









    }





}
