package day09sttringmaniplations;

public class StringManipilations01 {
    public static void main(String[] args) {

        String str = "Java is easy";


        int idxA = str.indexOf("a");//1

        //IndexsOf() method'u charecter veya charecter'lerin ilk gorunumunun index'ini verir.
        System.out.println(idxA);

        //lastIndexOf() method'u
        int idxA2 = str.lastIndexOf("a");
        System.out.println(idxA2);//9


        String s = "Missisippi";//indeksOf() hem String hem de char ile kullanilmali.
        int idxI = s.lastIndexOf('i');
        System.out.println(idxI);//1

        int idxIss1 = s.indexOf("iss");//Ilk gorunumun "ilk " karakterinin indexsini verir


        int idxIss2 = s.lastIndexOf("iss");//son gorunumum "ilk" karakterinin indexsini verir

        //Example:Bir Stringdeki bir karakterin tekrarli veya tekrarsiz olup olmadigini gosteren koduyaziniz
        //              "Helloooo" ==>--->H--->Tekrarsiz   e--->Tekrarsiz     l--->Tekrarli     o------->Tekrarli


        String t = "Helllllo";
        char c ='e';

        if (t.indexOf(c)==t.lastIndexOf(c))
        {

            System.out.println("Tekrarsiz");

        }else{
            System.out.println("Tekrarli");
        }


        String v = "";

        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);


        String dolu = "  ";

        boolean doluMU = dolu.isBlank();
        System.out.println(doluMU);


String m ="Hello everyone!";
 int e =m.lastIndexOf("e",7);
        System.out.println(e);

        }







    }



