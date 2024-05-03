package Pegawai;
/*
 * Mario Firdaus Abdillah
 * 2211102296
 * S1IF10G
 */
public class Direktur extends Pegawai{
    private double gajiDirektur;
    private double dividenSaham;

    public Direktur(String nama, double gaji, double dividen){
        super(nama);
        setGajiDirektur(gaji);
        setDividen(dividen);
    }

    public void setGajiDirektur(double gaji){
        if(gaji>0){
            gajiDirektur=gaji;}

        else{
            gajiDirektur=0;
        }
    }

    public void setDividen(double dividen){
        if(dividen>0){
            dividenSaham = dividen;
        }
        else {
            dividenSaham = 0;
        }
    }

    public String nama(){
        return super.namaPegawai();
    }

    public String jabatan(){
        return "Direktur";
    }

    public double gajiPerbulan(){
        return gajiDirektur;
    }

    public double labaDividen(){
        return dividenSaham;
    }

    public double income(){
        return(gajiDirektur+dividenSaham);
    }

    

}
