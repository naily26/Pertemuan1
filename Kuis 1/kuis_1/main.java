/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_1;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        Wanita w = new Wanita();
        
        Pria p = new Pria();
        p.setNama("Wildan");
        p.setUmur(24);
        p.setDewasa(true);
        p.cekDewasa();
        p.setIstri(w);
        
        Manusia anak = new Manusia(1,"Randy",false);
        
        w.setNama("Naily");
        w.setUmur(21);
        w.setDewasa(true);
        w.cekDewasa(0);
        w.setSuami(p);
        w.setAnak(anak);
        
        System.out.println(p.info());
        System.out.println(w.info());
        
        System.out.println("contoh yang belum menikah");
        System.out.println("-----------------------------------");
        Pria p1 = new Pria();
        p1.setNama("Zaid");
        p1.setUmur(15);
        p1.setDewasa(false);
        p1.cekDewasa();
        
        System.out.println(p1.info());
    }
}
