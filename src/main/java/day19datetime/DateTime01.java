package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

     //Example 1:"Anlik tarihi(Current Date) ekrana yazdiran kodu yaziniz
        LocalDate cuurentDate = LocalDate.now();

        System.out.println(cuurentDate);//2022-10-21

        //Example 2:"Anlik zamani(Current Time ekrana yazdiran kodu yaziniz

        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);//20:41:56.774387500

        //Example 3:"Anlik tarihi  ve zamani yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:46:17.994128400

        //Example 4: Japonyadaki anlik tarihi "(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan =LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:50:56.725354700

        LocalDateTime currentDateTimeIstanbul =LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeIstanbul);//2022-10-21T20:54:11.565069600

        //Example 6 : Bu gunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz
        LocalDate countDate= LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        //Example 7 : Iki cocugunuzun dogum tarihleri arasindaki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);


        //between(dobAli,dobVeli ) method u kullanildiginda daha eski olan tarih once yazilmalidir
       Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff);///2824

        //Example 8 : Tom Ali' den 3 yil 8 ay 13 gun sonra dogdu.Ali ise Veliden 1 yil 15 gun once dogdu Tom un dogum tarihi
        //            Tom'un dogum tarihi 18 Kasim 2011 ise Veli ve Ali'nin dogum tarihlerini bulunuz


      //Example 8 : Istanbul un fethi ile Cumhuriyetin kurulmasi arasinda kac ay oldugunu gosteren kodu bulunuz
        //          29 Mayis 1453===> Istanbul un fethi           29 Ekim 1923 ==> Cumhuriyetin kurulusu

        LocalDate IstanbulunFethi =LocalDate.of(1453,5,29);
        LocalDate cumhuruyetKurulus =LocalDate.of(1923,10,29);

       Long aySayisi = ChronoUnit.MONTHS.between(IstanbulunFethi,cumhuruyetKurulus);
        System.out.println(aySayisi);//5645


        //Example 9 : Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1993,15,2);
        int day = myDate.getDayOfMonth();
        int month =myDate.getMonthValue();

        System.out.println(day + " - " + month);




              }
          }



















