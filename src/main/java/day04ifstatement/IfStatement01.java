package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {



        //Example 1 :Sayi pozitif ise ekrana pozitif yazdiriniz.


        int s = 14;


        if (s>0){


            System.out.println("Pozitive");




        }

       char ch = 'A';

        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf");


        }

//Verilen sayi 300 den kucuk veya 1200'den buyuk ise ekrana harika sayi yazdiriniz

        int r = 250;

        if(r<300 || r>1200){

            System.out.println("Harika Sayi");



        }






    }




}
