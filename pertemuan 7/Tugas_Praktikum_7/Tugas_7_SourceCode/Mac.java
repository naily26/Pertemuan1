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
public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String security) {
        this.security = security;
    }

    public Mac(String merk, double kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security            = "+security);
    }
}
