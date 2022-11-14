package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {


        //Bir Array in elemanlari Array ise bu Arrayler "Multidimensional Array" dir


      //  "Multidimensional Array" nasil olusturulur?
        int arr[][]  = new int [3][2];

        //Multidimensional Array lara eleman ekleme nasil yapilir?
        arr[0][0] = 3;
        arr[0][1] =-4;
        arr[1][0] =6;
        arr[1][1] =18;
        arr[2][0] =-7;
        arr[2][1] =0;


        //Multidimensional Array  consola'a nasil yazdirilir//

        arr[1][0] = 6;
        arr[0][0]=3;
        arr[0][1]=-4;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]=0;

        System.out.println(Arrays.deepToString(arr));
        //[[3, -4], [6, 18], [-7, 0]]

//Multidimensional Array lerde Array elemanlardan biri nasil yazdirilir?
        System.out.println(Arrays.toString(arr[1]));//[6, 18]

//Multidimensional Array lerde ic Arraylerdeki elemanlar nasil yazdirilir?
        System.out.println(arr[1][0]);//6


        //Example 1: String bir Multidimensional Array olusturunuz
        //           Elemanlari ekleyiniz
        //           Toplam eleman sayisini ekrana yazdiran kodu yaziniz



        //Example 1: String bir Multidimensional Array  olusturunuz
        //           Elemanlari ekleyiniz
        //           Toplam eleman sayisini ekrana yazdiran kodu yaziniz

    String brr[][] = new String[4][3];




    }
}