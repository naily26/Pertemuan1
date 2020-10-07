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
public class main {
    public static void main(String[] args) {
       Dosen d = new Dosen("7854", "Wildan Alamsyah", "Jln. Kebagusan");
       d.jumlahSKS=15;
       
       Dosen d2 = new Dosen("7755", "Rangga Azof", "Jln. Jawa no.32");
       d2.jumlahSKS=20;
       
       DaftarGaji dg = new DaftarGaji(2);
       dg.addPegawai(d);
       dg.addPegawai(d2);
       dg.printSemuaGaji();
    }
}
