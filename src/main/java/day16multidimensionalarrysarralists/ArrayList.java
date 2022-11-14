package day16multidimensionalarrysarralists;

import java.awt.*;

public class ArrayList<I extends Number> {

    public static void main(String[] args) {

        /*
 ArrayList ler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir
 Array ile ArrayList in farki nedir?
 1)Array olustururken Array in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz
   Array'ler eleman sayisinda "fixed" dirler.
   ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,cunku ArrayList'ler eleman sayisinda "flexible(esnek) dirler.

 2)Array lerin icine    "primitive" ve "referance" lar konabilir
 Arraylistlerin icine ise sadece "non-primitive" konulur.

 3)Arrayler super fast , cok hizli.Array'ler memeory i cok az kullanir.
 Note :Eleman sayisi kesin belli olan coklu datalari depolama icin Array kullaniriz, ama eleman sayisi degisken olan coklu datalar icin Array
 kullanma riskini almayin
 */
//Arraylist nasil oluturulur
        //1.Yol

      //2.Yol
        java.util.ArrayList heigts = new java.util.ArrayList();

        //3.Yol



       //ArrayList ler nasil yazdirilir
        System.out.println(heigts);


        //aRRAYlIST E NASIL ELEMAN EKLENIR?
        //add() herzaman en sona ekler
        heigts.add(21);
        heigts.add(18);
        heigts.add(20);




        System.out.println(heigts);//[21, 18, 20]

        heigts.add(1,50);
        System.out.println(heigts);  //[21, 50, 18, 20]





















    }






}
