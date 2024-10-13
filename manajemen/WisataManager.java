/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package manajemen;

/**
 *
 * @author ASUS
 */
import data.TempatWisata;

public interface WisataManager {
    void tambahWisata(TempatWisata wisata);
    void tampilkanWisata();
    void ubahWisata(String nama, TempatWisata wisataBaru);
    void hapusWisata(String nama);
}