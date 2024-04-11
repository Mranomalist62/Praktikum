/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2;

/**
 *
 * @author mario - 2211102296
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int pilih = 0;
        Scanner scan = new Scanner(System.in);
        Titik titikUser = new Titik();
        do{
            System.out.println("");
            System.out.println("MENU OPERASI TITIK");
            System.out.println("1.INISIALISASI TITIK");
            System.out.println("2.TAMPIL TITIK");
            System.out.println("3.PERKALIAN SKALAR TITIK");
            System.out.println("4.PERNCERMINAN TERHADAP SUMBU X");
            System.out.println("5.PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6.JARAK ANTARA DUA TITIK");
            System.out.println("0.KELUAR");   
            System.out.println("");
            System.out.print("MASUKAN PILIHAN:");
            pilih = scan.nextInt();
            System.out.println("");


            switch(pilih){
                case 1 :{   System.out.print("Masukkan nilai x: ");
                            int tempX = scan.nextInt();
                            System.out.print("Masukkan nilai y: ");
                            int tempY = scan.nextInt();
                            titikUser.inisialisasiTitik(tempX, tempY);
                            titikUser.tampilTiTik();
                            break;
                        }

                case 2 :{   titikUser.tampilTiTik();
                            break;
                        }

                case 3 :{   System.out.print("Masukkan nilai skalar ");
                            int skalar = scan.nextInt();
                            titikUser.perkalianSkalar(skalar);
                            titikUser.tampilTiTik();
                            break;
                        }

                case 4 :{   titikUser.pencerminanSumbuX();
                            titikUser.tampilTiTik();
                            break;}

                case 5 :{   titikUser.pencerminanSumbuY();
                            titikUser.tampilTiTik();
                            break;}

                case 6 :{   System.out.print("Masukkan nilai x titik 2: ");
                            int tempX = scan.nextInt();
                            System.out.print("Masukkan nilai y titik 2: ");
                            int tempY = scan.nextInt();
                            int tempTitik2[] = {tempX,tempY};
                            int jarak = titikUser.jarak(tempTitik2);
                            System.out.println("Jarak dari dua titik adalah: " 
                            + jarak);
                            break;
                        }
                
                case 0  : {System.out.println("Selamat Tinggal");
                           System.exit(0);}
                
                
                default : {System.out.println("Menu invalid");
                          }
                
               }

            } while(true);
    }
}
