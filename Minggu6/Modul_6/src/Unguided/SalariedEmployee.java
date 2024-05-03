package Unguided;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
public class SalariedEmployee extends employee{
    protected double gaji;

    public SalariedEmployee(){

    }

    public SalariedEmployee(String nama, int NIP, double upahMingguan){
        super(nama, NIP);
        this.gaji = upahMingguan;
    }

    //mengoveride bagian hitung gaji dari abstrak
    @Override
    public double hitungGaji(double upah){
        this.gaji = upah;
        return this.gaji;
    }

    //mengoveride bagian cetak Informasi dari abstrak
    @Override
    public void cetakInformasi(){
        super.cetakInformasi();
        System.out.println("Gaji            :" + (int)this.gaji);
        System.out.println("");
    }
}
