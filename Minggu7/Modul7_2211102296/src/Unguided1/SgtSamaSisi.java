package Unguided1;

/*
 * MARIO FIRDAUS ABDILLAH
 * 2211102296
 * S1IF10G
*/

public class SgtSamaSisi extends Titik{
    protected double sisiSGT;
    
    public SgtSamaSisi(){
    }

    public SgtSamaSisi(double x, double y, double x2, double y2){
        super(x,y);
        Titik T2 = new Titik(x2,y2);
        this.sisiSGT = this.hitungJarak(T2);
    }
    public double hitungLuas(){
        return 0.5*sisiSGT*Math.sqrt(3);
    }

    public void tampil(){
        System.out.println("======DATA SEGITIGA======");
        super.tampil();
        System.out.println("Sisi        : "+sisiSGT);
        System.out.println("Luas        : "+hitungLuas());
        System.out.println();
    }
}
