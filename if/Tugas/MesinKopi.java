import java.util.Scanner;   

public class MesinKopi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int uangbayar = 0;
            int harga = 0;
            int total = 0;
            int kembalian = 0;
            int pilihan = 0;
            int susu = 0;
            int gula = 0;

            System.out.println("==== Mesin Kopi ====\n1. kopi susu\n2. kopi Espresso\n3. kopi Americano\n4. kopi Cappucino\n5. kopi Matcha\n6. Cancel\n");
            
            System.out.println("pilih jenis kopi (1-5): ");
            pilihan = input.nextInt();

            if (pilihan == 6) {
                System.out.println("Terima kasih telah mampir di mesin kopi kami :)");
                break; 
            } while (total < harga);
            
            String jenis = "";
            if (pilihan == 1) {
                jenis = "Kopi Susu";
                harga = 10000;
            } else if (pilihan == 2) {
                jenis = "Espresso";
                harga = 15000;
            } else if (pilihan == 3) {
                jenis = "Americano";
                harga = 20000;
            } else if (pilihan == 4) {
                jenis = "Cappuccino";
                harga = 12000;
            } else if (pilihan == 5) {
                jenis = "Kopi Matcha";
                harga = 13000;
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
                continue; 
            }

            System.out.print("Anda memilih " + jenis + "\n");

            if (pilihan == 1) {
                System.out.print("Berapa sendok susu? (1-3): \n");
                susu = input.nextInt();
                System.out.print("" + susu + " sendok susu untuk kopi anda\n");
            } else {
                System.out.print("Berapa sendok gula? (1-3): \n");
                gula = input.nextInt();
                System.out.print("" + gula + " sendok gula untuk kopi anda\n");
            }
            
            do {
                System.out.print("Masukkan uang pembayaran: ");
                uangbayar = input.nextInt();
                total += uangbayar;

                if (total < harga) {
                    System.out.println("Uang anda kurang, silahkan tambah Rp. " + (harga-total) + " lagi" );
                }
            } while (total < harga);

                if (total > harga) {
                    kembalian = total - harga;
                    System.out.println("Pembayaran berhasil, uang kembalian anda: " + kembalian);
                } else {
                    System.out.println("Uang pas, terimakasih!");
                }
                System.out.print("Apakah Anda ingin membeli kopi lagi? (y/n): ");
                
                char lanjut = input.next().charAt(0);
                while (lanjut != 'y' && lanjut != 'Y' && lanjut != 'n' && lanjut != 'N') {
                    System.out.print("Input tidak valid, silakan masukkan 'y' atau 'n': ");
                    lanjut = input.next().charAt(0);
                }   
                if (lanjut == 'n' || lanjut == 'N') {
                    System.out.println("Terima kasih, selamat nikmati ☕:)");
                    break;
                }input.close();
            }
            }
        }

    
    