import java.util.Arrays;
import java.util.Collection;

public class Arrays01 {

    public static void main(String[] args) {

/*
Ayni Data tipinde, coklu data i depolamak icin Javanin olusturdugu pailar vardir.
Bu yapilardan birisi de "Array" lerdir.

 */
//Array olusturma
int stdAges[]= new int[7];//[0,0,0,0,0,0,0]


        //Array nasil yazdirilir?

        System.out.println(Arrays.toString(stdAges));//[0, 0, 0, 0, 0, 0, 0]

//Arraylere elemanlar nasil eklenir
        stdAges[0]=12;
        stdAges[1]=11;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;

        System.out.println(Arrays.toString(stdAges));//[12, 11, 13, 14, 10, 12, 12]


        //Arraydaki herhangi bir elemani yazdirma
        System.out.println(stdAges[4]);//10


        //Example 1:Arraydeki en kucuk ve en buyuk elemani ekrana yazdiriniz

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]

int ilk = stdAges[0];
int son = stdAges[stdAges.length-1];

        System.out.println(ilk+son);//24   //12+12=24


  //Example 2 stdAges Array i icindeki tum elemanlarin toplamini ekrana yazdiriniz

  //1.Yol//84
int sum = 0;
    for(  int i = 0       ;  i<stdAges.length        ;    i++       ) {

    sum = sum + stdAges[i];

    }


            System.out.println(sum);

  //2.Yol//84

  int i =0;
int toplam =0;
  while (i<stdAges.length){
toplam=toplam+stdAges[i];


      i++;
  }

        System.out.println(toplam);




  //3.Yol//84

   int k=0;

   int s=0;

   do{

s=s + stdAges[k];
k++;
   }while(k<stdAges.length);


        System.out.println(s);



   //4.Yol :For each loop Arraylerde ve collectionlarda kullanilir//84
       int t =0;



        for(int w : stdAges){


            t=t+w;
        }

    //Example 3:String bir Array  olusuturunuz
    //Bu isimlerdeki karakter sayilarinin toplaminin ekrana yazdiriniz



    String stdNames[]=new String[5];
        stdNames[0]="Ali";
        stdNames[1]="Tom";
        stdNames[2]="Veli";
        stdNames[3]="Kemal";
        stdNames[4]="Cem";

        int karakterSayilariToplami =0;

        for(String w : stdNames){

            karakterSayilariToplami   = karakterSayilariToplami+w.length();

        }


        System.out.println(karakterSayilariToplami);//18






//Example4  : Char bir array olusturununuz.Bu array e 5 eleman ekleyiniz.Bu arrayda sadece buyuk harfleri ekrana yazdiriniz//ADM

        char ch [] ={'A','c','D','k','M'};

        for(char w : ch){

            if(w>='A'&& w<='Z'){

                System.out.print(w);
            }
        }
























    }





}
