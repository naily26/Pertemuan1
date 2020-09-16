/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_3.koperasiGetterSetter;

/**
 *
 * @author HP
 */
public class Anggota {
    public String nama;
    public String alamat;
    private float simpanan;
    
    Anggota(String nama, String Alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat (String alamat){
        this.alamat= alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public float getSimpanan(){
        return simpanan;
    }
    public void setor(float uang){
        simpanan +=uang;
    }
    public void pinjam(float uang){
        simpanan -=uang;
    }
}
