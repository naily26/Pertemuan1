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
public class Laptop extends Komputer{
    public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String merk, double kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Batrei        = "+jnsBatrei);
    }
    
}
