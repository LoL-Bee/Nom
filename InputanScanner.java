import java.util.*;
public class InputanScanner {
    public static void main(String[] arg) {
        Scanner datainput = new Scanner(System.in);
        System.out.println("Masukkan nama anda = ");
        String nama = datainput.nextLine();
        //konversi string ke int = Integer.parseInt
        //konversi str ke double = Double.parseDouble
        //konversi int/double ke str = String.valueOf()
        System.out.println("Masukkan bilangan ke-1 = ");
        int bil1 = Integer.parseInt(datainput.nextLine());
        System.out.println("Masukkan bilangan ke-2 = ");
        int bil2 = Integer.parseInt(datainput.nextLine());
        int jumlah = bil1 + bil2;
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("Bilangan ke-1 = " + bil1);
        System.out.println("Bilangan ke-2 = "+bil2);
        System.out.println("Hasil penjumlahan = "+jumlah);
    }
}