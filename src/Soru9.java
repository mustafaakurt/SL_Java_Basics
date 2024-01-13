import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        // Switch-case kullan
        // Kullaniciya hangi geometrik seklin alanini hesaplamak istedigini sorun.
        // Ardindan, secilen sekle gore gerekli bilgileri alarak alani hesaplayin. (1-Dikdortgen, 2-Kare, 3-Ucgen)

        Scanner input = new Scanner(System.in);
        int sekilSecimi;
        double sayi1,sayi2,sayi3;
        System.out.print("Alanı hesaplanacak şekli seçiniz (1-Dikdortgen, 2-Kare, 3-Ucgen): ");
        sekilSecimi = input.nextInt();
        switch (sekilSecimi){
            case 1:
                System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
                sayi1 = input.nextDouble();
                System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
                sayi2 = input.nextDouble();
                System.out.println("Dikdörtgenin alanı: " + sayi1 * sayi2);
                break;
            case 2:
                System.out.print("Karenin bir kenarını giriniz: ");
                sayi1 = input.nextDouble();
                System.out.println("Karenin alanı: " + sayi1 * sayi1);
                break;
            case 3:
                System.out.print("Üçgenin tabanını giriniz: ");
                sayi1 = input.nextDouble();
                System.out.print("Üçgenin yüksekliğini giriniz: ");
                sayi2 = input.nextDouble();
                System.out.println("Üçgenin alanı: " + sayi1 * sayi2 / 2);
                break;
            default:
                System.out.println("Geçersiz bir şekil seçimi yaptınız...");
                break;
        }

        input.close();


    }

}
