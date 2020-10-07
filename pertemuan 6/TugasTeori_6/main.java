/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTeori_6;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.lebar=2;
        pp.panjang=5;
        pp.keliling();
        pp.luas();
        System.out.println("-----------------------------------");
        
        Lingkaran l = new Lingkaran();
        l.r=10;
        l.keliling();
        l.luas();
         System.out.println("-----------------------------------");
        
        Segitiga s = new Segitiga();
        s.alas=4;
        s.tinggi =3;
        s.keliling();
        s.luas();
    }
}
