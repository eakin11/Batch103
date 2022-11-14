package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {


//Example 1: Bir sayinin pozitif olup olmadigini  ekrana yazdiran kodu yaziniz

        //1.Yol.
        int sayi = -12;

        if(sayi>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif degi");
        }


       // 2//Yol :

        String sonucu = sayi>0 ? "Pozitif" : "Pozitif degil";
        System.out.println(sonucu);


        //Example :IKI SAYIDAN KUCUK OLANI SECEN KODU YAZINIZ

        int b = 1202;
        int c = 23;

      int kucukbuyuk =b<c  ?  b  : c;
        System.out.println(kucukbuyuk);







     //Example 3:Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
     //Pozitif sayilarin ve sifirin mutlak degeri kendidir
     //negatif sayilarin mutlak degeri -1 ile carpilmis halidir

      int verilenSayi =45;

     int cevap=  verilenSayi>=0 ? verilenSayi: -1*verilenSayi;
        System.out.println(cevap);



//Example 4 : iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise"Islem yapamam " mesaji veriniz

       int birinciSayi = 4;
       int ikinciSayi = 8;

      Object sonucuu=((birinciSayi>0 && ikinciSayi>0)) ||((birinciSayi<0&&ikinciSayi<0))  ? birinciSayi*ikinciSayi :"Islem yapamam";
        System.out.println(sonucuu);












    }


}





