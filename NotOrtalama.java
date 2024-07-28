package Basic;
import java.util.Scanner;
public class NotOrtalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double average = 0.0;
        //Kullanıcıdan notlar alınır
        System.out.println("Matematik sınav sonucunu girin: ");
        int mat = input.nextInt();

        System.out.println("Fizik sınav sonucunu girin:");
        int fizik = input.nextInt();

        System.out.println("Kimya sınav sonucunu girin: ");
        int kimya = input.nextInt();

        System.out.println("Türkçe sınav sonucunu girin: ");
        int turkce = input.nextInt();

        System.out.println("Tarih sınav sonucunu girin: ");
        int tarih = input.nextInt();

        System.out.println("Müzik sınav sonucunu girin: ");
        int muzik = input.nextInt();
        //Ortalaması bulunuyor
        average = (double)(mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalamanız: " + average);
        //Sınıfı geçme durumu ele alınıyor
        String result = average > 60.0 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(result);
    }
}
