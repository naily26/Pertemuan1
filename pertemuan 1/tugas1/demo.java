/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author HP
 */
public class demo {
    public static void main(String[] args) {
        MesinCuci mc = new MesinCuci();
        mc.setMerk("LG");
        mc.daya=250;
        mc.waktuPenggunaan=120;
        mc.hitungBiaya();
        mc.setJenis("2 tabung");
        mc.setKapasitas(6);
        mc.setFitur("Water filter, high feet, brushing board,");
        mc.cetakInfo();
        
        KipasAngin ka = new KipasAngin();
        ka.setMerk("Polytron");
        ka.daya=110;
        ka.waktuPenggunaan=360;
        ka.hitungBiaya();
        ka.setModel("Kipas angin duduk");
        ka.setDiameter(16);
        ka.jmlPilihanKecepatan=3;
        ka.Pilihankecepatan=2;
        ka.kurangiKecepatan();
        ka.cetakInfo();
        
        lampu lmp = new lampu();
        lmp.setMerk("Philips");
        lmp.setAmpere(3);
        lmp.setVoltase(110);
        lmp.hitungDaya();
        lmp.kurangiDaya(20);
        lmp.cetakInfo();
        
        hangerHijab HH = new hangerHijab();
        HH.setJenisHijab("pasmina");
        HH.setJumlah(5);
        HH.ambilHijab(1);
        HH.tambahJumlahhijab(4);
        HH.cetakInfo();
        
    }
}
