import java.io.*;
public class InputanBuffer2 {
    public static void main(String[] ef) {
        BufferedReader datainput = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Masukkan Bilangan ke-1 = ");
            int bil1 = Integer.parseInt(datainput.readLine());
            System.out.println("Masukkan Bilangan ke-2 = ");
            int bil2 = Integer.parseInt(datainput.readLine());
            int bagi = bil1/bil2;
            System.out.println("Hasil Pembagian = "+bagi);
        }
        catch(Exception e) {
            System.out.println("tidak boleh menggunakan = 0 atau huruf");
        }
    }
}