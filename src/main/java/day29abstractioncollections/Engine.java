package day29abstractioncollections;

public interface Engine extends Vehicle {
    //Child------>  Parent
    //Class------> Interface ====>Implements
    //Class------> Class     ====>extends
    //Interface--> Interface ====>extends
    //Interface--> Class     ====>Mumkun degil


    //interface'lerdeki tum variableler otomatik olarak(default) "public"dir
    //interface'lerdeki tum variableler otomatik olarak(default) "final"dir
    //interface'lerdeki tum variableler otomatik olarak(default) "static"dir

   int price = 2000;

   double weight=23.5;
    void run();


}
