import java.io.*;
public class IfBentuk4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama: ");
        String nama = br.readLine();
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        String jk = br.readLine();
        System.out.print("Masukkan Tinggi Badan Anda: ");
        double tinggi = Double.parseDouble(br.readLine());
        System.out.print("Masukkan Berat Badan Anda: ");
        double berat = Double.parseDouble(br.readLine());
        String statusbbideal = "";
        if (jk.equalsIgnoreCase("P")) {
            if (tinggi>=150 && tinggi<=160) && (berat>=40 && berat<=50) {
                statusbbideal = "Kurus";
            } else if ((tinggi>=150 && tinggi<=160) && (berat>=51 && berat<=70)) {
                statusbbideal = "Ideal";
            } else {
                statusbbideal = "Gemuk";
            }
        } else (jk.equalsIgnoreCase("L")) {
            if ((tinggi>=150 && tinggi<=160) && (berat>=50 && berat<=60)) {
                statusbbideal = "Kurus";
            } else if ((tinggi>=150 && tinggi<=160) && (berat>=61 && berat<=80)) {
                statusbbideal = "Ideal";
            } else {
                statusbbideal = "Gemuk";
            }
        
        System.out.println("Nama Anda: " + nama);
        System.out.println("Jenis Kelamin Anda: " + jk);
        System.out.println("Tinggi Badan Anda: " + tinggi + " cm");
        System.out.println("Berat Badan Anda: " + berat + " kg");
        System.out.println("Status Berat Badan Ideal Anda: " + statusbbideal);
    }
}
}