package sorular;

import java.util.Scanner;

public class Sorular {

    public static void main(String[] args) {

        //Bir String ' in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; "anna", "123321 " palindromlardır.

//        String str = "anna";
//        String strTers = "";
//
//        //For Dongusu ile Yapilisi
//        for (int i = str.length() - 1; i >= 0; i--) {
//            strTers = strTers + str.charAt(i);
//        }
//
//        if(str.equals(strTers)) {
//            System.out.println("Palindromdur");
//        } else {
//            System.out.println("Palindrom degildir");
//        }


//        //Do While ile yapilisi
//        int i =  str.length() - 1;
//        do {
//            strTers = strTers + str.charAt(i);
//            i--;
//        }while(i >= 0);
//
//        if(str.equals(strTers)) {
//            System.out.println("Palindrom");
//        }else {
//            System.out.println("Palindrom degildir");
//        }


//        //Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
//        //Örnek; 223878 ===> 37
//        int sayi = 223878;
//        String stringSayi = String.valueOf(sayi);
//        String sonuc=" ";
//
//        for(  int i  = 0            ;  i<stringSayi.length()         ;   i++       ){
//
//            if(stringSayi.indexOf(stringSayi.charAt(i))==stringSayi.lastIndexOf(stringSayi.charAt(i))){
//
//             sonuc=sonuc+stringSayi.charAt(i) ;
//            }
//
//
//        }
//
//        System.out.print(sonuc);


        //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A
        //A A A A A
//                       //A A A A A
//
//char ch ='A';
//
//        for(int i=1        ; i<=4             ;     i++       ){
//
//            for(int y=1        ;  y<=6            ;   y++     ){
//
//
//
//
//
//            }
//
//
//        }
//
//        System.out.print(ch);


//Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//A
//A A
//A A A
//A A A A
        //      String s = " ";

//for( int i=1         ;   i<=5         ;      i++   ){
//
// for (int k=1   ;   k<=5           ;   i++      )  {
//
//
//
//
//
// }
//
//}


        //    Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //    3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
//int num =3;
//
//
//for(int i = 1 ; i<11;  i++){
//
//    num=num*i;
//    System.out.println(num);
//}
//
//
//        System.out.println(num);
//


        //    20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        //   bırakarak yazdırmak için gereken kodu yazınız.


//        String s = "";
//        for (int i = 20; i > 2; i--) {
//            if (i % 2 != 0) {
//
//                s = s + i + " ";
//
//            }
//
//        }
//
//        System.out.println(s);
//
//


        //   Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
        //


//        String str ="kraM";
//        String ters = " ";
//        char c=' ';
//        for(  int i = str.length()-1     ;  i>=0          ;  i--      ){
//
//
//            char ch=str.charAt(i);
//
//
//          ters=  ters+ch;
//
//
//
//        }
//
//
//        System.out.println(ters);
//


        //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces

//        String s ="accessories";
//        String t=" ";
//        for (int i=0  ; i<s.length()      ;  i++      ){
//
//            char ch= s.charAt(i);//a
//
//            t=t+ch;
//
//if (t.indexOf(ch)==t.lastIndexOf(ch));
//
//
//        }
//
//
//        System.out.println(t);
//
        /*
         * TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedi giriniz");
        int adet = scan.nextInt();
        System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
        double fiyat = scan.nextDouble();
        System.out.println("Musteri kartiniz var mi? Varsa Y yoksa N tusuna basiniz");
        char kart = scan.next().toLowerCase().charAt(0);
        double toplamFiyat;

        if (kart == 'y') {
            if (adet > 10) {
                fiyat= fiyat*0.8;//fiyat=fiyat*0.8
                toplamFiyat = fiyat * adet;
                System.out.println("%20 indirim kazandiniz.Toplam odemeniz gereken miktar:" + toplamFiyat + "TL dir");
       }
//        else{
//            fiyat*=0.85;
//            toplamFiyat=fiyat*adet;
//            System.out.println("%15 indirim hakki kazandiniz.Toplaam odemeniz gereken miktar"+toplamFiyat+"TL dir");
//        }
//
//
//
//    }else if(kart=='n'){
//        if(adet>10){
//            fiyat*=0.85;///fiyat=fiyat*0.85
//            toplamFiyat=fiyat*adet;
//            System.out.println("%15 indirim hakki kazandiniz.Toplam odemeniz gereken miktar:"+toplamFiyat+"TL dir");
//        }else {
//            fiyat*=0.9;
//            toplamFiyat=fiyat*adet;
//            System.out.println("%10 inidirim hakki kazandiniz.Toplam odemeniz gereken miktar:"+toplamFiyat+"TL dirim");
//        }
//
//    }else{
//        System.out.println("Yanlis giris yaptiniz.Lutfen tekrar deneyiniz");
//    }
//

/*
SORU: Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
 */
//                Scanner input = new Scanner(System.in);
//                System.out.println("    ****     ");
//                System.out.println("ATM ye hosgeldiniz  :)    ");
//                System.out.println("Bakiye sorgulama icin :1\nPara cekme :2\nPara yatirma  :3\nCikis  :  4\nYAPACAGINIZ ISLEMI SECINIZ ");
//                int islem = input.nextInt();
//                int bakiye = 1000;
//
//                switch (islem) {
//                    case 1:
//                        System.out.println("Mevcut bakiyeniz: " + bakiye);
//                        break;
//                    case 2:
//                        System.out.println("Cekeceniz miktari giriniz");
//                        int cekilenMiktar = input.nextInt();
//                        if (cekilenMiktar > bakiye || cekilenMiktar < 0) {
//                            System.out.println("Olmayan parayi cekmeye calisiyorsunuz.");
//                        } else {
//                            bakiye -= cekilenMiktar;
//                            System.out.println("Bakiyenizin guncel hali   :  +  " + bakiye);
//                        }
//                        break;
//                    case 3:
//                        System.out.println("Yatiracaginiz miktari giriniz");
//                        int yatirilanMiktar = input.nextInt();
//                        bakiye += yatirilanMiktar;
//                        System.out.println("Bakiyenizin guncel hali  :  " + bakiye);
//                        break;
//                    case 4:
//                        System.out.println("Cikisiniz yapilmistir.Yine bekleriz  :) ");
//                        break;
//                }


/*
    Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için kod yazınız.
     Google'dan dönüşümler için formülleri bulunuz.
    a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
    b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
    kodunuz "2" yazmalıdır (sayı dinamik olacak)
    c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
    konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)

     */


//        Scanner input = new Scanner(System.in);
//        System.out.println("Mil dönüştürmek için 1, Saniye dönüştürmek için 2, Fahrenheit dönüştürmek için 3'e basınız");
//        int secim2 = input.nextInt();
//        if (secim2 == 1) {
//            System.out.print("Mil'i dönüştürmek için değer giriniz: ");
//            double mil = input.nextDouble();
//            double mildenKmye = 1.60934 * mil;//bir mil= 1,60934 kilometredir.
//            System.out.println("Girdiginiz mil degeri : "+mildenKmye +" km'dir.");
//        } else if (secim2 == 2) {
//            System.out.print("Saniye'yi dönüştürmek için değer giriniz: ");
//            int saniye = input.nextInt();
//            int saniyedenSaate = saniye / 3600;
//            System.out.println("Girdiginiz saniye degeri : "+saniyedenSaate+ "  saat'dir.");
//        } else if (secim2 == 3) {
//            System.out.print("Fahrenheit'ı dönüştürmek için değer giriniz: ");
//            double fahrenheit = input.nextDouble();
//            double fahrenheitToCelcius =(fahrenheit - 32) / 1.8;
//            fahrenheitToCelcius=Math.round(fahrenheitToCelcius);
//            System.out.println("Girdiginiz fahrenayt'in degeri : "+fahrenheitToCelcius +" Celcius'dur. ");
//        } else {
//            System.out.println("Lütfen geçerli bir seçim yapın...");
//        }
            }
        }


    }



