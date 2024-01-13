import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        // Switch-case kullan
        // Kullanicdan iki deger alan ve kullanicinin toplama,cikarma,bolme,carpma
        // islemlerinden birisini sectigi bir hesap makinesi uygulamasi yapin

        Scanner input = new Scanner(System.in);
        double sayi1,sayi2;
        char islem;
        System.out.print("1. sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.print("Yapılacak işlemi (+-*/) giriniz:");
        islem = input.next().charAt(0);
        switch (islem){
            case '+':
                System.out.println("Yapılan işlem: " + sayi1 + " + " + sayi2 + " = " + sayi1+sayi2);
                break;
            case '-':
                System.out.println("Yapılan işlem: " + sayi1 + " - " + sayi2 + " = " + (sayi1-sayi2));
                break;
            case '*':
                System.out.println("Yapılan işlem: " + sayi1 + " * " + sayi2 + " = " + sayi1*sayi2);
                break;
            case '/':
                System.out.println("Yapılan işlem: " + sayi1 + " / " + sayi2 + " = " + sayi1/sayi2);
                break;
            default:
                System.out.println("Geçersiz bir işlem girildi...");
                break;
        }
        input.close();

    }
}
