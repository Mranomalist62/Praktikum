/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided1;

/**
 *
 * @author mario
 */
public class buku { //untuk mendefinisikan kelas
    //deklarasi variabel
    private String Judul;
    private String pengarang;
    private int jumlah;
    
    public void setNilai(String Judul, String pengarang, int jumlah){
        this.Judul = Judul;
        this.pengarang = pengarang;
        this.jumlah  = jumlah;
    }
    
    void cetakKeLayar(){
        System.out.println("Judul: " + Judul);
        System.out.println("pengarang: " + pengarang);
        System.out.println("jumlah: " + jumlah);
    }
    
}
