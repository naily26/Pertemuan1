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
public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran lk = new Lingkaran();
        lk.phi=3.14;
        lk.r=20;
        System.out.println("Luas : "+lk.hitungLuas());
        System.out.println("Keliling : "+lk.hitungKeliling());
    }
}
