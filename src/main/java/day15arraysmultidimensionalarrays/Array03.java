package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
  //Example 1: Bir Stringdeki sesli harflerin sayisini bulankodu yaziniz
  //  a-e-i-o-u,-A-E-I-O-U
        String str = "Java ogrenince para kazanmak kolay ,ogrenmeyince ne kolay ki.";

       String harfler[] = str.split("");
       int counter = 0;

        System.out.println(Arrays.toString(harfler));

for (String w : harfler){
    switch (w){
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
          counter++;
    }

    }
        System.out.print(counter);
}




    }






