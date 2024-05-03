package Nama_Binatang;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
public class Burung extends Binatang{
    private String nama;

    Burung(String nama){
        super("Burung");
        this.nama = nama;
    }

    public void suara(){
        System.out.println("Berkicau");
    }

    public String toString(){
        return super.toString()+ " " +nama;
    }

}
