package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        for(String w :myList){
            w=w+"!";
        }


        System.out.println(myList);


        ListIterator<String> itr = myList.listIterator();

        while(itr.hasNext()){
            String el = itr.next();
            itr.set(el + "!");
        }

        System.out.println(myList);




    }

}
