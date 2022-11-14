package day03typecastingwrapperscanner;

public class Typecasting01 {
    //Type Casting:Bir numerik data tipini diger numerik data tipine çevirmektir.
    // byte<short<int<long<float<double

    //Kuçukten buyuge donusturmeye:Auto widening
    //Buyukten kucuge cevirmeye :Explicit   Narrowing
   //                            (Acıkca    Daraltma) demek

    //Not:Kucuk data tipini buyuk data tipine cevirmeye "Auto Widening"
    //    Buyuk data tipini kucuk data tipine cevirmeye  "Explicit   Narrowing"

    public static void main(String[] args) {

        byte age = 23;

        int newAge = age;
        //Kucuk memory'i buyuk memory'in icine koymak kolay oldugu icin java bunu otomatik yapar.
        //Dönüştürmesi kolay oldugu icin  "Auto Widening" denir.


        long population = 1234;
        int newPopulation =(int)population;

        //Example 1 short'u double'A ceviren kodu yaziniz
        //          float'i byte yapan kodu yaziniz.

        short numOfStudents = 4000;
        double newNumOfStudent = numOfStudents;

       float price = 12.99F;
       byte newPrice = (byte)price;

        System.out.println(newPrice);//


        int number = 515;
        byte newNumber =(byte) number;
        System.out.println(newNumber);





    }


}
