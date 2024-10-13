/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */

public class WisataRekreasi extends TempatWisata{
    private String fasilitas;

    public WisataRekreasi(int id, String nama, String lokasi, String fasilitas) {
        super(id, nama, lokasi, "Rekreasi");
        this.fasilitas = fasilitas;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Lokasi: " + getLokasi());
        System.out.println("Kategori: Wisata " + getKategori());
        System.out.println("Fasilitas: " + fasilitas);
        System.out.println("-------------------------");
    }
}
