/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apk;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Main {
   
    public static void main(String[] args) {
        ManajemenMahasiswa manager = new ManajemenMahasiswa();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Apl1"
                    + "1ikasi Data Mahasiswa:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    manager.tambahData();
                    break;
                case 2:
                    manager.cariMahasiswa();
                    break;
                case 3:
                    manager.editData();
                    break;
                case 4:
                    manager.hapusData();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}


