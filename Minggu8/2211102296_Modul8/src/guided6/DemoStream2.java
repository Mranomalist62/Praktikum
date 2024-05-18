package guided6;
/*
 * MARIO FIRDAUS ABDILLAH
 * 2211102296
 * S1IF10G
*/
import java.io.*;

public class DemoStream2 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        int panjang = 0;
        System.out.print("Masukkan data : ");
        try {
            panjang = System.in.read(data);
            // Sistem.in.read mengembalikan panjang karakter yang
            // diinputkan (termasuk enter yang dianggap 2 karakater..)
            System.out.print("Yang anda ketik : ");
            System.out.write(data);
            System.out.println("Panjang Karakter : " + panjang);
            System.out.print("index ke-1 sebnyk 3 : ");
            System.out.write(data, 1, 3);
        } catch (IOException e) {
            System.out.print("Terjadi Exception");
        }
    }
}

/*
 * write mencetak apapun tipe data yang ada, sedangkan print dan println
 * mencetak data ke
 * dalam tipe string
 */
