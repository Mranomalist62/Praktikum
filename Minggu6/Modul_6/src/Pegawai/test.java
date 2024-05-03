package Pegawai;

import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
        Pegawai pgw;

        String output = "";
        Direktur d = new Direktur("Wahyu", 12000000.00, 7500000.00);
        DecimalFormat digitPresisi = new DecimalFormat("0.00");
        pgw = d;

        System.out.println("\nDEMO INHERITANS, ENKAPSULASI, POLIMORFI");
        System.out.println("-----------------------------------\n");
        System.out.println("Nama    : " + d.namaPegawai() + "\n" +
                           "Jabatan : " + d.jabatan() + "\n" + 
                           "Gaji    : " + digitPresisi.format(d.gajiPerbulan())+"\n"+
                           "Dividen : " + digitPresisi.format(d.labaDividen())+"\n"+
                           "Total   : " + digitPresisi.format(d.income()) + "\n");
                           System.exit( 0);
    }
}
