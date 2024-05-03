package Unguided;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
public class ProjectPlanner extends employee{

    double gajiPokok;
    double komisi;
    double totalProyek;

    public ProjectPlanner(){
    }

    public ProjectPlanner(String nama, int NIP, double gajiPokok, double komisi, double totalProyek){
        super(nama,NIP);
        this.komisi = komisi;
        this.totalProyek = totalProyek;
        this.hitungGaji(gajiPokok);
    }

    //melakukan override pada fungsi hitungGaji abstrak
    @Override
    public double hitungGaji(double upah) {
        this.gajiPokok = upah + (this.komisi*this.totalProyek) - (upah*5.0/100.0);
        return this.gajiPokok;
    }

        //melakukan override pada fungsi cetakInformasi abstrak
    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Komisi          :" + (int)this.komisi);
        System.out.println("total Proyek    :" + (int)this.totalProyek);
        System.out.println("Gaji            :" + (int)this.gajiPokok);
        System.out.println("");
    }
}
