package unguided1;

public class Sedan extends mobil{
    public String fasilitasKeamanan;
    public int kapasitasCC;
    public String fasilitasKenyamanan;
    
    
    public Sedan(){
        super();
    }

    public Sedan(String noPlat, String merk, float pajak, String fasilitasKeamanan, int kapasitasCC,String fasilitasKenyamanan){
        super(noPlat,merk,pajak);
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.kapasitasCC = kapasitasCC;       
        this.fasilitasKenyamanan = fasilitasKenyamanan;
    }

    public void infoSedan(){
        System.err.println("Fasilitas keamanan      :" + this.fasilitasKeamanan);
        System.err.println("Kapasitas CC            :" + this.kapasitasCC);
        System.err.println("Fasilitas kenyamanan    :" + this.fasilitasKenyamanan);
    }

    @Override
    public void tampilInfo(){
        System.err.println("Data Mobil");
        System.err.println("Nomor plat              :" + this.noPlat);
        System.err.println("Merk                    :" + this.merk);
        System.err.println("pajak                   :" + this.pajak);
        this.infoSedan();
    }

    public float hitungPajak(){
        this.pajak = (float)(this.pajak + (this.pajak* this.kapasitasCC * 0.00005));
        return this.pajak;
    }
}
