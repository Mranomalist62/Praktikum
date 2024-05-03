package Nama_Binatang;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
public class Kambing extends Binatang{
    private String nama;

    Kambing(String nama){
        super("Kambing");
        this.nama = nama;
    }

    public void suara(){
        System.out.println("Mengembik");
    }

    public String toString(){
        return super.toString()+ " " +nama;
    }

}
