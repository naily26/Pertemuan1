/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Mesin {
    public String merk;
    private double kecepatan;

    public Mesin() {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public void tambahkecepatan(double a){
        kecepatan += a;
    }
    public void kurangiKecepatan(double a){
        kecepatan -=a;
    }
}
