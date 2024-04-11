package unguided1;

public class Bus extends mobil{
    public int kapasitasPenumpang;
    public int kapasitasBagasi;

    public Bus(){
        super();
    }
    
    public Bus(String noPlat, String merk, float pajak, int kapasitasPenumpang, int kapasitasBagasi){
        super(noPlat,merk,pajak);
        this.kapasitasBagasi = kapasitasBagasi;
        this.kapasitasPenumpang = kapasitasPenumpang;        
    }

    public void infoBus(){
        System.err.println("Kapasitas Penumpang     :" + this.kapasitasPenumpang);
        System.err.println("Kapasitas Bagasi        :" + this.kapasitasBagasi);
    }

    @Override
    public void tampilInfo(){
        System.err.println("Data Mobil");
        System.err.println("Nomor plat              :" + this.noPlat);
        System.err.println("Merk                    :" + this.merk);
        System.err.println("pajak                   :" + this.pajak);
        this.infoBus();
    }

    public float hitungPajak(){
        this.pajak = (float)(pajak + (pajak * kapasitasPenumpang * kapasitasBagasi * 0.0005));
        return this.pajak;
    }
    
    
}
