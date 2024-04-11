package unguided1;

/*
 * Author Mario Firdaus Abdillah
 * NIM 221102296
 * CLASS S1IF-10Q
 */

public class Satpam extends Pegawai{
    private int gajiPokok;
    private int jamLembur;
  
    public Satpam(){
        super();
    }

    public void setSatpam(String nama,String NIP, String alamat, int tahunMasuk, int gajiPokok, int jamLembur){
        this.SetPegawai(NIP,nama,alamat,tahunMasuk);
        this.setGajiPokok(gajiPokok);
        this.setJamLembur(jamLembur);
    }

    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public void setJamLembur(int jamLembur){
        this.jamLembur = jamLembur;
    }

    public int HitungGajiAkhir(){
        int gajiAkhir = this.gajiPokok + (10000*this.jamLembur);
        return gajiAkhir;
    }

    public void cetakSatpam(){
        System.out.println("\n");
        System.out.println("NIP             : " + this.getNIP());
        System.out.println("nama            : " + this.getNama());
        System.out.println("alamat          : " + this.getAlamat());
        System.out.println("Tahun Masuk     : " + this.getTahunMasuk());
        System.out.println("Jam Lembur      : " + this.jamLembur);
        System.out.println("Gaji            : " + this.HitungGajiAkhir());
    }

}
