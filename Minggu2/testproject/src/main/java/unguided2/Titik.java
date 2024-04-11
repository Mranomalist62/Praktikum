/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2;
import java.lang.Math;

/**
 *
 * @author mario - 2211102296
 */
public class Titik {
    int x = 0 ,y = 0;
    
    public Titik(){
    }
    
    public void inisialisasiTitik(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void tampilTiTik(){
        System.out.println("Koordinat Titik saat ini: (" 
                           + this.x + ", " + this.y + ")");
    }
    
    public void perkalianSkalar(int skalar){
        this.x *= skalar;
        this.y *= skalar;
    }
    
    public void pencerminanSumbuX(){
        this.y *= -1;
    }
    
    public void pencerminanSumbuY(){
        this.x *= -1;
    }
    
    public int jarak(int[] dots){
        double jarakTemp = Math.sqrt(Math.pow(dots[0] - x,2)
                         + Math.pow(dots[1] - y,2));
        int jarak = (int)jarakTemp;
        return jarak;
    }
}
