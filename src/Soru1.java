import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        // Kullanicidan alinan para degerinin KDV'li fiyatini ve
        // KDV tutarini hesaplayip ekrana bastiran programi yazin.

        Scanner input = new Scanner(System.in);
        double alınanPara;
        System.out.print("Alınan Para: ");
        alınanPara = input.nextDouble();
        System.out.println("KDV Tutarı: 30%");
        System.out.println("KDV'siz Fiyat: " + alınanPara);
        System.out.println("KDV'li Fiyat: " + alınanPara * 1.3);
        input.close();
    }
}
