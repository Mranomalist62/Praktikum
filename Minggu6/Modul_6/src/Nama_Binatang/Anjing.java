package Nama_Binatang;

/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */

public class Anjing extends Binatang{
    private String nama;

    Anjing(String nama){
        super("Anjing");
        this.nama = nama;
    }

    public void suara(){
        System.out.println("Menggong-gong");
    }

    public String toString(){
        return super.toString()+ " " +nama;
    }

}
