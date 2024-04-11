package unguided1;

public class Main {
    public static void main(String[] args) {
        MiniBus ABus = new MiniBus("22196","Hyundai",10000, 20, 30, "Sabuk Pengaman", 1500, "Bantal", "Pribadi");
        ABus.tampilInfo();
        ABus.hitungPajak();
    }
}
