package Nama_Binatang;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
import java.util.Random;

public class CobaPolimorpic{
    public static void main(String[] args){
        Binatang[] peliharaanku = {
            new Burung("Kakak tua"),
            new Kucing("Kuceng"),
            new Anjing("Ubek"),
            new Kambing("Milkmaker")
        };

        Binatang kesayangan;
        Random pilihan = new Random();

        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)];

        System.out.println("Binatang kesayangan anda: " + kesayangan);
        System.out.println("Suaranya: ");
        kesayangan.suara();
    }
}
