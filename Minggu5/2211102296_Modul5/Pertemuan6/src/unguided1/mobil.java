package unguided1;

public class mobil {
    public String noPlat;
    public String merk;
    public float pajak;


    public mobil(){

    }
    
    public mobil(String noPlat, String merk, float pajak){
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;  
    }

    public void tampilInfo(){
        System.err.println("Data Mobil");
        System.err.println("Nomor plat  :" + this.noPlat);
        System.err.println("Merk        :" + this.merk);
        System.err.println("pajak       :" + this.pajak);
    }
}
