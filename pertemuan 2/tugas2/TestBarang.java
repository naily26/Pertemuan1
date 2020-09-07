/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author HP
 */
public class TestBarang {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode="MG22";
        brg.namaBarang="Minyak Goreng Sunco 600 Ml";
        brg.hargaDasar=20000;
        brg.diskon=20;
        
        brg.hitungHargaJual();
        brg.tampilData();
    }
}
