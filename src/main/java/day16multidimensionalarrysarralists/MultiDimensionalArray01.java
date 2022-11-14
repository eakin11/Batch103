package day16multidimensionalarrysarralists;

public class MultiDimensionalArray01 {

    /*
  * Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
  * Array veya Collection var ama "index" kullanmak zoorubdasiniz o zaman "for-each-loop calismaz, "for-loop" veya "while-loop"  veya "do-while-loop"
  * kullanmalisiniz
     */
   //Bir tane integer multidimensional array olusturunuz
   //Bu array deki tum sayilarin toplamini veren kodu yaziniz

    public static void main(String[] args) {
        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int sum = 0;

        for (int[]w :arr){

            for(int k :w ){

                sum = sum+k;
            }

        }
        System.out.println(sum);

//        int sum =0;
//
//        for(int[ ]w: arr){
//
//        for(int k :w){
//            sum= sum +k;
//        }
//        }
//        System.out.println(sum);
//

//        //Bir multidimensional array i normal array e ceviren kodu yaziniz
//        //{{2,5,1},{32,75}}====> {2,5,1,32,75}
          int brr[][]= {{2,5,1}  , {32,75}};






















//        int topla = 0;
//
//        for(int[]  w:brr){
//
//            topla =topla+w.length;
//        }
//
//        System.out.println(topla);
//


    }


    }
