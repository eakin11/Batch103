package day10stringManipilation;

public class StringManipilation01 {
    public static void main(String[] args) {

        //startsWith ("kola", 5) kodu ilk 5 karakterden sonraki String e bakar ve o String in "kola" ile  baslayip baslamadigini kontrol eder
        //"kola" ile basliyorsa "true", basliyorsa "false" return eder.
        String a = "Java kolaydir ";
       boolean b= a.startsWith("kola",5);
        System.out.println(b);

       String c = a.replaceFirst("a","*");
        System.out.println(c);
//replaceFirst ("a","*") kod String deki ilk "a" lari "*" cevirir.

        //concat() method'u iki tane Stringi yapistirmaya yarar.
        //Concatination islemi iki turlu yapilabilir.1)+ ile 2)concat ile
        //Java bir islem icin method uretmisse o method u kullanmak "best practice" dir.
      String d=a.concat(" Anladin mi?");
        System.out.println(d);//Java kolaydir Anladin mi?
    String e = "        "     ;
        System.out.println(e);
      //trim methodu bir Stringde bas ve sonundaki "space" karakterini siler, aradaki "space" karakterlerine dokunmaz
        String f= e.trim();
        System.out.println(f);


        String h ="Java";
        String i = "Java";
  //h.compareTo() kod iki tane Stringi alfabetik(lexicographic) olarak karsilastirir
        //BuyuK HARFE DUYARLIDIR.
        //Buyuk harf kucuk harf e duyarli olmasini istemezseniz h.compareToIgnorCase(i); kullanilmalidir.
        //h.compareTo(i); kodda "h" nin alfabetik sirasindan "i" nin alfabesi cikartilir.

       int k = h.compareTo(i);
        System.out.println(k);
//.repeat(5); kodu "a" Stringini yanyana 3 kere yazdirir

        String n =a.repeat(5);
        System.out.println(n);


    }



}
