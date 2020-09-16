/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugs3;

/**
 *
 * @author HP
 */
public class Anggota {
   private int   limitPeminjaman, jumlahPeminjaman;
   private String nama, nomorKTP;
   
   Anggota(String nomorKTP, String nama, int limitPeminjaman){
       this.nama = nama;
       this.nomorKTP = nomorKTP;
       this.jumlahPeminjaman = 0;
       this.limitPeminjaman = limitPeminjaman;
   }
   
   public String getNomorKTP(){
       return nomorKTP;
   }
   public void setNomorKTP(String newNomor){
       nomorKTP = newNomor;
   }
   public String getNama(){
       return nama;
   }
   public  void setNama(String newNama){
       nama = newNama;
   }
   public int getLimitPinjaman(){
       return limitPeminjaman;
   }
   public void setLimitPeminjaman(int newLimit){
       limitPeminjaman = newLimit;
   }
   public int getJumlahPinjaman(){
       return jumlahPeminjaman;
   }
   public void setJumlahPeminjaman(int newJumlah){
       jumlahPeminjaman= newJumlah;
   }
   public void pinjam(int pinjam){
       if(pinjam <= limitPeminjaman){
           jumlahPeminjaman = pinjam;
       } else {
           System.out.println("Maaf, Jumlah peminjaman melebihi limit");
       }
   }
   public void angsur(int angsur){
       int min = (int) (0.1 * jumlahPeminjaman);
       if (angsur >= min){
       jumlahPeminjaman -= angsur;
       } else {
           System.out.println("Maaf angsuran harus 10% dari jumlah peminjaman");
       }
   }
}
