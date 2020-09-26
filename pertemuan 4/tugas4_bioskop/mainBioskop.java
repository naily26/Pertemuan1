/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4.tugas4_bioskop;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class mainBioskop {
    public static void main(String[] args) { 
        Scanner n = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        daftarFilm();
        
        Film f = new Film("A01");
        Penonton p = new Penonton("217878", "budi");
        Penonton p2 = new Penonton("224352", "nai");
        Studio s = new Studio(f.studio.nomorStudio);
        f.studio.setPenonton(p, 2);
        f.studio.setPenonton(p2, 4);
        System.out.println(f.info());   
        
        Film f2 = new Film("B01");
        Penonton p3 = new Penonton("32324", "wildan");
        Studio s2 = new Studio(f2.studio.nomorStudio);
        f2.studio.setPenonton(p3, 1);
        System.out.println(f2.info());
    }
    static void daftarFilm(){
        System.out.println("DAFTAR FILM HARI INI");
        System.out.println("------------------------------------------");
        System.out.println("Studio 1 : ");
        System.out.println("A01 = Nanti kita cerita tentang hari ini");
        System.out.println("B01 = Milea");
        System.out.println("Studio 2 : ");
        System.out.println("A02 = Dignitate");
        System.out.println("Bo2 = Teman tapi menikah 2");
        System.out.println("------------------------------------------");
    }
}
