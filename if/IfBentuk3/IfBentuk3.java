import java.io.*;
public class IfBentuk3 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.readLine();
        System.out.print("Masukkan jurusan anda: ");
        String jurusan = input.readLine();
        int spp = 0;
        if (jurusan.equalsIgnoreCase("Teknik Informatika")) {
            spp = 5000000;
        } else if (jurusan.equalsIgnoreCase("Sistem Informasi")) {
            spp = 4000000;
        } else if (jurusan.equalsIgnoreCase("Manajemen")) {
            spp = 3000000;
        } else if (jurusan.equalsIgnoreCase("Akuntansi")) {
            spp = 2000000;
        } else {
            System.out.println("Jurusan tidak valid.");
            return;
        }
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("SPP: " + spp);
    }
}