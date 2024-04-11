package unguided1;

/*
 * Author Mario Firdaus Abdillah
 * NIM 221102296
 * CLASS S1IF-10Q
 */

public class Manajer extends Pegawai{
    private int TunjanganTahun;
    private int gajiPokok;
    private String divisi;

    public Manajer(){
        super();
    };

    public void setManajer(String nama, String NIP, String alamat, int tahunMasuk, int gajiPokok, String divisi){
        this.SetPegawai(NIP,nama,alamat,tahunMasuk);
        this.setTunjanganTahun();
        this.setDivisi(divisi);
        this.setGajiPokok(gajiPokok);  
    }

    public void setDivisi(String divisi){
        this.divisi = divisi;
    }

    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public void setTunjanganTahun(){
        if((2015 - this.getTahunMasuk()>= 3) && (2015 - this.getTahunMasuk() <5)){
            this.TunjanganTahun = 5;
        }
        else if((2015 - this.getTahunMasuk()>= 5)){
            this.TunjanganTahun = 10;
        }
        else {
            this.TunjanganTahun = 0;
        }
    }

    public void setTunjanganTahun(int Tahun){
        if((Tahun - this.getTahunMasuk()>= 3) && (Tahun - this.getTahunMasuk() <5)){
            this.TunjanganTahun = 5;
        }
        else if((Tahun + this.getTahunMasuk()>= 5)){
            this.TunjanganTahun = 10;
        }
        else {
            this.TunjanganTahun = 0;
        }
    }

    public int HitungGajiAkhir(){
        if((2015 - this.getTahunMasuk())>= 3 && (2015 - this.getTahunMasuk() <5)){
            int gajiAkhir = gajiPokok + (gajiPokok * 5/100);
            return gajiAkhir;
        }

        else if((2015 - this.getTahunMasuk())>= 5){
            int gajiAkhir = gajiPokok + (gajiPokok*10/100);
            return gajiAkhir;
        
        }

        else{
            return 0;
        }


    }

    public void cetakManajer(){
        System.out.println("\n");
        System.out.println("NIP             : " + this.getNIP());
        System.out.println("nama            : " + this.getNama());
        System.out.println("alamat          : " + this.getAlamat());
        System.out.println("Tahun Masuk     : " + this.getTahunMasuk());
        System.out.println("Divisi          : " + this.divisi);
        System.out.println("Tunjangan       : " + this.TunjanganTahun + "% Gaji Pokok");
        System.out.println("Gaji            : " + this.HitungGajiAkhir());
    }

}
