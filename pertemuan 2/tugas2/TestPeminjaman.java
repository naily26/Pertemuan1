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
import java.util.Scanner;
public class TestPeminjaman {
    public static void main(String[] args) {
        
        Peminjaman pm = new Peminjaman();
        pm.id="7821";
        pm.namaMember="Gilang";
        pm.namaGame="PES";
        pm.hitungHarga(5000,3);
        pm.cetakInfo();
    }
    
    
}
