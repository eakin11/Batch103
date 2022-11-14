package day02methodcreation;

public class Car {
    public String marka = "Honda";//Pasif Özellikler ikiside
    public int fiat = 20000;

    public static void main(String[] args) {
        //Main metot yapmadan program calışmaz.

     //Obje Nasıl Olusturulur?
     //1)Clas isimini yaz 2)Objeye bir isim veriniz  3) =  4)new keyword'ünü kullan 5)Class isim parantezle beraber
          Car              myHonda                     =               new               Car();
        System.out.println(myHonda.fiat);///20000
        System.out.println(myHonda.marka);///Honda

        myHonda.dur();
        myHonda.hareketEt();
        //MethodCreation clas'ından object olusturduk

        MethodCreation obj = new  MethodCreation();
        System.out.println(obj.toplamaYap(3,5));

    }


    public void hareketEt(){
        System.out.println("Honda guzel hareket eder");//Aktif Özellik


    }
    public void dur(){
        System.out.println("Honda guvenli durur...");//Aktif Özellik
    }





}
