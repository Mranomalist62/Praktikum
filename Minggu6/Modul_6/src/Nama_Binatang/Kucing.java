package Nama_Binatang;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
public class Kucing extends Binatang{
    private String nama;

    Kucing(String nama){
        super("Kucing");
        this.nama = nama;
    }

    public void suara(){
        System.out.println("Mengeong");
    }

    public String toString(){
        return super.toString()+ " " +nama;
    }

}
