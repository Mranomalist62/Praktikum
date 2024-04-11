/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided2;

/**
 *
 * @author mario
 */
public class Main {
    public static void main(String[] args){
        ProjectBuku a,b;
        a = new ProjectBuku("Siaga merah","Tio");
        b = new ProjectBuku();
        
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}
