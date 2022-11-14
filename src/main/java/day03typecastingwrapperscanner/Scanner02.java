package day03typecastingwrapperscanner;



import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz

        //1.Adim:Scanner Clas

        Scanner input = new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz ");
        double sayi1 = input.nextByte();


        System.out.println("ikinci sayiyi giriniz ");
        double sayi2 = input.nextByte();

        System.out.println(sayi1 + sayi1);

    }
}
