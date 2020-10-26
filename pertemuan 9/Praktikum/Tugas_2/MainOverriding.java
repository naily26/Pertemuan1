/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HP
 */
public class MainOverriding {
    public static void main(String[] args) {
        System.out.println("--Manusia--");
        Manusia mns = new Manusia();
        mns.bernafas();
        mns.makan();
        
        System.out.println("--Mahasiswa--");
        Manusia mhs = new Mahasiswa();
        mhs.bernafas();
        mhs.makan();
        
        System.out.println("--Dosen--");
        Manusia ds = new Dosen();
        ds.bernafas();
        ds.makan();
        
    }
}
