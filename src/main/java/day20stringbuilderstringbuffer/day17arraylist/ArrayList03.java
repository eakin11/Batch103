package day20stringbuilderstringbuffer.day17arraylist;

import java.util.*;

public class ArrayList03 {


    public static void main(String[] args) {

        //Example 1 : Bir List teki elemanlardan biribirine en yakin olan ikisini bulunuz
        //            [12,15,19,30,21]  ==> 19 ve 21

//        List<String> a = new ArrayList<>();
//        a.add("12");
//        a.add("19");
//        a.add("15");
//        a.add("30");
//        a.add("21");
//        System.out.println(a);
//
//
//        Collections.sort(a);//List teki elemanlari kucukten buyuge dizebilmek icin kullanilir.
//        System.out.println(a);
//
//
//
//        int minFark = Integer.MAX_VALUE;
//
//        for (int i =1;i<a.size(); i++){
//
//         //   minFark= Math.min(minFark, a.get(i) - a.get(i-1));
//
//
//        }
//


//        int arr[] = {11, 12, 13, 14};
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(arr[arr.length-2]);
//
//        System.out.println(arr[1]);
//
//        for(int i=0; i<4; i++) {
//            System.out.print(arr[i] + " ");
//
//
//        }

//        int arr[] = {2, 11, 0, 23, 7};
//        //  Arrays.sort(arr);
//        //  System.out.print(arr[arr.length-1]);
//
//        // Arrays.sort();
//        // System.out.print(arr[arr.length-1]);
//
//        //   Arrays.sort(arr);
//        //   System.out.print(arr[arr.length-1]);
//
//          Arrays.sort(arr);
//          System.out.print(arr.length);


//        char arrCh[] = {'a', 'C', 'c', 'A', 'b'};
//        Arrays.sort(arrCh);
//        System.out.println(Arrays.toString(arrCh));


//        int arr[] = {2, 11, 0, 23, 7};
//        Arrays.sort(arr);//0,2,7,11,23
//        for(int i=4; i>=0; i--) {
//            System.out.print(arr[i] + " ");
//        }


//        int arr1[] = {1, 2, 3};
//        int arr2[] = {1, 2, 3};
//
//           System.out.println(arr1==arr2);
//           System.out.println(arr1==arr1);
//           System.out.println(Arrays.equals(arr1, arr2));
//          System.out.println(arr1.equals(arr2));


//        int arr[] = {1, 23, 12, 2, 3};
//         Arrays.sort(arr);//1,2,3,12,23
//         System.out.println(Arrays.binarySearch(arr, 12));
//
//      System.out.println(Arrays.binarySearch(arr, 12));
//          Arrays.sort(arr);

        //  System.out.println(Arrays.binarySearch(12));
        //  System.out.println(Arrays.binarySearch(12));

//
//        int arr[] = {12, 23, 12, 2, 3};
//        Arrays.sort(arr);//2,3,12,12,23
//        System.out.println(Arrays.binarySearch(arr, 12));

//        int arr[] = {12, 23, 12, 2, 3};
//        Arrays.sort(arr);//2,3,12,23
//        System.out.println(Arrays.binarySearch(arr, 5));
//
//        int arr[] = {3, 2, 3, 4, 4, 5};
//        int count = 0;//1,
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i]==3) {
//                count++;
//            }
//        }
//        System.out.println(count);


//        char arr[] = new char[4];
//        arr[0] = 'A';
//        arr[2] = 'E';
//        arr[3] = 'M';
//        System.out.println(Arrays.toString(arr));


//
//            ArrayList<String> list = new ArrayList<String>();
//            list.add("A");
//            list.add("B");
//            list.add("F");
//            list.add("D");

        //  System.out.println(list);

//   list.set( 2, "C" );
        //  System.out.println(list);//true

        //   list.add(1,"*");//[A, *, B, F, D]
        // System.out.println(list);

        //  System.out.println(list.contains("F"));//true

        //   System.out.println(list.isEmpty());//false

//        ArrayList<String> list = new ArrayList<String>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+ "");
//        }


//        ArrayList<String> list = new ArrayList<String>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.remove(3);
//        list.remove("A");
//        System.out.println(list);
//
//

//        ArrayList<String> list = new ArrayList<String>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//    System.out.println(list.remove(2));
//      System.out.println(list.remove("C"));//boolean sonuc verir


//
//        int arr[] = new int[5];
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = 1; i <= arr.length; i++) {
//            list.add(i);
//        }
//        System.out.println(list);

//        ArrayList<Character> list = new ArrayList<Character>();
//        for (char i = 'a'; i <= 'e' ; i++) {
//            list.clear();
//            list.add(i);
//        }
//        System.out.println(list);


        // List<Character> list = new ArrayList<Character>();
        //  List<int> list = new ArrayList<>();
        //   ArrayList<> list = new ArrayList<String>();
        //  ArrayList<boolean> list = new ArrayList<>();

//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(5);
//        list.add(7);
//        list.add(9);//[3,5,7,9]
//        int i = 0;
//        int x = 0;
//        while(i<list.size()) {
//            x = x + list.get(i);
//            i++;
//        }
//        System.out.println(x);

//        int arr[] = {2, 4, 6, 8};
//        List<Integer> list = new ArrayList<>();
//        int i = 0;
//        do {
//            list.add(arr[i]);
//            i++;
//        } while (i < arr.length);
//        System.out.println(list);

//        List<Integer> list2 = new ArrayList<>();
//        list2.add(5);
//        list2.add(2);
//        list2.add(4);
//        list2.add(3);
//        list2.add(1);
//        list2.remove(4);
//        System.out.println(list2);


        //  int arr[] = new int[4];
        //   arr[0]=11; arr[1]=12; arr[2]=13; arr[3]=14;
        //  int arr[] = {11, 12, 13, 14};


        //    int arr[] = {11, 12, 13, 14};

//        for(int i=0; i<4; i++) {
//            System.out.print(arr[i] + " ");
//        }


        //   System.out.println(arr[1]);

//        int arr[] = {2, 11, 0, 23, 7};
//        Arrays.sort(arr);
//        System.out.print(arr[arr.length-1]);


//        char arrCh[] = {'a', 'C', 'c', 'A', 'b'};
//        Arrays.sort(arrCh);
//        System.out.println(Arrays.toString(arrCh));
//
//        int arr[] = {2, 11, 0, 23, 7};
//        Arrays.sort(arr);//0,2,7,11,23
//        for(int i=4; i>=0; i--) {
//            System.out.print(arr[i] + " ");
//        }

//        int arr[] = {3, 2, 3, 4, 4, 5};
//        int count = 0;
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i]==3) {
//                count++;
//            }
//        }
//        System.out.println(count);
//

//        int x[] = { 3, 5, 7 };
//        int a = 0;
//        int b = 0;
//        while (a < x.length) {
//            b = b + x[a];//3+5+
//            a++;
//        }
//        System.out.println(b);


        //     String str= "Canan Can";
        //      System.out.println(str.startsWith("c"));//false
        //    System.out.println(str.endsWith("n"));//true
        //    System.out.println(str.startsWith("a",3));//true
//        System.out.println(str.endsWith("Can"));//true

        // String str = "Java code yaz";
        // System.out.println(str.substring(5));//false code yaz
        //  System.out.println(str.substring(12));//z
        //  System.out.println(str.substring(5,9));//true
        //  System.out.println(str.substring(8,8));//f


        //   String text = "Can, Cananlara gitmek için can atıyor";
        //  System.out.println(text.replace("Can", "Türk"));

//
//        String str = "Ayhan BEYHAN";
//      str.substring(0,5).toUpperCase();
//      str.substring(6).toLowerCase();
//        System.out.println(str);
//
//       str.replace("Ayhan","AYHAN");//true
//        str.replace("BEYHAN","beyhan");
//        System.out.println(str);

        //    str.replace('Ayhan','AYHAN');
        //    str.replace('BEYHAN','beyhan');

        //    str.replace(str.substring(0),"AYHAN beyhan");
        //      System.out.println(str);


//for(int i=1; i<6;i++){
//
//    System.out.println(i+"-");

//        for(int i=1 ;i<10;i++){  //1,2,3,4,5,6,7,8,9
//            System.out.println(i);
//        }

//        System.out.println();
//        for(int i=1;i<10;i=i+2){
//            System.out.println(i);//1,3,5
//        }
//        System.out.println();
//        for(int i=9;i>=1;i-=2){
//        System.out.println(i);//7,5,3,1
////        }
//        System.out.println();
//
//        for (int i=1;i<=9;i++){
//            System.out.println(i);//1,
//            i++;
//        }

//

        //    String str = "Java";
        //   System.out.println(str.replace("", "/"));///J/a/v/a/


        //    String str = "Java";
        //    System.out.println(str.replace("", "/"));//  /J/a/v/a/

//        String str ="Java";
//        System.out.println(str.replace("","/"));
//
//        String str = "Java";
//        System.out.println(str.replace("","/"));
//
//        String str = "Java";
//        System.out.println("","/");
//
//


        //  String s = "Java is Java";

//        System.out.println(s.indexOf('a'));//1

        // System.out.println(s.indexOf("Java"));//0
//
        //   System.out.println(s.indexOf('a',4));//9
//
        //      System.out.println(s.indexOf("va",2));//2


        //  String s = "Java is Java";

//10System.out.println(s.lastIndexOf('v'));//10
//System.out.println(s.lastIndexOf("va"));//10
//System.out.println(s.toUpperCase().lastIndexOf("V"));//10
//System.out.println(s.toLowerCase().lastIndexOf("j"));//8


        String s = "Learn";
        String t = "Java";

        //  System.out.println((s.concat(t)).length());//9
        // System.out.println("" + s.length() + t.length());
        // System.out.println(s.concat(t).length());
        System.out.println(s.length() > s.charAt(2));


    }


    }




















