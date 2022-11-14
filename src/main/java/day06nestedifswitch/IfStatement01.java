package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Kullanicidan yas degerini alan ve yasi hangi evrede oldugunu asagidaki tabloya gore ekrana yazdirin
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmami evre

       Scanner input = new Scanner((System.in));
        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        if(yas<0){
            System.out.println("Lufen gecerli yas giriniz");

        }else if(yas<5){
            System.out.println("Bebek");
        }else if (yas<13){
            System.out.println("cocuk");

        }else if (yas<21){
            System.out.println("genç");
        } else if (yas<31) {
            System.out.println("yetiskin");
        }   else {
                System.out.println("Tanıimlanmamis evre");
            }

        }


    }




