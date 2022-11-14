package day18arraylistpassbyvalue;

public class PsaaByValue01 {

    public static void main(String[] args) {
/*
    1)Java variable'ların orijinal değerlerini korumak ister.
    2)Variable method'lar içinde kullanıldığında, Java method'un içine orijinal değeri koymaz, o değerin kopyasını üretir.
            ve method'a o kopyayı yollar. Method kopya üstünde değişiklik yapar, dolayısıyla variable'ın
            orijinal değer korunmuş olur.
            Bu sisteme "PassByValue" denir.
            Note: Java "Pass By Value" kullanır.
            Note: Bazı programlama dilleri orijinal değeri koruma altına almamıştır. Bu işi developer'lara bırakmıştır.
            Bu tarz diller "Pass By Reference" kullanır.
 */

        int x =5;//Gomlek
        int ucret =100;
        System.out.println(x);//5
        int kopya =indirim(ucret);



        //static metot olan main method un icindeki hersey
        //static olmalidir
        change(x);//Ogrenci gomlegi
        System.out.println(x);//5
        }

public static void change (int a){
    System.out.println(a*3);
}
//void disindaki "return" type larda method body si icinda  "return" keyword kullanilmalidir.
public static int indirim(int gomlekUcreti){
        return gomlekUcreti - 10;
}

    }

