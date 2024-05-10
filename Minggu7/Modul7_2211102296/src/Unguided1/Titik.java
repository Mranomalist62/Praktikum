package Unguided1;

/*
 * MARIO FIRDAUS ABDILLAH
 * 2211102296
 * S1IF10G
*/

public class Titik {
    protected double x,y;
    
    public Titik(){}

    public Titik(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void tampil(){
        System.out.println("Titik x     : " + this.x);
        System.out.println("Titik y     : " + this.y);
    }

    public double hitungJarak(Titik T2){
        return Math.sqrt(Math.pow((T2.x-this.x),2)+Math.pow((T2.y-this.y),2));
    }
}
