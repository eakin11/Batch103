import java.util.Scanner;

public class hk {


    public static void main(String[] args) {



       //Kullanicidan satin aldigi urunun kg  miktarini ve kg fiyatlarini isteyip odemesi gereken tutari veren bir kod yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen satin aldiginiz urunun kg fiyatini giriniz");
        double  miktari = input.nextDouble();

        System.out.println("Lutfen urunun kg fiyatini giriniz");
        double fiyat = input.nextDouble();

        double tutar = miktari*fiyat;

        System.out.println("Odemeniz gereken tutar "  + tutar + " TL ");



        //Verilen Stringdeki tekrar etmeyen harfleri veren kodu yazdiriniz

        String s = "AAkfdlgGDSHJFxxfd";


        for(int i = 0  ; i<s.length()               ;     i++           ){

           char c = s.charAt(i) ;

           if(s.indexOf(c)==s.lastIndexOf(c)){
               System.out.print(c);

           }


        }









    }







}
