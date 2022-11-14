import java.util.Scanner;

public class Soru {

    public static void main(String[] args) {


        /*  Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        Input :
        John White
        1234234534561478
        Output : Name :
        J*** W****
        CCN  : **** **** **** 1478
Ilk Harfler Buyuk harf ile baslamalidir.

         */

    Scanner input = new Scanner(System.in);
    System.out.println("Lutfen isim ve soyisim giriniz");
    String adSoyad = input.nextLine().toUpperCase();//ERCAN AKIN
    System.out.println("Lutfen 16 haneli kredi kartii numarasini giriniz");
    String  ccNumber = input.next();

   String ad=adSoyad.split(" ")[0];
   String soyAd=adSoyad.split(" ")[1];

   ad=ad.substring(0,1)+ad.substring(1).replaceAll("[a-zA-Z]","*");
        System.out.print(ad);
   soyAd=soyAd.substring(0,1)+soyAd.substring(1).replaceAll("[a-zA-Z]","*");
        System.out.println(soyAd);

  ccNumber=ccNumber.substring(0,12).replaceAll("[0-9]","*")+ccNumber.substring(12);
        System.out.println(ccNumber);


        System.out.println("Name" + ad + " "+soyAd);
        System.out.println("CCN" + ccNumber);


        String ccNumberSonHali ="";
        for(int i=0;i<ccNumber.length();i=i+4){
        ccNumberSonHali+=ccNumber.substring(i,i+4)+ " ";
            System.out.println(ccNumberSonHali);

        }

        System.out.println(ccNumberSonHali);

























    }












    }

