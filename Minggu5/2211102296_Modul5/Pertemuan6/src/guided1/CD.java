package guided1;
public class CD {
     //define the variables
     String ukuran;
     long hargaCD;
 
     // Konstruktor untuk menginisialisasi atribut CD
     public CD(String ukuran, long hargaCD) {
         this.ukuran = ukuran;
         this.hargaCD = hargaCD;
     }
 
     // Metode untuk mendapatkan harga CD
     public long getHargaCD() {
         return hargaCD;
     }
 
     // Metode untuk mencetak detail CD
     public void cetakCD() {
         System.out.println("Ukuran CD : " + ukuran);
         System.out.println("Harga CD : Rp " + hargaCD);
         System.out.println();
     }
}
