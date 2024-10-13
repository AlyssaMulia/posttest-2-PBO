/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen;

/**
 *
 * @author ASUS
 */

import data.TempatWisata;
import data.WisataAlam;
import data.WisataBudaya;
import data.WisataRekreasi;
import java.util.ArrayList;
import java.util.Scanner;

public final class SistemWisata implements WisataManager {
    private static final ArrayList<TempatWisata> daftarWisata = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static int idCounter = 1;

    public static void tampilkanMenu() {
        SistemWisata sistem = new SistemWisata();
        int pilihan;
        do {
            System.out.println("\nSelamat Datang Di Sistem Manajemen");
            System.out.println("===   Wisata Kota Samarinda   ===");
            System.out.println("1. Tambah Wisata");
            System.out.println("2. Tampilkan Wisata");
            System.out.println("3. Ubah Wisata");
            System.out.println("4. Hapus Wisata");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    sistem.tambahWisata();
                    break;
                case 2:
                    sistem.tampilkanWisata();
                    break;
                case 3:
                    sistem.ubahWisata();
                    break;
                case 4:
                    sistem.hapusWisata();
                    break;
                case 5:
                    System.out.println("Keluar dari sistem...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    @Override
    public void tambahWisata(TempatWisata wisata) {
        daftarWisata.add(wisata);
        System.out.println("Wisata berhasil ditambahkan.");
    }

    public void tambahWisata() {
        System.out.println("\n=== Tambah Wisata Baru ===");
        System.out.println("Kategori wisata ");
        System.out.println("1. Wisata Alam");
        System.out.println("2. Wisata Budaya");
        System.out.println("3. Wisata Rekreasi");
        System.out.println("pilih kategori wisata (1/2/3): ");
        int jenisWisata = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan Nama Wisata: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Lokasi Wisata: ");
        String lokasi = scanner.nextLine();

        TempatWisata wisata;
        if (jenisWisata == 1) {
            System.out.print("Masukkan Aktivitas Yang Dapat Dilakukan: ");
            String aktivitas = scanner.nextLine();
            wisata = new WisataAlam(idCounter++, nama, lokasi, aktivitas);
        } else if (jenisWisata == 2) {
            System.out.print("Masukkan Sejarah Wisata: ");
            String sejarah = scanner.nextLine();
            wisata = new WisataBudaya(idCounter++, nama, lokasi, sejarah);
        } else { 
            System.out.print("Masukkan Fasilitas Yang Disediakan: ");
            String fasilitas = scanner.nextLine();
            wisata = new WisataRekreasi(idCounter++, nama, lokasi, fasilitas);
        }
            tambahWisata(wisata);
        }

    @Override
    public void tampilkanWisata() {
        System.out.println("\n=== Daftar Tempat Wisata ===");
        if (daftarWisata.isEmpty()) {
            System.out.println("Belum ada wisata yang terdaftar.");
        } else {
            for (TempatWisata wisata : daftarWisata) {
                wisata.tampilkanInfo();
            }
        }
    }

    @Override
    public void ubahWisata(String nama, TempatWisata wisataBaru) {
        TempatWisata wisataLama = getTempatWisataByName(nama);
        if (wisataLama != null) {
            int index = daftarWisata.indexOf(wisataLama);
            daftarWisata.set(index, wisataBaru);
            System.out.println("Wisata berhasil diubah.");
        } else {
            System.out.println("Wisata dengan nama tersebut tidak ditemukan.");
        }
    }

    public void ubahWisata() {
        System.out.println("\n=== Ubah Wisata ===");
        tampilkanWisata();
        
        if (!daftarWisata.isEmpty()) {
            System.out.print("Masukkan nama wisata yang ingin diubah: ");
            String nama = scanner.nextLine();
            TempatWisata wisataLama = getTempatWisataByName(nama);

            if (wisataLama != null) {
                System.out.print("Masukkan nama baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan lokasi baru: ");
                String lokasiBaru = scanner.nextLine();

                TempatWisata wisataBaru;
                if (wisataLama instanceof WisataAlam) {
                    System.out.print("Masukkan jenis aktivitas baru: ");
                    String aktivitasBaru = scanner.nextLine();
                    wisataBaru = new WisataAlam(wisataLama.getId(), namaBaru, lokasiBaru, aktivitasBaru);
            } else if (wisataLama instanceof WisataBudaya) {
                System.out.print("Masukkan sejarah wisata baru: ");
                String sejarahBaru = scanner.nextLine();
                wisataBaru = new WisataBudaya(wisataLama.getId(), namaBaru, lokasiBaru, sejarahBaru);
            } else {
                System.out.print("Masukkan fasilitas baru: ");
                String fasilitasBaru = scanner.nextLine();
                wisataBaru = new WisataRekreasi(wisataLama.getId(), namaBaru, lokasiBaru, fasilitasBaru);
            }

                ubahWisata(nama, wisataBaru);
            } else {
                System.out.println("Wisata dengan nama tersebut tidak ditemukan.");
            }
        }
    }

    @Override
    public void hapusWisata(String nama) {
        TempatWisata wisata = getTempatWisataByName(nama);
        if (wisata != null) {
            daftarWisata.remove(wisata);
            System.out.println("Wisata berhasil dihapus.");
        } else {
            System.out.println("Wisata dengan nama tersebut tidak ditemukan.");
        }
    }

    public void hapusWisata() {
        System.out.println("\n=== Hapus Wisata ===");
        tampilkanWisata();
        
        if (!daftarWisata.isEmpty()) {
            System.out.print("Masukkan nama wisata yang ingin dihapus: ");
            String nama = scanner.nextLine();
            hapusWisata(nama);
        }
    }

    private TempatWisata getTempatWisataByName(String nama) {
        for (TempatWisata wisata : daftarWisata) {
            if (wisata.getNama().equalsIgnoreCase(nama)) {
                return wisata;
            }
        }
        return null;
    }
}