/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
public abstract class TempatWisata {
    protected final int id;
    protected String nama;
    protected String lokasi;
    protected final String kategori;

    public TempatWisata(int id, String nama, String lokasi, String kategori) {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
        this.kategori = kategori;
    }

    public final int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public final String getKategori() {
        return kategori;
    }

    public abstract void tampilkanInfo();
}