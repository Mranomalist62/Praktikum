package Nama_Binatang;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
public abstract class Binatang {
    private String jenis;

    Binatang(String jenis){
        this.jenis = jenis;
    }

    protected abstract void suara();

    public String toString(){
        return "Seekor " + jenis;
    }
}
