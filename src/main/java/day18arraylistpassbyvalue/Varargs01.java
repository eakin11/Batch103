package day18arraylistpassbyvalue;

public class Varargs01 {

    /*
    1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak icin "varargs" kullanmaliyiz
    2)"varargs" arka tarafta "array" kullanir,bu yuzden "varargs" larla calisirken "Array" lerle calisiyormus gibi davranabilirsiniz
    3)"varargs" olusturmak icin "<data type>... <varargs ismi>" veya "<data type> ...<varargs ismi>"
    4)Bir methotta "varargs" in yanin baska bir method kullanilabilir  mi?
    "varargs" en sonda olmak sarti ile kullanilabir mi?
    5)Bir method da birden fazla varargs kullanilabir mi?
    varargs en sonda olmak zorunda oldugundan, birden fazla kullanirsiniz en az biri en sonda olmayacaktir.Bu da 4.kural ile celisir

     */
    public static void main(String[] args) {

        int r1=add(2,3);
        System.out.println(r1);//5

        int r2=add(2,3,4);
        System.out.println(r2);//9


        int r3=add(2,3,4,5,6,7,8,9);
        System.out.println(r3);//44



    }


////Iki sayinin toplamini return eden bir kod yazinizi
//
//
//
//public  static  int add(int a,int b){
//        return a+b;
//

//}

       //Iki sayinin toplamini return eden bir kod yazinizi
//
//public  static int add(int a,int b,int c){
//        return  a+b+c;
//}

////Iki sayinin toplamini return eden bir kod yazinizi
//public  static int add(int a,int b,int c,int d) {
//    return a + b + c+ d;
//
//
//}
        //Istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim
    public static int add(int...a){

        int sum=0;

        for(int w:a){

            sum=sum+w;

        }
        return sum;
    }





}
