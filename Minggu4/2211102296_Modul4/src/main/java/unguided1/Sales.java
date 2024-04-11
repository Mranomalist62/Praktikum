package unguided1;

/*
 * Author Mario Firdaus Abdillah
 * NIM 221102296
 * CLASS S1IF-10Q
 */

public class Sales extends Pegawai{
    private int gajiPokok;
    private int jumlahRekrut;

    public Sales(){
        super();
    }

    public void setSales(String nama, String NIP, String alamat, int tahunMasuk, int gajiPokok, int jumlahRekrut){
        this.SetPegawai(NIP,nama,alamat,tahunMasuk);
        this.setJumlahRekrut(jumlahRekrut);
        this.setGajiPokok(gajiPokok);    
    }

    public void setJumlahRekrut(int jumlahRekrut){
        this.jumlahRekrut = jumlahRekrut;
    }

    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public int HitungGajiAkhir(){
        int gajiAkhir = gajiPokok + (50000*this.jumlahRekrut);
        return gajiAkhir;
    }

    public void cetakSales(){
        System.out.println("\n");
        System.out.println("NIP             : " + this.getNIP());
        System.out.println("nama            : " + this.getNama());
        System.out.println("alamat          : " + this.getAlamat());
        System.out.println("Tahun Masuk     : " + this.getTahunMasuk());
        System.out.println("Jumlah Rekrut   : " + this.jumlahRekrut);
        System.out.println("Gaji            : " + this.HitungGajiAkhir());
    }

}
