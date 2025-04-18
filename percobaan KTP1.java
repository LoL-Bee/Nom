import java.util.*;

public class KTPscanner {
    public static void main(String[] agrs) {
        Scanner datainput = new Scanner(System.in);
        String nik;

        // Validasi NIK
        while (true) {
            System.out.println("Masukkan NIK (16 digit): ");
            nik = datainput.nextLine();

            if (nik.matches("\\d{16}")) {
                break;
            } else {
                System.out.println("NIK harus terisi 16 angka. Silahkan coba lagi.");
            }
        }

        System.out.print("Masukkan nama: ");
        String nama = datainput.nextLine();
        System.out.print("Masukkan tempat lahir: ");
        String tempat = datainput.nextLine();

        // Validasi tanggal lahir
        int tanggal;
        while (true) {
            System.out.println("Masukkan tanggal/hari lahir (1-31): ");
            tanggal = datainput.nextInt();
            if (tanggal >= 1 && tanggal <= 31) break;
            System.out.println("Tanggal/hari tidak valid, masukkan angka 1-31.");
        }

        // Validasi bulan lahir
        int bulan;
        while (true) {
            System.out.println("Masukkan bulan lahir (1-12): ");
            bulan = datainput.nextInt();
            if (bulan >= 1 && bulan <= 12) break;
            System.out.println("Bulan tidak valid, masukkan angka 1-12.");
        }

        // Validasi tahun lahir
        int tahun;
        while (true) {
            System.out.println("Masukkan tahun lahir (1995 - 2008): ");
            tahun = datainput.nextInt();
            if (tahun >= 1995 && tahun <= 2008) break;
            System.out.println("Tahun tidak valid, masukkan angka 1995-2008.");
        }

        // Pilihan jenis kelamin
        datainput.nextLine(); // Consume newline left by nextInt()
        String jk = "";
        while (true) {
            System.out.println("Masukkan jenis kelamin anda (L/P): ");
            String pilih = datainput.nextLine().trim().toUpperCase();
            if (pilih.equals("L")) {
                jk = "Laki-laki";
                break;
            } else if (pilih.equals("P")) {
                jk = "Perempuan";
                break;
            } else {
                System.out.println("Pilihan tidak valid, masukkan 'L' atau 'P'.");
            }
        }
        System.out.print("Masukkan golongan darah anda: ");
        String golongan = datainput.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = datainput.nextLine();

        String rtrw;
        while (true) {
            System.out.println("Masukkan RT/RW (contoh : 005/014): ");
            rtrw = datainput.nextLine();

            if (rtrw.matches("\\d{3}/\\d{3}")) {
                break;
            } else {
                System.out.println("RT/RW tidak valid, masukkan format 3 digit/3 digit.");
            }
        }
        System.out.print("Masukkan Kelurahan/Desa: ");
        String kel = datainput.nextLine();
        System.out.print("Masukkan Kecamatan: ");
        String kec = datainput.nextLine();
        System.out.print("Masukkan Agama: ");
        String agm = datainput.nextLine();
        System.out.print("Masukkan Status Pernikahan anda: ");
        String sta = datainput.nextLine();
        System.out.print("Masukkan Pekerjaan: ");
        String pke = datainput.nextLine();
 
        String warga;
        while (true) {
            System.out.print("Masukkan Kewarganegaraan anda (WNI/WNA): ");
            String kwg = datainput.nextLine().trim().toUpperCase();
            if (kwg.equals("WNI")) {
                warga = ("WNI");
                break;
            } else if (kwg.equals("WNA")) {
                warga = ("WNA");
                break;

            } else {
                System.out.println("Kewarganegaraan tidak valid, masukkan 'WNI' atau 'WNA'.");
            }
        }

        // Output KTP
        System.out.println("         KTP         ");
        System.out.println("NIK                 : " + nik);
        System.out.println("Nama                : " + nama);
        System.out.println("Tempat,Tanggal Lahir: " + tempat + ", " + tanggal + "-" + bulan + "-" + tahun);
        System.out.println("Jenis Kelamin       : " + jk);
        System.out.println("Golongan Darah      : " + golongan);
        System.out.println("Alamat              : " + alamat);
        System.out.println("RT/RW               : " + rtrw);
        System.out.println("Kel/Desa            : " + kel);
        System.out.println("Kecamatan           : " + kec);
        System.out.println("Agama               : " + agm);
        System.out.println("Status              : " + sta);
        System.out.println("Kewarganegaraan     : " + warga);
        System.out.println("Pekerjaan           : " + pke);
        System.out.println("Berlaku Hingga      : Seumur Hidup");   
        datainput.close();
    }
}

