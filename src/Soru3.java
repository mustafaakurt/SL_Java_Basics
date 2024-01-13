import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        // Not Hesaplama
        // Kullanicidan bir ogrencinin sinav notunu girmesini isteyen ve
        // bu notun harf notunu hesaplayarak ekrana yazdiran bir Java programi yazin.
        // (Ornegin, 90-100 arasi AA, 80-89 arasi BA, 70-79 arasi BB, 60-69 arasi CB,
        // 50-59 arasi CC, 0-50 arasi FF)

        Scanner input = new Scanner(System.in);
        int alınanNot;
        System.out.print("Sınav Notunuzu Giriniz: ");
        alınanNot = input.nextInt();
        if (alınanNot <= 100 && alınanNot >= 90){
            System.out.println("Harf Notu: AA");
        }else if (alınanNot <= 89 && alınanNot >= 80){
            System.out.println("Harf Notu: BA");
        }else if (alınanNot <= 79 && alınanNot >= 70){
            System.out.println("Harf Notu: BB");
        }else if (alınanNot <= 69 && alınanNot >= 60){
            System.out.println("Harf Notu: CB");
        }else if (alınanNot <= 59 && alınanNot >= 50){
            System.out.println("Harf Notu: CC");
        }else if (alınanNot <= 50 && alınanNot >= 0){
            System.out.println("Harf Notu: FF");
        }else {
            System.out.println("Geçersiz bir giriş yaptınız...");
        }


        input.close();


    }
}
