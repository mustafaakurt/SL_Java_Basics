import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        // if kullan
        // Kullanicidan bir sayi girmesini isteyen ve girilen sayinin
        // tek mi yoksa cift mi oldugunu belirleyen bir Java programini yazin.

        Scanner input = new Scanner(System.in);
        int girilenSayi;
        System.out.print("Bir sayı giriniz: ");
        girilenSayi = input.nextInt();
        if (girilenSayi == 0){
            System.out.println("Girilen sayı sıfırdır");
        }else if (girilenSayi % 2 == 0) {
            System.out.println("Girilen sayı çift bir sayıdır");
        }else {
            System.out.println("Girilen sayı tek bir sayıdır");
        }

        input.close();
    }
}
