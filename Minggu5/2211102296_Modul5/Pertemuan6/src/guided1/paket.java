package guided1;
class Paket extends Buku implements interfaceCD { long hargaPaket; 
interfaceCD interfaceCD;

public Paket(String judul,String pengarang,long hargaBuku,String ukuran,long hargaCD)
    {
        super(judul,pengarang,hargaBuku);
        interfaceCD = new ChildCD(ukuran,hargaCD);
    }
    public void hitungHargaPaket()
    {
        hargaPaket=super.hargaBuku + getHargaCD();
    }
    public void cetakCD(){
        interfaceCD.cetakCD();
    }
    public long getHargaCD(){
        return (interfaceCD.getHargaCD());
    }
    public void cetakPaket(){
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga paket Buku dan CD: Rp "+ hargaPaket +"\n");
    }
}