import java.io.*;
public class InputanBuffer {
    public static void main(String[] fr) throws Exception {
        try{
            BufferedReader datainput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Masukkan nama anda = ");
            String nama = datainput.nextLine();
            System.out.println("Masukkan bilangan ke-1 = ");
            int bil1 = Integer.parseInt(datainput.readLine());
            System.out.println("Masukkan bilangan ke-2 = ");
            int bil2 = Integer.parseInt(datainput.readLine());
            int jumlah = bil1 + bil2;
            int kali = bil1*bil2;
            double bagi = (double) bil1/ (double) bil2;
            System.out.println("Nama Mahasiswa = " + nama);
            System.out.println("Bilangan ke-1 = " + bil1);
            System.out.println("Bilangan ke-2 = "+bil2);
            System.out.println("Hasil penjumlahan = "+jumlah);
            System.out.println("Hasil kali = "+kali);
            System.out.println("Hasil bagi = "+bagi);
        }
       catch{
        
       }
    }
}