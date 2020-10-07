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
public class DaftarGaji {
    public Pegawai[] listPegawai;
    public int jumlahPegawai=0;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
    }
    
    public void addPegawai(Pegawai pegawai){
        listPegawai[jumlahPegawai] = pegawai;
        jumlahPegawai++;
    }
    public void printSemuaGaji(){
        for (int i=0;i<jumlahPegawai;i++){
            System.out.println("-----------------------------------");
            System.out.println("Nama : " + listPegawai[i].getNama());
            System.out.println("Jumlah gaji : " + listPegawai[i].getGaji());           
        }
        System.out.println("-----------------------------------");
    }
}
