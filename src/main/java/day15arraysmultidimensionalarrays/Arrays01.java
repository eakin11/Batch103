package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        //binarySearc() Method :Bu methodu kullanarak bir elemanin Array de olup olmadigini anlariz
        // binarySearc() Method unu kullanmadan once mutlaka Arrays.sort() kullanilmalidir.
        //binarySearc() Method u aradiginiz eleman Array de varsa o elemanin indexini return eder
        //binarySearc() Method u aradiginiz eleman Arrayde yoksa "-a" seklinde bir negatif sayi alirsiniz
        // Bu sayidaki"-"  isaretin anlami bu eleman Arrayda yok demektir,"a" nin anlami olsaydi kacinci sirada olurdu demektir.

        //binarySearc() Method u tekrarlayan elemanlar icin kullanilmaz.

        int arr[]= {12,31,43,14};
        int sayi =43;

        Arrays.sort(arr);//[12,14,31,43]

       int idx= Arrays.binarySearch(arr,sayi);

        System.out.println(idx);//3
        int sayi2 =58;
        int sonuc = Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);



//
//      //  int arr[] = {12,31,43,14};
//
//        int sayi = 43;
//
//        Arrays.sort(arr);//[12,14,31,43]
//
//        int idx1 = Arrays.binarySearch(arr,sayi);
//
//        System.out.println(idx1);//3
//
//
//        int sayi2 = 58;
//       int sonuc= Arrays.binarySearch(arr,sayi2);
//       System.out.println(sonuc);// -5 //Eleman yok //Olsaydi hangi sirada olurdu







    }


    }






