/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_6;

/**
 *
 * @author HP
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS = 150000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    
    public void getSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    public int getGaji(){
        int totalGaji = TARIF_SKS * jumlahSKS;
        
        return totalGaji;
    }
}
