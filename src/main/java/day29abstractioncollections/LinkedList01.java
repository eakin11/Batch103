package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.
     */

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Anjeline Julie");
        visitors.add("Pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors);//[Tom, Hanks, Tom Hanks, Brad, Pitt, Brad Pitt]

        //LinkedList'ler ekleme ve silme islemlerinde basarili olduklarindan ekleme ve silme ile alakali cok fazla method icerir
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors);

        visitors.removeLast();
        System.out.println(visitors);



        visitors.removeFirst();
        System.out.println(visitors);

        visitors.removeFirstOccurrence("Tom Hanks");

        String firstEl = visitors.pop();



    }

}
