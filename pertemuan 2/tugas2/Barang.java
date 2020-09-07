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
public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        int hrg;
        hrg = (int) (hargaDasar - ((diskon/100)*hargaDasar));
        return hrg;
    }
    public void tampilData(){
        System.out.println("kode : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : "+hargaDasar);
        System.out.println("Diskon : "+diskon+"%");
        System.out.println("Harga jual : "+hitungHargaJual());
    }
}
