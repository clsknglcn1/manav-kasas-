import java.util.Scanner;
public class manav {
    public static void main(String[] args) {

        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz= 0.95;
        double Patlican = 5;
        double  toplam ;
        double kgarmut, kgelma, kgdomates, kgmuz, kgpatlican;
        



        Scanner greengrocer = new Scanner(System.in);



        // verileri tek tek ekrana yazdırma

        System.out.println("lütfen armut kg giriniz:");
        kgarmut= greengrocer.nextDouble();

        System.out.println("lütfen elma kg giriniz:");
        kgelma = greengrocer.nextDouble();

        System.out.println("lütfen domates kg giriniz:");
        kgdomates = greengrocer.nextDouble();

        System.out.println("lütfen muz kg giriniz:");
        kgmuz= greengrocer.nextDouble();

        System.out.println("lütfen patlıcan kg giriniz:");
        kgpatlican= greengrocer.nextDouble();


        toplam= ( kgarmut*Armut)+(kgelma*Elma)+(kgdomates*Domates)+(kgpatlican*Patlican)+(kgmuz*Muz);



        System.out.println("toplam tutar:"+ toplam);









    }
}
