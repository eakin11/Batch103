package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("dikdortgenin kısa kenarini girniz ");
        int en = input.nextByte();

        System.out.println("dikdortgenin uzun kenarini giriniz");
        int boy = input.nextByte();


        System.out.println("Alan " + (en*boy) );

        System.out.println("cevre " + 2*(en+boy));




    }




}
