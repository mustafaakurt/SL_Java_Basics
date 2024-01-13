import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        // Basit Hesap Makinesi
        // Kullanicidan iki sayi girmesini isteyen ve ardindan bu iki sayi uzerinde toplama,
        // cikarma, carpma ve bolme islemlerini gerceklestiren bir Java programi yazin.

        Scanner input = new Scanner(System.in);
        double sayi1;
        double sayi2;
        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = input.nextDouble();
        System.out.println("Girilen sayıların toplamı: " + (sayi1+sayi2));
        System.out.println("Girilen sayıların farkı: " + (sayi1-sayi2));
        System.out.println("Girilen sayıların çarpımı: " + (sayi1*sayi2));
        System.out.println("Girilen sayıların bölümü: " + (sayi1/sayi2));

        input.close();
    }
}
