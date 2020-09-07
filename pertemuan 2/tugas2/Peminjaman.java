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
public class Peminjaman {
    public String id, namaMember, namaGame;
    public int  totalHarga;
    
    public int hitungHarga(int harga, int lamaSewa){
        totalHarga = harga * lamaSewa;
        return totalHarga;
    }
    
    public void cetakInfo(){
        System.out.println("-------------------------------------");
        System.out.println("id : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Harga yg harus dibayar : "+totalHarga);
         System.out.println("-------------------------------------");
    }
}
