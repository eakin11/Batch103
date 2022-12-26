package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;//Hesap numarasi
    private int pinNumber;//sifre

    private double checkingBalence;//vadesiz hesap bakiyesi
    private double savingBalance; // vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalence() {
        return checkingBalence;
    }

    public void setCheckingBalence(double checkingBalence) {
        this.checkingBalence = checkingBalence;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

   //para cekme   ==>paraCekmeIslemindenSonraKalanMiktar       miktar

    private double calculateCheckingBalanceAfterWithdraw(double amount){

        checkingBalence = checkingBalence-amount;
        return checkingBalence;
    }

    //para yatirma ==>para yatirma isleminden sonra kalan bakiyeyi hesappla

    private double calculateCheckingBalanceAfterDeposit(double amount){

        checkingBalence =checkingBalence+amount;

        return checkingBalence;

    }


    //para cekme: saving hesabindan para cekildikten sonra kalan bakiye
    private double calculateSavingBalaceAfterWithdraw(double amount ){

      savingBalance = savingBalance-amount;
        return savingBalance;
    }

    //para yatirma : saving hesabina para yatirdiktan sonra geri kalan bakiyeyi hesaplayiniz
    private double calculateSavingBalceAfterDeposit(double amount){
        savingBalance = savingBalance+amount;
        return savingBalance;

    }


    //Musteri ile para cekmek icin etkilesime gecme: checking hesap
    public void getCheckingWithdraw(){                 //cehecking hesabindan para cekme

        displayCurrentAmount(checkingBalence);
        System.out.println("Cekmek istediginiz miktari giriniz ");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir! ");
            getCheckingWithdraw();    //recursive method // methodu tekrardan cagirma
        }else if (amount<=checkingBalence){
            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalence);
        }else {
            System.out.println("Yetersiz bakiye ");
        }

    }


      //Para yatirma(checking) : Musteri ile para yatirmak icin etkilesime gecelim
    public void getCheckingDDeposiz(){
        displayCurrentAmount(checkingBalence);
        System.out.println("Yatirmak istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir! ");
            getCheckingDDeposiz();
        }else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(checkingBalence);//
        }
    }

    //Musteri ile para cekmek icin etkilesime gecme: saving hesap

    public void getSavingWithdraw() {                 //saving hesabindan para cekme
        displayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz ");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir! ");
            getSavingWithdraw();
        } else if (amount<= savingBalance) {
            calculateSavingBalaceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }else{
            System.out.println("Yetersiz bakiye");
        }
    }


    //Para yatirma(saving) : Musteri ile para yatirmak icin etkilesime gecelim
    public void getSavingDeposit(){
        displayCurrentAmount(savingBalance);
        System.out.println("Yatirmak istedigin meblayi giriniz");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir! ");
            getSavingDeposit();
        } else {
            calculateSavingBalceAfterDeposit(amount);
            displayCurrentAmount(savingBalance);
        }
    }






    //son bakiyeyi goster
    public void displayCurrentAmount(double balance){
        System.out.println(" hesabinizda bulunan bakiye: "+moneyFormat.format(balance));

    }





}