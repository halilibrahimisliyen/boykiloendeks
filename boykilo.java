import java.util.Scanner;

public class boykilo{

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        double boy, kilo, endesk;
        System.out.println("Lütfen kilonuzu giriniz:  ");
        kilo=input.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz: ");
        boy=input.nextDouble();
        endesk=kilo/boy*boy;
        System.out.println("Vücut endeksiniz:  "+endesk);
    }
}