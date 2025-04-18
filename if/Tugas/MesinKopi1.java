import java.util.Scanner;
public class MesinKopi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jenis = "";
        while (true) {
            System.out.print("===== Mesin Kopi Otomatis =====");
            System.out.print("1. Kopi susu");
            System.out.print("2. Kopi hitam");
            System.out.print("3. Kopi cappucino");
            System.out.print("4. Kopi mocha");
            System.out.print("5. Kopi latte");
            System.out.print("6. Kopi Americano");
            System.out.print("7. Kopi espresso");
            int pilihan = in.nextInt();
        if (pilihan == 1) {
            jenis = "Kopi susu";
        } else if (pilihan == 2) {
            jenis = "Kopi hitam";
        } else if (pilihan == 3) {
            jenis = "Kopi cappucino";
        } else if (pilihan == 4) {
            jenis = "Kopi mocha";
        } else if (pilihan == 5) {
            jenis = "Kopi latte";
        } else if (pilihan == 6) {
            jenis = "Kopi Americano";
        } else if (pilihan == 7) {
            jenis = "Kopi espresso";
        } else {
            System.out.println("Pilihan tidak valid!");
            continue; // Skip the rest of the loop and ask for input again
            }
            }
        }
    }
}