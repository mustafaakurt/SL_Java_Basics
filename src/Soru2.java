import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        // Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %10 ,
        // tutar 1000 TL'den buyuk ise KDV oranini %22 olarak KDV tutari hesaplayan programi yaziniz.

        Scanner input = new Scanner(System.in);
        int girilenTutar,kdv = 0;
        System.out.print("Tutarı Giriniz: ");
        girilenTutar = input.nextInt();
        if (girilenTutar > 0 && girilenTutar <= 1000){
            kdv = 10;
        } else if (girilenTutar > 1000) {
            kdv = 22;
        }
        System.out.println("KDV Tutarı: " + kdv);
        System.out.println("KDV'li Tutar: " + (girilenTutar + girilenTutar*kdv/100));

        input.close();

    }
}
