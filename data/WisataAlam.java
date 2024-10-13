/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */

public class WisataAlam extends TempatWisata {
    private String aktivitas;

    public WisataAlam(int id, String nama, String lokasi, String aktivitas) {
        super(id, nama, lokasi, "Alam");
        this.aktivitas = aktivitas;
    }

    public String getAktivitas() {
        return aktivitas;
    }

    public void setAktivitas(String aktivitas) {
        this.aktivitas = aktivitas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Lokasi: " + getLokasi());
        System.out.println("Kategori: Wisata " + getKategori());
        System.out.println("Aktivitas Yang Dapat Dilakukan: " + aktivitas);
        System.out.println("-------------------------");
    }
}
