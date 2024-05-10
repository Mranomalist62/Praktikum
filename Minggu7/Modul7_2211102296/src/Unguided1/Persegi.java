package Unguided1;

/*
 * MARIO FIRDAUS ABDILLAH
 * 2211102296
 * S1IF10G
*/

public class Persegi extends Titik{
    protected double sisiSPG;

    public Persegi(){
    }

    public Persegi(double x, double y, double x2, double y2){
        super(x,y);
        Titik T2 = new Titik(x2,y2);
        this.sisiSPG = this.hitungJarak(T2);
    }

    public double hitungLuas(){
        return sisiSPG*sisiSPG;
    }

    public void tampil(){
        System.out.println("======DATA PERSEGI======");
        super.tampil();
        System.out.println("sisi        : " + sisiSPG);
        System.out.println("Luas        : " + hitungLuas());
        System.out.println();
    }
}
