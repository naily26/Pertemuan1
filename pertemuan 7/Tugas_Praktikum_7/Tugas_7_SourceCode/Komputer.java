/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_7;

/**
 *
 * @author HP
 */
public class Komputer {
    public String merk, jnsProsesor;
    public int sizeMemory;
    public double kecProsesor;

    public Komputer() {
    }

    public Komputer(String merk, double kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilData(){
        System.out.println("---------------------------------------");
        System.out.println("Merk                = "+merk);
        System.out.println("Kecepatan prosesor  = "+kecProsesor+" Ghz");
        System.out.println("Size Memory         = "+sizeMemory+" GB");
        System.out.println("Jenis Prosesor      = "+jnsProsesor);
    }
}
