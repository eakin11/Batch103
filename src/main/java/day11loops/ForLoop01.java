package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {

    //Example:3 ten 6 ya kadar tam sayilarin toplamini bulan kodu yaziniz

int sum =0;


    for (int i = 3          ;   i<7         ;  i++        )   {




       sum = sum+i;



    }

        System.out.println(sum);


    //Example 2: 6 dan 3 e kadar tamsayilarin carpimini bulan kodu yaziniz
       int multiply = 1;


        for(  int k = 6      ;  k>2        ;  k--      ){



          multiply = multiply*k;

        }

        System.out.println(multiply);


//Example 3: Size verilen 3 basamaklii bir sayinin rakamlari toplamini bulunuz


        int num=46535525;

        int sonuc =0;



        for(int i= num         ;   i>0         ;   i=i/10       ){





          sonuc = sonuc + i%10;


        }


        System.out.println(sonuc);





//Example 4: Size verilen bir Stringi ters ceviren kodu yaziniz
        //    "Kaba"  ===>"aBAK"



        String str ="Kaba";

       String ters ="";



        for(int i=str.length()-1; i>=0;    i--){

            char c = str.charAt(i);


            ters=ters + c;

        }


        System.out.println(ters);


        //Bir Stringdeki "m" karakteri haric tum karakterleri yazdiriniz
            //Andromeda

         String strr = "Andromeda";




    }


}
