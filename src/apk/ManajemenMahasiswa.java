/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apk;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    
    public void tambahData() {
        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(npm, nama, alamat);
        daftarMahasiswa.add(mahasiswa);
        System.out.println("Data mahasiswa berhasil ditambahkan!");
    }

    
    public void cariMahasiswa() {
        System.out.print("Masukkan NPM yang dicari: ");
        String npm = scanner.nextLine();

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getNpm().equals(npm)) {
                System.out.println("Mahasiswa ditemukan: " + m);
                return;
            }
        }
        System.out.println("Mahasiswa dengan NPM " + npm + " tidak ditemukan.");
    }

    
    public void editData() {
        System.out.print("Masukkan NPM mahasiswa yang akan diedit: ");
        String npm = scanner.nextLine();

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getNpm().equals(npm)) {
                System.out.print("Masukkan Nama baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan Alamat baru: ");
                String alamatBaru = scanner.nextLine();

                m.setNama(namaBaru);
                m.setAlamat(alamatBaru);
                System.out.println("Data mahasiswa berhasil diedit!");
                return;
            }
        }
        System.out.println("Mahasiswa dengan NPM " + npm + " tidak ditemukan.");
    }

    // Method untuk menghapus data mahasiswa berdasarkan NPM
    public void hapusData() {
        System.out.print("Masukkan NPM mahasiswa yang akan dihapus: ");
        String npm = scanner.nextLine();

        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            if (daftarMahasiswa.get(i).getNpm().equals(npm)) {
                daftarMahasiswa.remove(i);
                System.out.println("Data mahasiswa berhasil dihapus!");
                return;
            }
        }
        System.out.println("Mahasiswa dengan NPM " + npm + " tidak ditemukan.");
    }

    
    public void tampilkanSemua() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Mahasiswa m : daftarMahasiswa) {
                System.out.println(m);
            }
        }
    }
}


