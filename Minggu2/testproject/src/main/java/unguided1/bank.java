/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided1;

import java.util.Scanner;
/**
 *
 * @author mario - 2211102296 
 */
public class bank {
    int saldo = 0;
    
    public bank(){
    }
    
    public bank(int saldo){
        this.saldo = saldo;
    }
    
    public void simpanUang(){
        Scanner ScanSetoran = new Scanner(System.in);
        System.out.print("Simpan uang: Rp. ");
        int setoran = ScanSetoran.nextInt();
        this.saldo += setoran;
        System.out.println("Saldo saat ini: Rp. " + this.saldo);
        System.out.println();
    }
    
    public void ambilUang(){
        Scanner ScanDeposit = new Scanner(System.in);
        System.out.print("Ambil uang: Rp. ");
        int deposit = ScanDeposit.nextInt();
        if (this.saldo > deposit){
            this.saldo -= deposit;
            System.out.println("Saldo saat ini: Rp. " + this.saldo);
            System.out.println();
        }
        else {
            System.out.println("Saldo tidak cukup");
            System.out.println();
        }
    }
    
    public void getsaldo(){
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: RP. " + this.saldo);
        System.out.println();
    }
}
