package guided5;

/*
 * MARIO FIRDAUS ABDILLAH
 * 2211102296
 * S1IF10G
*/

import java.io.IOException;

public class DemoStream1 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        System.out.print("Masukkan data : ");
        try {
            System.in.read(data);
        } catch (IOException e) {
            System.out.print("Terjadi Exception");
        }
        System.out.print("Yang anda ketik : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char)data[i]);
            // (cahr) diatas disebut posting yakni untuk mengubah format menjadi char
        }
    }
}
