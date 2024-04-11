/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided2;

/**
 *
 * @author mario
 */
public class ProjectBuku {
    private String judul;
    private String pengarang;
    
    public ProjectBuku(){
        this.judul = "Tidak diketahui";
        this.pengarang = "Tidak diketahui";
    }
    
    public ProjectBuku(String judul, String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    void cetakKeLayar(){
        if (judul != null && pengarang != null){
            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
        }
        
        else {
            return;
        }
    }
}
