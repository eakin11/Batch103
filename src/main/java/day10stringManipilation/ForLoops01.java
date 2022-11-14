package day10stringManipilation;

public class ForLoops01 {
    public static void main(String[] args) {
        //Example 1: Ekrana 5 kere "Hi" yazdiriniz
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");


        //  Tekrarli isler icin "loop" kullaniriz
        //Dort cesit loop vardir


//        for (int i = 1; i < 6; i++) {
//            System.out.println("HI");
//        }
//
//
//        // 4 TEN 7 ye  KADAR TUM TAMSAYILARI YAZDIRINIZ
//
//
//        for (int i = 4; i < 80; i = i + 1) {
//
//            System.out.println(i + " ");
//
//
//        }
        System.out.println();

//        System.out.println();
//        //Example 4:  14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
//
//        for (int i = 14; i > 4; i--) {
//
//
//            System.out.println(i + " ");
//
//
//        }


        //14 ten 5 e kadar tum cift sayilari yazdiriniz


//        for (int i = 14; i > 4; i = i - 2) {
//
//
//            if (i % 2 == 0) {
//
//                System.out.println(i);
//            }

//            System.out.println();
//
////Example 6:28 den 157 ye kadar tum tek tamsayilari yazdiriniz
//
//            for (int k= 28; k < 158;   k++) {
//
//
//                if (k % 2 != 0) {
//
//                    System.out.println(k);
//                }
//
//
//            }
//
//
//         //Java Stringini J*a*v*a*  Stringine ceviren kodu yaziniz
//
//        String str="Java";
//
//            for( int i =0   ; i<str.length()   ;   i++ ){
//                System.out.print(str.charAt(i)  + "*");
//
//            }
//
//






            //Example 6: Size verilen Stringde tekrarsiz karakterleri ekrana yazdiriniz
        // "Hellooo   Ali"    ===>HeAi;

            String s = "Hellooo Ali";

       for( int i = 0 ;   i<s.length();  i++ ){
            char c =s.charAt(i);

           if(s.indexOf(c)==s.lastIndexOf(c)){

           }

       }




        }




    }


















