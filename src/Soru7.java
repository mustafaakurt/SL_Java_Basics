import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {

        // Switch-case kullan
        // Kullaniciya bir hava durumu kodu girmesini isteyin. Girdigi koda gore hava durumunu ekrana yazdirin.

        Scanner input = new Scanner(System.in);

        System.out.print("Hava durumu kodunu giriniz: ");
        int durumKodu = input.nextInt();

        String havaDurumu;
        switch (durumKodu) {
            case 1:
                havaDurumu = "Güneşli";
                break;
            case 2:
                havaDurumu = "Bulutlu";
                break;
            case 3:
                havaDurumu = "Yağmurlu";
                break;
            case 4:
                havaDurumu = "Karlı";
                break;
            default:
                havaDurumu = "Geçersiz hava durumu kodu";
                break;
        }
        System.out.println("Hava durumu: " + havaDurumu);

        input.close();


    }
}
