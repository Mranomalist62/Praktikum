package Unguided;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
public abstract class employee {
    protected String nama;
    protected int NIP;

    public employee(){

    };

    public employee(String nama, int NIP){
        this.nama = nama;
        this.NIP = NIP;
    }

    public double hitungGaji(double upah){
        return 0;
    }

    public void cetakInformasi(){
        System.out.println("Nama            :" + this.nama);
        System.out.println("NIP             :" + this.NIP);
    }

    
}
