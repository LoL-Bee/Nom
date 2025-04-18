import java.util.Scanner;

public class IfSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama customer: ");
        String nama = input.nextLine();
        System.out.print("Masukkan total belanja: ");
        int total = Integer.parseInt(input.nextLine());
        double diskon = 0;
        double totalbayar = 0;

        if (total >= 100000) {
            diskon = 0.1 * total;
            totalbayar = total - diskon;

            System.out.println("Nama Customer: " + nama);
            System.out.println("Total Belanja: " + total);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total Bayar: " + totalbayar);
        } else {
            totalbayar = total;
            System.out.println("Nama Customer: " + nama);
            System.out.println("Total Belanja: " + total);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total Bayar: " + totalbayar);
        }

        input.close();
    }
}