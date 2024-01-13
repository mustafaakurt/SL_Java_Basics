import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        // if kullan
        // Girilen 3 sayiyi "kucukten buyuge" siralayan programi yaziniz.

        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.print("1. sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        sayi3 = input.nextInt();

        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            if (sayi2 <= sayi3) {
                System.out.println("Küçükten büyüğe sıralanışı: " + sayi1 + ", " + sayi2 + ", " + sayi3);
            } else {
                System.out.println("Küçükten büyüğe sıralanışı: " + sayi1 + ", " + sayi3 + ", " + sayi2);
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            if (sayi1 <= sayi3) {
                System.out.println("Küçükten büyüğe sıralanışı: " + sayi2 + ", " + sayi1 + ", " + sayi3);
            } else {
                System.out.println("Küçükten büyüğe sıralanışı: " + sayi2 + ", " + sayi3 + ", " + sayi1);
            }
        } else {
            if (sayi1 <= sayi2) {
                System.out.println("Küçükten büyüğe sıralanışı: " + sayi3 + ", " + sayi1 + ", " + sayi2);
            } else {
                System.out.println("Küçükten büyüğe sıralanışı: " + sayi3 + ", " + sayi2 + ", " + sayi1);
            }
        }

        input.close();
    }
}
