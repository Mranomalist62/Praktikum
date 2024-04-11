package unguided1;

/*
 * Author Mario Firdaus Abdillah
 * NIM 221102296
 * CLASS S1IF-10Q
 */

import java.util.Set;

public class Pegawai {
    private String NIP;
    private String nama;
    private String alamat;
    private int tahunMasuk;
    
    public Pegawai(){
        
    }

    public void SetPegawai(String NIP, String nama, String alamat, 
                        int tahunMasuk){
        this.setNIP(NIP);
        this.setNama(nama);
        this.setAlamat(alamat);
        this.setTahunMasuk(tahunMasuk);   
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setTahunMasuk(int tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }

    public String getNIP(){
        return this.NIP;
    }

    public String getNama(){
        return this.nama;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public int getTahunMasuk(){
        return this.tahunMasuk;
    }


}
