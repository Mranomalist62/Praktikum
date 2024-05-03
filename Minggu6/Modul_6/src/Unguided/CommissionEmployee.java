package Unguided;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
public class CommissionEmployee extends employee{
    double gajiPokok;
    double komisi;
    double totalPenjualan;

    public CommissionEmployee(){
    }

    public CommissionEmployee(String nama, int NIP, double gajiPokok, double komisi, double totalPenjualan){
        super(nama,NIP);
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
        hitungGaji(gajiPokok);
    }

    @Override
    public double hitungGaji(double upah) {
        this.gajiPokok =  upah + (this.komisi*this.totalPenjualan);
        return this.gajiPokok;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Komisi          :" + (int)this.komisi);
        System.out.println("total Penjualan :" + (int)this.totalPenjualan);
        System.out.println("Gaji            :" + (int)this.gajiPokok);
        System.out.println("");
    }
}
