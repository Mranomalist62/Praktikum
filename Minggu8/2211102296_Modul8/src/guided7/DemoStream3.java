package guided7;
/*
 * MARIO FIRDAUS ABDILLAH
 * 2211102296
 * S1IF10G
*/

import java.io.*;

public class DemoStream3 {
    public static void main(String[] args) throws IOException {
        char data;
        String str = "";
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ketik : ");
        data = (char) buff.read();
        while (data != '\r') {
            str += data;
            data = (char) buff.read();
        }
        System.out.println("Yang diketik : " + str);
        System.out.println("Program Selesai");
    }
}