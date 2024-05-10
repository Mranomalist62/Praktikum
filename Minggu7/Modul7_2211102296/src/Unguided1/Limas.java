package Unguided1;

/*
 * MARIO FIRDAUS ABDILLAH
 * 2211102296
 * S1IF10G
*/

public class Limas {

    SgtSamaSisi segitiga;
    Persegi persegi;

    public Limas(){

    }

    public Limas(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        segitiga = new SgtSamaSisi(x1, y1, x2, y2);
        persegi = new Persegi(x3, y3, x4, y4);
    }


    public double hitungLuas(){
        return (4*segitiga.hitungLuas())+persegi.hitungLuas();
    }

    public void tampil(){
        segitiga.tampil();
        persegi.tampil();
        System.out.println("Luas Limas      : " + hitungLuas());
    }
}
