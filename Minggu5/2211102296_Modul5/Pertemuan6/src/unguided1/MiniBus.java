package unguided1;

public class MiniBus{
    public Bus charBus;
    public Sedan charSedan;
    public String tipe;



    public MiniBus(){
    }

    public MiniBus( String noPlat, String merk, float pajak, int kapasitasPenumpang, int kapasitasBagasi,  
                    String fasilitasKeamanan, int kapasitasCC,String fasilitasKenyamanan, String tipe){
        
        this.charBus = new Bus(noPlat, merk, pajak, kapasitasPenumpang, kapasitasBagasi);
        this.charSedan = new Sedan(noPlat,merk ,pajak, fasilitasKeamanan, kapasitasCC, fasilitasKenyamanan);
        this.charBus.pajak = hitungPajak();
        this.charSedan.pajak = hitungPajak();
        this.tipe = tipe;
    }

    public void infoMinibus(){
        if(this.tipe =="Pribadi"){
            System.err.println("Tipe MiniBus            :Pribadi, digunakan sebagai kendaraan pribadi");
        }

        else{
            System.err.println("Tipe MiniBus            :Wagon digunakan sebagai kendaraan angkut/travel");
        }
    }

    public void tampilInfo(){
        this.charSedan.tampilInfo();
        this.charBus.infoBus();
        infoMinibus();
    }

    public float hitungPajak(){
        float pajak;
        if(this.tipe == "Pribadi"){
            pajak = (float)((this.charSedan.hitungPajak()*0.05)+
                    (this.charBus.hitungPajak()*0.03));
            return pajak;
        }
        else{
            pajak = (float)((this.charSedan.hitungPajak()*0.03)+(this.charBus.hitungPajak()*0.05));
            return pajak;
        }
    }


}
