package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {



        /*
        Java primitivlere method'lar ekleyerek bir yapi olusturdu,bu yapiya"Wrapper Class" denir.

        Primitive        Wrapper
        byte     ===>    Byte
        short    ===>    Short
        int      ===>    İnteger
      **long     ===>    Long
        float    ===>    Float
        double   ===>    Double
        boolean  ===>    Boolean
      **char     ===>    Character

         */


        byte primitiveByte = 12;//"primitiveByte" yazip nokta koydugumuzda hic metot goremeyiz,cunku
        //                        primitive'ler metot icermez sadece deger icerir.




        Byte wrapperByte = 12;//"wrapperByte" yazip nokta koydugumuzda bir cok method goruruz, cunku
                              //wrapper lar method icerir



        System.out.println( Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);


        System.out.println( Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);





    }





}
