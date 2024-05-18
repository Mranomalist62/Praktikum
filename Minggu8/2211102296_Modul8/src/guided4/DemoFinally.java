package guided4;

/*
 * MARIO FIRDAUS ABDILLAH
 * 2211102296
 * S1IF10G
*/


public class DemoFinally {
    public static void main (String [] args){
    
    int x = 3;
    int [] arr = {10,11,12};

    try{
    System.out.println(arr[x]);
    System.out.println("Tidak terjadi exception");
    }

    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Terjadi exception");
        System.out.println(arr[x - 4]);
    }finally{
        System.out.println("Program Selesai");
    }
}}