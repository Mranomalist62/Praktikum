package Guided2;

/*
 * MARIO FIRDAUS ABDILLAH
 * 2211102296
 * S1IF10G
*/

class Perusahaan {
    private String namaPer;
    private Pegawai peg[]; // Agregasi antara pegawai dan perusahaan
    private int counter;

    public Perusahaan(String namaPer) {
        this.namaPer = namaPer;
        counter = 0;
        peg = new Pegawai[3];
        System.out.println("Konstruktor perusahaan dijalankan...");
    }

    // Relasi agregasi antara pegawai dan perusahaan
    public void insertPegawai(Pegawai p) {
        peg[counter] = p;
        counter++;
    }

public void tampilPer(){
    System.out.println("Perusahaan "+namaPer+" memiliki pegawai : ");
    for(int i=0; i<counter; i++)
        {
            peg[i].tampilPeg();
        }
    }
}
