/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */

public class WisataBudaya extends TempatWisata {
    private String sejarah;

    public WisataBudaya(int id, String nama, String lokasi, String sejarah) {
        super(id, nama, lokasi, "Budaya");
        this.sejarah = sejarah;
    }

    public String getSejarah() {
        return sejarah;
    }

    public void setSejarah(String sejarah) {
        this.sejarah = sejarah;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Lokasi: " + getLokasi());
        System.out.println("Kategori: Wisata " + getKategori());
        System.out.println("Sejarah Wisata: " + sejarah);
        System.out.println("-------------------------");
    }
}